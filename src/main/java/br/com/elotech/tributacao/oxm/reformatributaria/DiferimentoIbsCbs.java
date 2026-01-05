package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class DiferimentoIbsCbs {

    private BigDecimal pdifUF;

    private BigDecimal pdifMun;

    private BigDecimal pdifCBS;

    public BigDecimal getPdifUF() {
        return pdifUF;
    }

    public void setPdifUF(BigDecimal pdifUF) {
        this.pdifUF = pdifUF;
    }

    public BigDecimal getPdifMun() {
        return pdifMun;
    }

    public void setPdifMun(BigDecimal pdifMun) {
        this.pdifMun = pdifMun;
    }

    public BigDecimal getPdifCBS() {
        return pdifCBS;
    }

    public void setPdifCBS(BigDecimal pdifCBS) {
        this.pdifCBS = pdifCBS;
    }
}
