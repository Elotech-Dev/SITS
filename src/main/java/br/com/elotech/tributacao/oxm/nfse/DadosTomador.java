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

public class DadosTomador {

	private IdentificacaoTomador identificacaoTomador;
	
	private String nifTomador;

	private String razaoSocial;

	private Endereco endereco;

	private Contato contato;

	private String inscricaoEstadual;

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public IdentificacaoTomador getIdentificacaoTomador() {
		return identificacaoTomador;
	}

	public void setIdentificacaoTomador(
			IdentificacaoTomador identificacaoTomador) {
		this.identificacaoTomador = identificacaoTomador;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String getNifTomador() {
		return nifTomador;
	}

	public void setNifTomador(String nifTomador) {
		this.nifTomador = nifTomador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosTomador [identificacaoTomador=");
		builder.append(identificacaoTomador);
		builder.append(", razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", nifTomador=");
		builder.append(nifTomador);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", contato=");
		builder.append(contato);
		builder.append(", inscricaoEstadual=");
		builder.append(inscricaoEstadual);
		builder.append("]");
		return builder.toString();
	}

}
