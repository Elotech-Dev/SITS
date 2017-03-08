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

public class CancelamentoNfse {

	private ConfirmacaoCancelamento confirmacaoCancelamento;
	
	private String versao;
	
	public ConfirmacaoCancelamento getConfirmacaoCancelamento() {
		return confirmacaoCancelamento;
	}

	public void setConfirmacaoCancelamento(
			ConfirmacaoCancelamento confirmacaoCancelamento) {
		this.confirmacaoCancelamento = confirmacaoCancelamento;
	}
	
	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CancelamentoNfse [confirmacaoCancelamento=");
		builder.append(confirmacaoCancelamento);
		builder.append("]");
		return builder.toString();
	}

	
}
