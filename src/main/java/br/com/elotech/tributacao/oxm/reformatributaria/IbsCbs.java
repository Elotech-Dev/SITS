package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class IbsCbs {

    private Integer localidadeIncid_c;

    private String localidadeIncid_x;

    private BigDecimal redutor;

    private ValoresIbsCbs valoresIbsCbs;

    private TotCIbs totCIbs;

    public Integer getLocalidadeIncid_c() {
        return localidadeIncid_c;
    }

    public void setLocalidadeIncid_c(Integer localidadeIncid_c) {
        this.localidadeIncid_c = localidadeIncid_c;
    }

    public String getLocalidadeIncid_x() {
        return localidadeIncid_x;
    }

    public void setLocalidadeIncid_x(String localidadeIncid_x) {
        this.localidadeIncid_x = localidadeIncid_x;
    }

    public BigDecimal getRedutor() {
        return redutor;
    }

    public void setRedutor(BigDecimal redutor) {
        this.redutor = redutor;
    }

    public ValoresIbsCbs getValoresIbsCbs() {
        return valoresIbsCbs;
    }

    public void setValoresIbsCbs(ValoresIbsCbs valoresIbsCbs) {
        this.valoresIbsCbs = valoresIbsCbs;
    }

    public TotCIbs getTotCIbs() {
        return totCIbs;
    }

    public void setTotCIbs(TotCIbs totCIbs) {
        this.totCIbs = totCIbs;
    }
}
