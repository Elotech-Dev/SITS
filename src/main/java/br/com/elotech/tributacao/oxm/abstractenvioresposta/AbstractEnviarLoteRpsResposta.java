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

import java.util.Date;

public abstract class AbstractEnviarLoteRpsResposta extends AbstractRespostaMsg {

	private Integer numeroLote;

	private Date dataRecebimento;

	public Integer getNumeroLote() { 
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnviarLoteRpsResposta [numeroLote=");
		builder.append(numeroLote);
		builder.append(", dataRecebimento=");
		builder.append(dataRecebimento);
		builder.append(", listaMensagemRetorno=");
		builder.append(getListaMensagemRetorno());
		builder.append("]");
		return builder.toString();
	}

}
