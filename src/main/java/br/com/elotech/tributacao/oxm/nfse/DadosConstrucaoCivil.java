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

public class DadosConstrucaoCivil {

	private String codigoObra;
	
	private Long numeroAlvaraConstrucao;

	private String art;
	
	private SimNao incorporacao;
	
	public String getCodigoObra() {
		return codigoObra;
	}

	public void setCodigoObra(String codigoObra) {
		this.codigoObra = codigoObra;
	}
	
	public Long getNumeroAlvaraConstrucao() {
		return numeroAlvaraConstrucao;
	}

	public void setNumeroAlvaraConstrucao(Long numeroAlvaraConstrucao) {
		this.numeroAlvaraConstrucao = numeroAlvaraConstrucao;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public SimNao getIncorporacao() {
		return incorporacao;
	}

	public void setIncorporacao(SimNao incorporacao) {
		this.incorporacao = incorporacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosConstrucaoCivil [codigoObra=");
		builder.append(codigoObra);
		builder.append(", numeroAlvaraConstrucao=");
		builder.append(numeroAlvaraConstrucao);
		builder.append(", art=");
		builder.append(art);
		builder.append(", incorporacao=");
		builder.append(incorporacao);
		builder.append("]");
		return builder.toString();
	}
}
