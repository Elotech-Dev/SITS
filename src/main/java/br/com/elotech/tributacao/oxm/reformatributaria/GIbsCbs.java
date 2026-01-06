package br.com.elotech.tributacao.oxm.reformatributaria;

public class GIbsCbs {

    private Integer cst;

    private Integer cclassTrib;

    private Integer ccredPres;

    private TributacaoRegular tributacaoRegular;

    private DiferimentoIbsCbs diferimentoIbsCbs;

    public Integer getCst() {
        return cst;
    }

    public void setCst(Integer cst) {
        this.cst = cst;
    }

    public Integer getCclassTrib() {
        return cclassTrib;
    }

    public void setCclassTrib(Integer cclassTrib) {
        this.cclassTrib = cclassTrib;
    }

    public Integer getCcredPres() {
        return ccredPres;
    }

    public void setCcredPres(Integer ccredPres) {
        this.ccredPres = ccredPres;
    }

    public TributacaoRegular getTributacaoRegular() {
        return tributacaoRegular;
    }

    public void setTributacaoRegular(TributacaoRegular tributacaoRegular) {
        this.tributacaoRegular = tributacaoRegular;
    }

    public DiferimentoIbsCbs getDiferimentoIbsCbs() {
        return diferimentoIbsCbs;
    }

    public void setDiferimentoIbsCbs(DiferimentoIbsCbs diferimentoIbsCbs) {
        this.diferimentoIbsCbs = diferimentoIbsCbs;
    }
}
