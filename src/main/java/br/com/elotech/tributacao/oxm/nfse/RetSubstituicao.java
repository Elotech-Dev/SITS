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

public class RetSubstituicao {

	private NfseSubstituida nfseSubstituida;
	
	
	private NfseSubstituidora nfseSubstituidora;


	public NfseSubstituida getNfseSubstituida() {
		return nfseSubstituida;
	}


	public void setNfseSubstituida(NfseSubstituida nfseSubstituida) {
		this.nfseSubstituida = nfseSubstituida;
	}


	public NfseSubstituidora getNfseSubstituidora() {
		return nfseSubstituidora;
	}


	public void setNfseSubstituidora(NfseSubstituidora nfseSubstituidora) {
		this.nfseSubstituidora = nfseSubstituidora;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetSubstituicao [nfseSubstituida=");
		builder.append(nfseSubstituida);
		builder.append(", nfseSubstituidora=");
		builder.append(nfseSubstituidora);
		builder.append("]");
		return builder.toString();
	}
	
	
}
