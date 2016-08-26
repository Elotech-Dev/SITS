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

public class CpfCnpj {

	private String cpf;

	private String cnpj;

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

	public String getValue() {

		if (cnpj == null) {

			return cpf;
		}
		return cnpj;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CpfCnpj [cpf=");
		builder.append(cpf);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append("]");
		return builder.toString();
	}
}
