/* 
 * Copyright 2016 ELOTECH GESTAO PUBLICA LTDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package br.com.elotech.tributacao.oxm.nfse;

import java.math.BigDecimal;
import java.util.Date;

public class InfNfse {

	private Integer numero;

	private String codigoVerificacao;

	private Date dataEmissao;

	private Integer nfseSubstituida;

	private String outrasInformacoes;

	private ValoresNfse valoresNfse;

	private BigDecimal valorCredito;

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
		builder.append(", declaracaoPrestacaoServico=");
		builder.append(declaracaoPrestacaoServico);
		builder.append(", chaveAcesso=");
		builder.append(chaveAcesso);
		builder.append("]");
		return builder.toString();
	}

}
