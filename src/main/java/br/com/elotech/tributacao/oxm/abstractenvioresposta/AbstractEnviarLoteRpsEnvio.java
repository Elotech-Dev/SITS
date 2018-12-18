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

import br.com.elotech.tributacao.oxm.nfse.LoteRps;
import br.com.elotech.tributacao.oxm.nfse.SolicitacaoLote;

public abstract class AbstractEnviarLoteRpsEnvio extends AbstractEnvioMsg implements SolicitacaoLote {

	private LoteRps loteRps;

	public LoteRps getLoteRps() { 
		return loteRps;
	}

	public void setLoteRps(LoteRps loteRps) {
		this.loteRps = loteRps;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnviarLoteRpsEnvio [loteRps=");
		builder.append(loteRps);
		builder.append("]");
		return builder.toString()+super.toString();
	}

	@Override
	public String getTipoSolicitacao() {
		return "EnviarLoteRpsEnvio";
	}
	
	public Integer getNumeroLote() {
		return getLoteRps().getNumeroLote();
	}

}
