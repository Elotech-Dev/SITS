package br.com.elotech.tributacao.oxm.reformatributaria;

import br.com.elotech.tributacao.oxm.nfse.CpfCnpj;
import br.com.elotech.tributacao.oxm.nfse.Endereco;

public class Destinatario {

    private String nif;

    private Integer cnaoNif;


    private String xnome;

    private Integer fone;

    private String email;

    private Endereco endereco;

    private CpfCnpj cpfCnpj;


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Integer getCnaoNif() {
        return cnaoNif;
    }

    public void setCnaoNif(Integer cnaoNif) {
        this.cnaoNif = cnaoNif;
    }

    public String getXnome() {
        return xnome;
    }

    public void setXnome(String xnome) {
        this.xnome = xnome;
    }

    public Integer getFone() {
        return fone;
    }

    public void setFone(Integer fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public CpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(CpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
