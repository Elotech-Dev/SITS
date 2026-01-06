package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class GIbsUfTot {
    private BigDecimal vDifUf;

    private BigDecimal vIBsUf;

    public BigDecimal getvDifUf() {
        return vDifUf;
    }

    public void setvDifUf(BigDecimal vDifUf) {
        this.vDifUf = vDifUf;
    }

    public BigDecimal getvIBsUf() {
        return vIBsUf;
    }

    public void setvIBsUf(BigDecimal vIBsUf) {
        this.vIBsUf = vIBsUf;
    }
}
