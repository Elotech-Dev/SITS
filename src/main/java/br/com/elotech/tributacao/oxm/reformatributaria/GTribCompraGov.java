package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class GTribCompraGov {

    private BigDecimal pIbsUf;

    private BigDecimal vIbsuF;

    private BigDecimal pIbsMun;

    private BigDecimal vIbsMun;

    private BigDecimal pCbs;

    private BigDecimal vCbs;

    public BigDecimal getpIbsUf() {
        return pIbsUf;
    }

    public void setpIbsUf(BigDecimal pIbsUf) {
        this.pIbsUf = pIbsUf;
    }

    public BigDecimal getvIbsuF() {
        return vIbsuF;
    }

    public void setvIbsuF(BigDecimal vIbsuF) {
        this.vIbsuF = vIbsuF;
    }

    public BigDecimal getpIbsMun() {
        return pIbsMun;
    }

    public void setpIbsMun(BigDecimal pIbsMun) {
        this.pIbsMun = pIbsMun;
    }

    public BigDecimal getvIbsMun() {
        return vIbsMun;
    }

    public void setvIbsMun(BigDecimal vIbsMun) {
        this.vIbsMun = vIbsMun;
    }

    public BigDecimal getpCbs() {
        return pCbs;
    }

    public void setpCbs(BigDecimal pCbs) {
        this.pCbs = pCbs;
    }

    public BigDecimal getvCbs() {
        return vCbs;
    }

    public void setvCbs(BigDecimal vCbs) {
        this.vCbs = vCbs;
    }
}
