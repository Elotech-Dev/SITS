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

import br.com.elotech.tributacao.castor.CastorEnumDef;

/*
 1 Não Processado
 2 Processado com Erro
 3 Processado com Sucesso

 */

public enum SituacaoLoteRps implements CastorEnumDef<SituacaoLoteRps> {


	NAO_PROCESSADO("1"), PROCESSADO_ERRO("2"), PROCESSADO_SUCESSO("3");

	private final String valor;

	SituacaoLoteRps(String valor) {
		this.valor = valor;
	}

	public static SituacaoLoteRps fromValue(final String value) {
		for (SituacaoLoteRps situacaoLoteRps : SituacaoLoteRps.values()) {
			if (situacaoLoteRps.valor.equals(value)) {
				return situacaoLoteRps;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public String getValueStr(SituacaoLoteRps object) {

		return object.valor;
		
	}

	public String getValue() {

		return valor;
	}

}
