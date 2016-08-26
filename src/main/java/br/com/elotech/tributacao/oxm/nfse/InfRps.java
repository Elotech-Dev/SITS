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

import java.util.Date;

public class InfRps {

	private IdentificacaoRps identificacaoRps;

	private Date dataEmissao;

	private  StatusRps status;

	private IdentificacaoRps rpsSubstituido;

	public IdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(IdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public StatusRps getStatus() {
		return status;
	}

	public void setStatus(StatusRps status) {
		this.status = status;
	}

	public IdentificacaoRps getRpsSubstituido() {
		return rpsSubstituido;
	}

	public void setRpsSubstituido(IdentificacaoRps rpsSubstituido) {
		this.rpsSubstituido = rpsSubstituido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InfRps [identificacaoRps=");
		builder.append(identificacaoRps);
		builder.append(", dataEmissao=");
		builder.append(dataEmissao);
		builder.append(", status=");
		builder.append(status);
		builder.append(", rpsSubstituido=");
		builder.append(rpsSubstituido);
		builder.append("]");
		return builder.toString();
	}

}
