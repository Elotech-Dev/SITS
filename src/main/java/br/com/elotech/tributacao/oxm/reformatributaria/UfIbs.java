package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class UfIbs {

    private BigDecimal pibsUf;

    private BigDecimal predAliqUf;

    private BigDecimal paliqEfetUf;

    public BigDecimal getPibsUf() {
        return pibsUf;
    }

    public void setPibsUf(BigDecimal pibsUf) {
        this.pibsUf = pibsUf;
    }

    public BigDecimal getPredAliqUf() {
        return predAliqUf;
    }

    public void setPredAliqUf(BigDecimal predAliqUf) {
        this.predAliqUf = predAliqUf;
    }

    public BigDecimal getPaliqEfetUf() {
        return paliqEfetUf;
    }

    public void setPaliqEfetUf(BigDecimal paliqEfetUf) {
        this.paliqEfetUf = paliqEfetUf;
    }
}
