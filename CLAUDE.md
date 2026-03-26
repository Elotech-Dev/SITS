# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

SITS (WSProxy) is a Java desktop application that acts as a proxy for NFSe (Nota Fiscal de Serviços Eletrônica — Brazilian Electronic Service Invoice) web services. It reads XML documents from a local folder, validates them against XSD schemas, digitally signs them using PKCS12 certificates, submits them to a remote SOAP web service, and stores responses locally.

## Build & Run

```bash
# Build fat JAR
mvn clean package

# Run application (processes XML files from configured folder)
java -jar target/WSProxy-3.1.1-SNAPSHOT-jar-with-dependencies.jar

# Open configuration GUI
java -jar target/WSProxy-3.1.1-SNAPSHOT-jar-with-dependencies.jar --config

# Run tests (JUnit 4 is available but no tests exist yet)
mvn test
mvn test -Dtest=ClassName   # single test class
```

Java 8 is required (compiler target: 1.8).

## Architecture

**Main execution path:**

```
App.main()
  └─ ServiceFactory.createService().send()
      └─ ElotechService.send()
          ├─ Reads XML files from ISS.dirToSend
          ├─ Detects NFSe version (v1.2 or v2.03) via AbstractService
          ├─ Unmarshals XML → Java via Castor
          ├─ Sends signed SOAP request via Spring WS WebServiceTemplate
          ├─ Marshals response → XML
          └─ Moves files to ISS.dirSent / ISS.dirReceived
```

**Key layers:**

| Package | Role |
|---|---|
| `br.com.elotech.sits.WSProxy` | Entry point (`App.java`) |
| `br.com.elotech.sits.service` | `Service` interface, `AbstractService`, `ElotechService`, `ServiceFactory` |
| `br.com.elotech.sits.action` | CLI commands: `Config`, `Setup` |
| `br.com.elotech.sits.form` / `config/form` / `config/dialog` | Swing GUI |
| `br.com.elotech.tributacao.oxm.nfse*` | Data model classes for NFSe v1.2 and v2.03 |
| `br.com.elotech.tributacao.oxm.reformatributaria` | Tax reform (IBS/CBS) data models |
| `br.com.elotech.tributacao.castor` | Castor XML handlers (enums, dates) |
| `br.com.elotech.spring.ws` | Spring WS security / SOAP interceptors |

**Spring and XML binding:**

- Spring context is bootstrapped from `src/main/resources/clientWs.xml`, which wires `WebServiceTemplate`, Castor marshallers, and WS-Security interceptors.
- Castor handles XML↔Java binding. Mappings live in:
  - `castor-mapping.xml` — NFSe v1.2 (1488 lines)
  - `castor-wsnfse203-mapping.xml` — NFSe v2.03 (2116 lines)
- XSD validation schemas: `nfse_v1_2.xsd` (v1.2) and `nfse_v2_03.xsd` (v2.03).

**NFSe operations modelled:**

`EnviarLoteRps`, `ConsultarNfseRps`, `ConsultarLoteRps`, `ConsultarNfseFaixa`, `CancelarNfse`, `SubstituirNfse`, plus tax-reform variants (IBS/CBS).

## Runtime Configuration

The application reads `${SITS_HOME}/client.properties` at startup. Key properties:

```properties
ISS.url=<SOAP endpoint>
ISS.serviceType=elotech
ISS.dirToSend=<folder with XML files to send>
ISS.dirSent=<folder for processed files>
ISS.dirReceived=<folder for responses>
ISS.key.path=<PKCS12 keystore path>
ISS.key.password=<keystore password>
ISS.key.alias=<certificate alias>
ISS.key.type=PKCS12
ISS.key.trustStorePassword=<trust store password>
```

## Key Dependencies

- **Spring Framework 3.1.2** — DI, WS template
- **Spring WS 2.1.0** — SOAP client + WS-Security (WSS4J signing)
- **Castor 1.4.1** — XML data binding
- **Xerces 2.10.0** — XML parser
- **Apache Commons IO 2.4** — file operations
- **JUnit 4.8.2** — test scope (no tests yet)
