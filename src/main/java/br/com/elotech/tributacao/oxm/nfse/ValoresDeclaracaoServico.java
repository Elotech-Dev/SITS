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

public class ValoresDeclaracaoServico {

	private BigDecimal valorServicos;

	private BigDecimal valorDeducoes;

	private BigDecimal valorPis;

	private BigDecimal valorCofins;

	private BigDecimal valorInss;

	private BigDecimal valorIr;

	private BigDecimal valorCsll;

	private BigDecimal outrasRetencoes;

	private BigDecimal valorIss;

	private BigDecimal aliquota;

	private BigDecimal descontoIncondicionado;

	private BigDecimal descontoCondicionado;

	public BigDecimal getValorServicos() {
		return valorServicos;
	}

	public void setValorServicos(BigDecimal valorServicos) {
		this.valorServicos = valorServicos;
	}

	public BigDecimal getValorDeducoes() {
		return valorDeducoes;
	}

	public void setValorDeducoes(BigDecimal valorDeducoes) {
		this.valorDeducoes = valorDeducoes;
	}

	public BigDecimal getValorPis() {
		return valorPis;
	}

	public void setValorPis(BigDecimal valorPis) {
		this.valorPis = valorPis;
	}

	public BigDecimal getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(BigDecimal valorCofins) {
		this.valorCofins = valorCofins;
	}

	public BigDecimal getValorInss() {
		return valorInss;
	}

	public void setValorInss(BigDecimal valorInss) {
		this.valorInss = valorInss;
	}

	public BigDecimal getValorIr() {
		return valorIr;
	}

	public void setValorIr(BigDecimal valorIr) {
		this.valorIr = valorIr;
	}

	public BigDecimal getValorCsll() {
		return valorCsll;
	}

	public void setValorCsll(BigDecimal valorCsll) {
		this.valorCsll = valorCsll;
	}

	public BigDecimal getOutrasRetencoes() {
		return outrasRetencoes;
	}

	public void setOutrasRetencoes(BigDecimal outrasRetencoes) {
		this.outrasRetencoes = outrasRetencoes;
	}

	public BigDecimal getValorIss() {
		return valorIss;
	}

	public void setValorIss(BigDecimal valorIss) {
		this.valorIss = valorIss;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public BigDecimal getDescontoIncondicionado() {
		return descontoIncondicionado;
	}

	public void setDescontoIncondicionado(BigDecimal descontoIncondicionado) {
		this.descontoIncondicionado = descontoIncondicionado;
	}

	public BigDecimal getDescontoCondicionado() {
		return descontoCondicionado;
	}

	public void setDescontoCondicionado(BigDecimal descontoCondicionado) {
		this.descontoCondicionado = descontoCondicionado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ValoresDeclaracaoServico [valorServicos=");
		builder.append(valorServicos);
		builder.append(", valorDeducoes=");
		builder.append(valorDeducoes);
		builder.append(", valorPis=");
		builder.append(valorPis);
		builder.append(", valorCofins=");
		builder.append(valorCofins);
		builder.append(", valorInss=");
		builder.append(valorInss);
		builder.append(", valorIr=");
		builder.append(valorIr);
		builder.append(", valorCsll=");
		builder.append(valorCsll);
		builder.append(", outrasRetencoes=");
		builder.append(outrasRetencoes);
		builder.append(", valorIss=");
		builder.append(valorIss);
		builder.append(", aliquota=");
		builder.append(aliquota);
		builder.append(", descontoIncondicionado=");
		builder.append(descontoIncondicionado);
		builder.append(", descontoCondicionado=");
		builder.append(descontoCondicionado);
		builder.append("]");
		return builder.toString();
	}

}
