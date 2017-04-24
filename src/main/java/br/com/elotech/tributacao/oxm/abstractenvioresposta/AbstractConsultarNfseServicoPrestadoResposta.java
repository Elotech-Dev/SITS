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

import br.com.elotech.tributacao.oxm.nfse.ListaConsultaNfse;
import br.com.elotech.tributacao.oxm.nfse203.ListaNfse;

public abstract class AbstractConsultarNfseServicoPrestadoResposta extends AbstractRespostaMsg {

	private ListaConsultaNfse listaConsultaNfse;
	
	private ListaNfse listaNfse;
	
	public ListaConsultaNfse getListaConsultaNfse() {
		return listaConsultaNfse;
	}

	public void setListaConsultaNfse(ListaConsultaNfse listaConsultaNfse) {
		this.listaConsultaNfse = listaConsultaNfse;
	}
	
	public ListaNfse getListaNfse() {
		return listaNfse;
	}

	public void setListaNfse(ListaNfse listaNfse) {
		this.listaNfse = listaNfse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConsultarNfseFaixaResposta [listaConsultaNfse=");
		builder.append(listaConsultaNfse);
		builder.append(", listaMensagemRetorno=");
		builder.append(getListaMensagemRetorno());
		builder.append("]");
		return builder.toString();
	}


}
