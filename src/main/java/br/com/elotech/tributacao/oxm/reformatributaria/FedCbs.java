package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class FedCbs {

    private BigDecimal pcbs;

    private BigDecimal predAliqCBS;

    private BigDecimal paliqEfetCBS;

    public BigDecimal getPcbs() {
        return pcbs;
    }

    public void setPcbs(BigDecimal pcbs) {
        this.pcbs = pcbs;
    }

    public BigDecimal getPredAliqCBS() {
        return predAliqCBS;
    }

    public void setPredAliqCBS(BigDecimal predAliqCBS) {
        this.predAliqCBS = predAliqCBS;
    }

    public BigDecimal getPaliqEfetCBS() {
        return paliqEfetCBS;
    }

    public void setPaliqEfetCBS(BigDecimal paliqEfetCBS) {
        this.paliqEfetCBS = paliqEfetCBS;
    }
}
