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

public class DadosDeducao {

	
	private String tipoDeducao;
	
	private String cpf;
	
	private String cnpj;
	
	private Integer numeroNotaFiscalReferencia;
	
	private BigDecimal valorTotalNotaFiscal;
	
	private BigDecimal percentualADeduzir;
	
	private BigDecimal valorADeduzir;


	public String getTipoDeducao() {
		return tipoDeducao;
	}

	public void setTipoDeducao(String tipoDeducao) {
		this.tipoDeducao = tipoDeducao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getNumeroNotaFiscalReferencia() {
		return numeroNotaFiscalReferencia;
	}

	public void setNumeroNotaFiscalReferencia(Integer numeroNotaFiscalReferencia) {
		this.numeroNotaFiscalReferencia = numeroNotaFiscalReferencia;
	}

	public BigDecimal getValorTotalNotaFiscal() {
		return valorTotalNotaFiscal;
	}

	public void setValorTotalNotaFiscal(BigDecimal valorTotalNotaFiscal) {
		this.valorTotalNotaFiscal = valorTotalNotaFiscal;
	}

	public BigDecimal getPercentualADeduzir() {
		return percentualADeduzir;
	}

	public void setPercentualADeduzir(BigDecimal percentualADeduzir) {
		this.percentualADeduzir = percentualADeduzir;
	}

	public BigDecimal getValorADeduzir() {
		return valorADeduzir;
	}

	public void setValorADeduzir(BigDecimal valorADeduzir) {
		this.valorADeduzir = valorADeduzir;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosDeducao [tipoDeducao=");
		builder.append(tipoDeducao);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", numeroNotaFiscalReferencia=");
		builder.append(numeroNotaFiscalReferencia);
		builder.append(", valorTotalNotaFiscal=");
		builder.append(valorTotalNotaFiscal);
		builder.append(", percentualADeduzir=");
		builder.append(percentualADeduzir);
		builder.append(", valorADeduzir=");
		builder.append(valorADeduzir);
		builder.append("]");
		return builder.toString();
	}
	
}
