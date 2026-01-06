package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class MunIbs {

    private BigDecimal pibsMun;

    private BigDecimal predAliqMun;

    private BigDecimal paliqEfetMun;

    public BigDecimal getPibsMun() {
        return pibsMun;
    }

    public void setPibsMun(BigDecimal pibsMun) {
        this.pibsMun = pibsMun;
    }

    public BigDecimal getPredAliqMun() {
        return predAliqMun;
    }

    public void setPredAliqMun(BigDecimal predAliqMun) {
        this.predAliqMun = predAliqMun;
    }

    public BigDecimal getPaliqEfetMun() {
        return paliqEfetMun;
    }

    public void setPaliqEfetMun(BigDecimal paliqEfetMun) {
        this.paliqEfetMun = paliqEfetMun;
    }
}
