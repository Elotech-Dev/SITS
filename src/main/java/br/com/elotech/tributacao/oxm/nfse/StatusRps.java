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

public enum StatusRps implements CastorEnumDef<StatusRps> {

	NORMAL("1"), CANCELADO("2");

	private final String valor;

	StatusRps(String valor) {

		this.valor = valor;
	}

	public static StatusRps fromValue(final String value) {
		for (StatusRps status : StatusRps.values()) {
			if (status.valor.equals(value)) {
				return status;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public StatusRps getEnumValue() {
		return this;
	}

	public String getValueStr(StatusRps object) {

		return object.valor;
		
	}

	public String getValue() {

		return valor;
	}

	public Long getValueAlias() {

		if (this == StatusRps.CANCELADO) {
			return 1l;
		}
		if (this == StatusRps.NORMAL) {

			return 0L;
		}

		return null;
	}

}
