package br.com.elotech.tributacao.oxm.reformatributaria;

import java.math.BigDecimal;

public class ComercioExterior {
    private String modoPrestacao;

    private String vinculoPartesNegocio;

    private Integer moeda;

    private BigDecimal servicoMoedaEstrangeira;

    private String apoioComercioExteriorPrestadorServico;

    private String apoioComercioExteriorTomadorServico;

    private String vinculoOperacaoTemporariaBens;

    private String indicadorMdic;

    private String declaracaoImportacao;

    private String registroExportacao;

    public String getModoPrestacao() {
        return modoPrestacao;
    }

    public void setModoPrestacao(String modoPrestacao) {
        this.modoPrestacao = modoPrestacao;
    }

    public String getVinculoPartesNegocio() {
        return vinculoPartesNegocio;
    }

    public void setVinculoPartesNegocio(String vinculoPartesNegocio) {
        this.vinculoPartesNegocio = vinculoPartesNegocio;
    }

    public Integer getMoeda() {
        return moeda;
    }

    public void setMoeda(Integer moeda) {
        this.moeda = moeda;
    }

    public BigDecimal getServicoMoedaEstrangeira() {
        return servicoMoedaEstrangeira;
    }

    public void setServicoMoedaEstrangeira(BigDecimal servicoMoedaEstrangeira) {
        this.servicoMoedaEstrangeira = servicoMoedaEstrangeira;
    }

    public String getApoioComercioExteriorPrestadorServico() {
        return apoioComercioExteriorPrestadorServico;
    }

    public void setApoioComercioExteriorPrestadorServico(String apoioComercioExteriorPrestadorServico) {
        this.apoioComercioExteriorPrestadorServico = apoioComercioExteriorPrestadorServico;
    }

    public String getApoioComercioExteriorTomadorServico() {
        return apoioComercioExteriorTomadorServico;
    }

    public void setApoioComercioExteriorTomadorServico(String apoioComercioExteriorTomadorServico) {
        this.apoioComercioExteriorTomadorServico = apoioComercioExteriorTomadorServico;
    }

    public String getVinculoOperacaoTemporariaBens() {
        return vinculoOperacaoTemporariaBens;
    }

    public void setVinculoOperacaoTemporariaBens(String vinculoOperacaoTemporariaBens) {
        this.vinculoOperacaoTemporariaBens = vinculoOperacaoTemporariaBens;
    }

    public String getIndicadorMdic() {
        return indicadorMdic;
    }

    public void setIndicadorMdic(String indicadorMdic) {
        this.indicadorMdic = indicadorMdic;
    }

    public String getDeclaracaoImportacao() {
        return declaracaoImportacao;
    }

    public void setDeclaracaoImportacao(String declaracaoImportacao) {
        this.declaracaoImportacao = declaracaoImportacao;
    }

    public String getRegistroExportacao() {
        return registroExportacao;
    }

    public void setRegistroExportacao(String registroExportacao) {
        this.registroExportacao = registroExportacao;
    }
}