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

public class Endereco {

	private String endereco;

	private String numero;

	private String complemento;

	private String bairro;

	private Integer codigoMunicipio;

	private String uf;

	private String codigoPais;

	private String cep;

	private String cidadeNome;

	public String getCidadeNome() {
		return cidadeNome;
	}

	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [endereco=");
		builder.append(endereco);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", codigoMunicipio=");
		builder.append(codigoMunicipio);
		builder.append(", uf=");
		builder.append(uf);
		builder.append(", codigoPais=");
		builder.append(codigoPais);
		builder.append(", cep=");
		builder.append(cep);
		builder.append(", cidadeNome=");
		builder.append(cidadeNome);
		builder.append("]");
		return builder.toString();
	}

}
