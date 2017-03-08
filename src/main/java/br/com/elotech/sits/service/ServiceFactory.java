/* 
 * Copyright 2016 ELOTECH GESTAO PUBLICA LTDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package br.com.elotech.sits.service;

import javax.annotation.Resource;

import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import br.com.elotech.sits.exception.InvalidValue;

public class ServiceFactory {
	
	@Resource
	private CastorMarshaller castorMarshaller;
	
	@Resource
	private CastorMarshaller castorMarshallerNfse203;

	@Resource
	private String dirToSend;

	@Resource
	private String dirReceived;

	@Resource
	private String dirSent;

	@Resource
	private WebServiceTemplate webServiceTemplate;
	
	@Resource
	private WebServiceTemplate webServiceVersao203Template;

	@Resource
	private String serviceType;
	
	public void setCastorMarshaller(CastorMarshaller castorMarshaller) {
		this.castorMarshaller = castorMarshaller;
	}
	
	public void setCastorMarshallerNfse203(CastorMarshaller castorMarshallerNfse203) {
		this.castorMarshallerNfse203 = castorMarshallerNfse203;
	}

	public void setDirToSend(String dirToSend) {
		this.dirToSend = dirToSend;
	}

	public void setDirReceived(String dirReceived) {
		this.dirReceived = dirReceived;
	}

	public void setDirSent(String dirSent) {
		this.dirSent = dirSent;
	}

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}

	public void setWebServiceVersao203Template(WebServiceTemplate webServiceVersao203Template) {
		this.webServiceVersao203Template = webServiceVersao203Template;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getServiceType() {
		return serviceType;
	}

	public ServiceFactory() {
	}
	
	public Service createService() throws InvalidValue {
		
		if (serviceType.equalsIgnoreCase("elotech")) {
			return createElotechService();
		} else {
			throw new InvalidValue(String.format("Tipo de serviço \"%s\" inválido!", serviceType));
		}
		
	}

	private ElotechService createElotechService() {
		return attrDeps(new ElotechService());
	}

	private <T extends AbstractService> T attrDeps(T service) {
		
		service.castorMarshaller = castorMarshaller;
		service.castorMarshallerNfse203 = castorMarshallerNfse203;
		service.dirReceived = dirReceived;
		service.dirToSend = dirToSend;
		service.dirSent = dirSent;
		service.webServiceTemplate = webServiceTemplate;
		service.webServiceVersao203Template = webServiceVersao203Template;
		
		return service;
	}

}
