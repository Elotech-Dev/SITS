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

public class ItemServico {

	private String itemListaServico;

	private String codigoCnae;

	private String descricao;
	
	private Unidade unidade;

	private SimNao tributavel;

	private BigDecimal quantidade;

	private BigDecimal valorUnitario;

	private BigDecimal valorDesconto;

	private BigDecimal valorLiquido;

	private DadosDeducao dadosDeducao;

	public String getItemListaServico() {
		return itemListaServico;
	}

	public void setItemListaServico(String itemListaServico) {
		this.itemListaServico = itemListaServico;
	}

	public String getCodigoCnae() {
		return codigoCnae;
	}

	public void setCodigoCnae(String codigoCnae) {
		this.codigoCnae = codigoCnae;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public SimNao getTributavel() {
		return tributavel;
	}

	public void setTributavel(SimNao tributavel) {
		this.tributavel = tributavel;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public DadosDeducao getDadosDeducao() {
		return dadosDeducao;
	}

	public void setDadosDeducao(DadosDeducao dadosDeducao) {
		this.dadosDeducao = dadosDeducao;
	}
	
	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemServico [itemListaServico=");
		builder.append(itemListaServico);
		builder.append(", codigoCnae=");
		builder.append(codigoCnae);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", tributavel=");
		builder.append(tributavel);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", valorUnitario=");
		builder.append(valorUnitario);
		builder.append(", valorDesconto=");
		builder.append(valorDesconto);
		builder.append(", valorLiquido=");
		builder.append(valorLiquido);
		builder.append(", dadosDeducao=");
		builder.append(dadosDeducao);
		builder.append("]");
		return builder.toString();
	}

}
