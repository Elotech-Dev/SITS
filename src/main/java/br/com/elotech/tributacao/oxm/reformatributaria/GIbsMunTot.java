package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class GIbsMunTot {
    private BigDecimal vDifMun;


    private BigDecimal vIBSMun;

    public BigDecimal getvDifMun() {
        return vDifMun;
    }

    public void setvDifMun(BigDecimal vDifMun) {
        this.vDifMun = vDifMun;
    }

    public BigDecimal getvIBSMun() {
        return vIBSMun;
    }

    public void setvIBSMun(BigDecimal vIBSMun) {
        this.vIBSMun = vIBSMun;
    }
}
