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

public class ValoresNfse {

	private BigDecimal baseCalculo;

	private BigDecimal aliquota;

	private BigDecimal valorIss;

	private BigDecimal valorLiquidoNfse;

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public BigDecimal getValorIss() {
		return valorIss;
	}

	public void setValorIss(BigDecimal valorIss) {
		this.valorIss = valorIss;
	}

	public BigDecimal getValorLiquidoNfse() {
		return valorLiquidoNfse;
	}

	public void setValorLiquidoNfse(BigDecimal valorLiquidoNfse) {
		this.valorLiquidoNfse = valorLiquidoNfse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ValoresNfse [baseCalculo=");
		builder.append(baseCalculo);
		builder.append(", aliquota=");
		builder.append(aliquota);
		builder.append(", valorIss=");
		builder.append(valorIss);
		builder.append(", valorLiquidoNfse=");
		builder.append(valorLiquidoNfse);
		builder.append("]");
		return builder.toString();
	}


}
