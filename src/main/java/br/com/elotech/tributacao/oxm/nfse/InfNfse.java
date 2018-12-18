package br.com.elotech.tributacao.oxm.nfse;

import java.math.BigDecimal;
import java.util.Date;

import br.com.elotech.tributacao.oxm.nfse203.PrestadorServico;

public class InfNfse {

	private Integer numero;

	private String codigoVerificacao;

	private Date dataEmissao;

	private Integer nfseSubstituida;

	private String outrasInformacoes;

	private ValoresNfse valoresNfse;

	private BigDecimal valorCredito;
	
	private PrestadorServico prestador;

	private IdentificacaoOrgaoGerador orgaoGerador;

	private DeclaracaoPrestacaoServico declaracaoPrestacaoServico;

	private String chaveAcesso;

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodigoVerificacao() {
		return codigoVerificacao;
	}

	public void setCodigoVerificacao(String codigoVerificacao) {
		this.codigoVerificacao = codigoVerificacao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Integer getNfseSubstituida() {
		return nfseSubstituida;
	}

	public void setNfseSubstituida(Integer nfseSubstituida) {
		this.nfseSubstituida = nfseSubstituida;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public ValoresNfse getValoresNfse() {
		return valoresNfse;
	}

	public void setValoresNfse(ValoresNfse valoresNfse) {
		this.valoresNfse = valoresNfse;
	}

	public BigDecimal getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(BigDecimal valorCredito) {
		this.valorCredito = valorCredito;
	}

	public IdentificacaoOrgaoGerador getOrgaoGerador() {
		return orgaoGerador;
	}

	public void setOrgaoGerador(IdentificacaoOrgaoGerador orgaoGerador) {
		this.orgaoGerador = orgaoGerador;
	}

	public DeclaracaoPrestacaoServico getDeclaracaoPrestacaoServico() {
		return declaracaoPrestacaoServico;
	}

	public void setDeclaracaoPrestacaoServico(
			DeclaracaoPrestacaoServico declaracaoPrestacaoServico) {
		this.declaracaoPrestacaoServico = declaracaoPrestacaoServico;
	}
	
	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InfNfse [numero=");
		builder.append(numero);
		builder.append(", codigoVerificacao=");
		builder.append(codigoVerificacao);
		builder.append(", dataEmissao=");
		builder.append(dataEmissao);
		builder.append(", nfseSubstituida=");
		builder.append(nfseSubstituida);
		builder.append(", outrasInformacoes=");
		builder.append(outrasInformacoes);
		builder.append(", valoresNfse=");
		builder.append(valoresNfse);
		builder.append(", valorCredito=");
		builder.append(valorCredito);
		builder.append(", orgaoGerador=");
		builder.append(orgaoGerador);
		builder.append(", prestador=");
		builder.append(prestador);
		builder.append(", declaracaoPrestacaoServico=");
		builder.append(declaracaoPrestacaoServico);
		builder.append(", chaveAcesso=");
		builder.append(chaveAcesso);
		builder.append("]");
		return builder.toString();
	}

}
