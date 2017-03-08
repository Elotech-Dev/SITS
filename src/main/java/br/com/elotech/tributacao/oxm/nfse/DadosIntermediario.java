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

public class DadosIntermediario {

	private IdentificacaoIntermediario identificacaoIntermediario;

	private String razaoSocial;
	
	private Long codigoMunicipio;

	public IdentificacaoIntermediario getIdentificacaoIntermediario() {
		return identificacaoIntermediario;
	}

	public void setIdentificacaoIntermediario(
			IdentificacaoIntermediario identificacaoIntermediario) {
		this.identificacaoIntermediario = identificacaoIntermediario;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosIntermediario [identificacaoIntermediario=");
		builder.append(identificacaoIntermediario);
		builder.append(", razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", codigoMunicipio=");
		builder.append(codigoMunicipio);
		builder.append("]");
		return builder.toString();
	}

}
