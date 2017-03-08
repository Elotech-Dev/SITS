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

import br.com.elotech.tributacao.oxm.nfse.ListaMensagemRetornoLote;
import br.com.elotech.tributacao.oxm.nfse.ListaNfse;
import br.com.elotech.tributacao.oxm.nfse.SituacaoLoteRps;

public abstract class AbstractConsultarLoteRpsResposta extends AbstractRespostaMsg {
	
	private SituacaoLoteRps situacao;
	
	private ListaNfse listaNfse;
	
	private ListaMensagemRetornoLote listaMensagemRetornoLote;


	public SituacaoLoteRps getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoLoteRps situacao) {
		this.situacao = situacao;
	}

	public ListaNfse getListaNfse() {
		return listaNfse;
	}

	public void setListaNfse(ListaNfse listaNfse) {
		this.listaNfse = listaNfse;
	}

	public ListaMensagemRetornoLote getListaMensagemRetornoLote() {
		return listaMensagemRetornoLote;
	}

	public void setListaMensagemRetornoLote(
			ListaMensagemRetornoLote listaMensagemRetornoLote) {
		this.listaMensagemRetornoLote = listaMensagemRetornoLote;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConsultarLoteRpsResposta [situacao=");
		builder.append(situacao);
		builder.append(", listaNfse=");
		builder.append(listaNfse);
		builder.append(", listaMensagemRetorno=");
		builder.append(getListaMensagemRetorno());
		builder.append(", listaMensagemRetornoLote=");
		builder.append(listaMensagemRetornoLote);
		builder.append("]");
		return builder.toString();
	}

}
