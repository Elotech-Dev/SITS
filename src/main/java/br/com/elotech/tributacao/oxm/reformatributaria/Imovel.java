package br.com.elotech.tributacao.oxm.reformatributaria;

import br.com.elotech.tributacao.oxm.nfse.Endereco;

public class Imovel {

    private String inscImobFisc;

    private String ccIB;

    private Endereco endereco;

    public String getInscImobFisc() {
        return inscImobFisc;
    }

    public void setInscImobFisc(String inscImobFisc) {
        this.inscImobFisc = inscImobFisc;
    }

    public String getCcIB() {
        return ccIB;
    }

    public void setCcIB(String ccIB) {
        this.ccIB = ccIB;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
