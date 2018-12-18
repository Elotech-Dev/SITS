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

	private BigDecimal aliquotaPis;

	private SimNao retidoPis;

	private BigDecimal valorPis;

	private BigDecimal aliquotaCofins;

	private SimNao retidoCofins;

	private BigDecimal valorCofins;

	private BigDecimal aliquotaInss;

	private SimNao retidoInss;

	private BigDecimal valorInss;

	private BigDecimal aliquotaIr;

	private SimNao retidoIr;

	private BigDecimal valorIr;

	private BigDecimal aliquotaCsll;

	private SimNao retidoCsll;

	private BigDecimal valorCsll;

	private BigDecimal aliquotaCpp;

	private SimNao retidoCpp;

	private BigDecimal valorCpp;

	private BigDecimal outrasRetencoes;

	private SimNao retidoOutrasRetencoes;

	private BigDecimal aliquotaTotTributos;

	private BigDecimal valorTotTributos;

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

	public BigDecimal getAliquotaPis() {
		return aliquotaPis;
	}

	public void setAliquotaPis(BigDecimal aliquotaPis) {
		this.aliquotaPis = aliquotaPis;
	}

	public SimNao getRetidoPis() {
		return retidoPis;
	}

	public void setRetidoPis(SimNao retidoPis) {
		this.retidoPis = retidoPis;
	}

	public BigDecimal getValorPis() {
		return valorPis;
	}

	public void setValorPis(BigDecimal valorPis) {
		this.valorPis = valorPis;
	}

	public BigDecimal getAliquotaCofins() {
		return aliquotaCofins;
	}

	public void setAliquotaCofins(BigDecimal aliquotaCofins) {
		this.aliquotaCofins = aliquotaCofins;
	}

	public SimNao getRetidoCofins() {
		return retidoCofins;
	}

	public void setRetidoCofins(SimNao retidoCofins) {
		this.retidoCofins = retidoCofins;
	}

	public BigDecimal getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(BigDecimal valorCofins) {
		this.valorCofins = valorCofins;
	}

	public BigDecimal getAliquotaInss() {
		return aliquotaInss;
	}

	public void setAliquotaInss(BigDecimal aliquotaInss) {
		this.aliquotaInss = aliquotaInss;
	}

	public SimNao getRetidoInss() {
		return retidoInss;
	}

	public void setRetidoInss(SimNao retidoInss) {
		this.retidoInss = retidoInss;
	}

	public BigDecimal getValorInss() {
		return valorInss;
	}

	public void setValorInss(BigDecimal valorInss) {
		this.valorInss = valorInss;
	}

	public BigDecimal getAliquotaIr() {
		return aliquotaIr;
	}

	public void setAliquotaIr(BigDecimal aliquotaIr) {
		this.aliquotaIr = aliquotaIr;
	}

	public SimNao getRetidoIr() {
		return retidoIr;
	}

	public void setRetidoIr(SimNao retidoIr) {
		this.retidoIr = retidoIr;
	}

	public BigDecimal getValorIr() {
		return valorIr;
	}

	public void setValorIr(BigDecimal valorIr) {
		this.valorIr = valorIr;
	}

	public BigDecimal getAliquotaCsll() {
		return aliquotaCsll;
	}

	public void setAliquotaCsll(BigDecimal aliquotaCsll) {
		this.aliquotaCsll = aliquotaCsll;
	}

	public SimNao getRetidoCsll() {
		return retidoCsll;
	}

	public void setRetidoCsll(SimNao retidoCsll) {
		this.retidoCsll = retidoCsll;
	}

	public BigDecimal getValorCsll() {
		return valorCsll;
	}

	public void setValorCsll(BigDecimal valorCsll) {
		this.valorCsll = valorCsll;
	}

	public BigDecimal getAliquotaCpp() {
		return aliquotaCpp;
	}

	public void setAliquotaCpp(BigDecimal aliquotaCpp) {
		this.aliquotaCpp = aliquotaCpp;
	}

	public SimNao getRetidoCpp() {
		return retidoCpp;
	}

	public void setRetidoCpp(SimNao retidoCpp) {
		this.retidoCpp = retidoCpp;
	}

	public BigDecimal getValorCpp() {
		return valorCpp;
	}

	public void setValorCpp(BigDecimal valorCpp) {
		this.valorCpp = valorCpp;
	}

	public BigDecimal getOutrasRetencoes() {
		return outrasRetencoes;
	}

	public void setOutrasRetencoes(BigDecimal outrasRetencoes) {
		this.outrasRetencoes = outrasRetencoes;
	}

	public SimNao getRetidoOutrasRetencoes() {
		return retidoOutrasRetencoes;
	}

	public void setRetidoOutrasRetencoes(SimNao retidoOutrasRetencoes) {
		this.retidoOutrasRetencoes = retidoOutrasRetencoes;
	}

	public BigDecimal getAliquotaTotTributos() {
		return aliquotaTotTributos;
	}

	public void setAliquotaTotTributos(BigDecimal aliquotaTotTributos) {
		this.aliquotaTotTributos = aliquotaTotTributos;
	}

	public BigDecimal getValorTotTributos() {
		return valorTotTributos;
	}

	public void setValorTotTributos(BigDecimal valorTotTributos) {
		this.valorTotTributos = valorTotTributos;
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
