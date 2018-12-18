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

package br.com.elotech.tributacao.oxm.abstractenvioresposta;

import br.com.elotech.tributacao.oxm.nfse.DeclaracaoPrestacaoServico;
import br.com.elotech.tributacao.oxm.nfse.PedidoCancelamento;
import br.com.elotech.tributacao.oxm.nfse203.SubstituicaoNfse;

public abstract class AbstractSubstituirNfseEnvio extends AbstractEnvioMsg {

	private PedidoCancelamento pedidoCancelamento;

	private DeclaracaoPrestacaoServico declaracaoPrestacaoServico;
	
	private SubstituicaoNfse substituicaoNfse;

	public PedidoCancelamento getPedidoCancelamento() {
		return pedidoCancelamento;
	}

	public void setPedidoCancelamento(PedidoCancelamento pedidoCancelamento) {
		this.pedidoCancelamento = pedidoCancelamento;
	}

	public DeclaracaoPrestacaoServico getDeclaracaoPrestacaoServico() {
		return declaracaoPrestacaoServico;
	}

	public void setDeclaracaoPrestacaoServico(
			DeclaracaoPrestacaoServico declaracaoPrestacaoServico) {
		this.declaracaoPrestacaoServico = declaracaoPrestacaoServico;
	}
	
	public SubstituicaoNfse getSubstituicaoNfse() {
		return substituicaoNfse;
	}

	public void setSubstituicaoNfse(SubstituicaoNfse substituicaoNfse) {
		this.substituicaoNfse = substituicaoNfse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubstituirNfseEnvio [pedidoCancelamento=");
		builder.append(pedidoCancelamento);
		builder.append(", declaracaoPrestacaoServico=");
		builder.append(declaracaoPrestacaoServico);
		builder.append("]");
		return builder.toString()+super.toString();
	}

	@Override
	public String getTipoSolicitacao() {
		return "SubstituirNfseEnvio";
	}

}
