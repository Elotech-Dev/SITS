package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class TotCIbs {

    private BigDecimal vtotNf;

    private GTribRegular gtribRegular;

    private GTribCompraGov gtribCompraGov;

    private GIbs gibs;

    private GCbs gcbs;

    public BigDecimal getVtotNf() {
        return vtotNf;
    }

    public void setVtotNf(BigDecimal vtotNf) {
        this.vtotNf = vtotNf;
    }

    public GTribRegular getGtribRegular() {
        return gtribRegular;
    }

    public void setGtribRegular(GTribRegular gtribRegular) {
        this.gtribRegular = gtribRegular;
    }

    public GTribCompraGov getGtribCompraGov() {
        return gtribCompraGov;
    }

    public void setGtribCompraGov(GTribCompraGov gtribCompraGov) {
        this.gtribCompraGov = gtribCompraGov;
    }

    public GIbs getGibs() {
        return gibs;
    }

    public void setGibs(GIbs gibs) {
        this.gibs = gibs;
    }

    public GCbs getGcbs() {
        return gcbs;
    }

    public void setGcbs(GCbs gcbs) {
        this.gcbs = gcbs;
    }
}
