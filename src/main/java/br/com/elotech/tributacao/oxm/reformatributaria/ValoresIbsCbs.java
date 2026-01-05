package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class ValoresIbsCbs {

    private BigDecimal vbc;

    private UfIbs ufIbs;

    private MunIbs munIbs;

    private FedCbs fedCbs;

    public BigDecimal getVbc() {
        return vbc;
    }

    public void setVbc(BigDecimal vbc) {
        this.vbc = vbc;
    }

    public UfIbs getUfIbs() {
        return ufIbs;
    }

    public void setUfIbs(UfIbs ufIbs) {
        this.ufIbs = ufIbs;
    }

    public MunIbs getMunIbs() {
        return munIbs;
    }

    public void setMunIbs(MunIbs munIbs) {
        this.munIbs = munIbs;
    }

    public FedCbs getFedCbs() {
        return fedCbs;
    }

    public void setFedCbs(FedCbs fedCbs) {
        this.fedCbs = fedCbs;
    }
}
