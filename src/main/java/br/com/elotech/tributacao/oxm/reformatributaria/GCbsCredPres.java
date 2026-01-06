package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class GCbsCredPres {

    private BigDecimal pCredPresCbs;

    private BigDecimal vCredPresCbs;

    private BigDecimal vDifCbs;

    private BigDecimal vCbs;

    public BigDecimal getpCredPresCbs() {
        return pCredPresCbs;
    }

    public void setpCredPresCbs(BigDecimal pCredPresCbs) {
        this.pCredPresCbs = pCredPresCbs;
    }

    public BigDecimal getvCredPresCbs() {
        return vCredPresCbs;
    }

    public void setvCredPresCbs(BigDecimal vCredPresCbs) {
        this.vCredPresCbs = vCredPresCbs;
    }

    public BigDecimal getvDifCbs() {
        return vDifCbs;
    }

    public void setvDifCbs(BigDecimal vDifCbs) {
        this.vDifCbs = vDifCbs;
    }

    public BigDecimal getvCbs() {
        return vCbs;
    }

    public void setvCbs(BigDecimal vCbs) {
        this.vCbs = vCbs;
    }
}
