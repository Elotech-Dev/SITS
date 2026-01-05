package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class GIbs {

    private BigDecimal vIbsTot;

    private GIbsCredPres gIbsCredPres;

    private GIbsUfTot gIbsUfTot;

    private GIbsMunTot gIbsMunTot;

    public BigDecimal getvIbsTot() {
        return vIbsTot;
    }

    public void setvIbsTot(BigDecimal vIbsTot) {
        this.vIbsTot = vIbsTot;
    }

    public GIbsCredPres getgIbsCredPres() {
        return gIbsCredPres;
    }

    public void setgIbsCredPres(GIbsCredPres gIbsCredPres) {
        this.gIbsCredPres = gIbsCredPres;
    }

    public GIbsUfTot getgIbsUfTot() {
        return gIbsUfTot;
    }

    public void setgIbsUfTot(GIbsUfTot gIbsUfTot) {
        this.gIbsUfTot = gIbsUfTot;
    }

    public GIbsMunTot getgIbsMunTot() {
        return gIbsMunTot;
    }

    public void setgIbsMunTot(GIbsMunTot gIbsMunTot) {
        this.gIbsMunTot = gIbsMunTot;
    }
}
