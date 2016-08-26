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

public enum SimNao implements CastorEnumDef<SimNao> {

	SIM("1", "S"), NAO("2", "N");

	private final String valor;
	private final String valorAlias;

	SimNao(String valor, String valorAlias) {

		this.valor = valor;
		this.valorAlias = valorAlias;
	}

	public static SimNao fromValue(final String value) {
		for (SimNao simNao : SimNao.values()) {
			if (simNao.valor.equals(value)) {
				return simNao;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public static SimNao getByStringValue(final String value) {

		if (value == null) {
			return SimNao.NAO;
		}

		if (value.equals("S")) {

			return SimNao.SIM;
		}

		return SimNao.NAO;
	}

	public String getValueStr(SimNao object) {

		return object.valor;
		
	}

	public String getValue() {
		return valor;
	}

	public String getValueAlias() {
		return valorAlias;
	}
}
