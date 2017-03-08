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
 1  Exigível;
 2  Não incidência;
 3  Isenção;
 4  Exportação;
 5  Imunidade;
 6  Exigibilidade Suspensa por Decisão Judicial;
 7  Exigibilidade Suspensa por Processo Administrativo
 */

public enum ExigibilidadeIss implements CastorEnumDef<ExigibilidadeIss> {

	EXIGIVEL("1"), NAO_INCIDENCIA("2"), ISENCAO("3"), EXPORTACAO("4"), IMUNIDADE(
			"5"), EXIGIBILIDADE_DEC_JUD("6"), EXIGIBILIDADE_PROC_ADM("7");

	private final String valor;

	ExigibilidadeIss(String valor) {

		this.valor = valor;
	}

	public static ExigibilidadeIss fromValue(final String value) {
		for (ExigibilidadeIss exigibilidadeIss : ExigibilidadeIss.values()) {
			if (exigibilidadeIss.valor.equals(value)) {
				return exigibilidadeIss;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public String getValueStr(ExigibilidadeIss object) {

		return object.valor;
		
	}

	public static ExigibilidadeIss getById(Long idExigibilidadeISS) {

		if (idExigibilidadeISS == null) {
			return ExigibilidadeIss.EXIGIVEL;
		}

		for (ExigibilidadeIss exigibilidadeIss : ExigibilidadeIss.values()) {
			if (exigibilidadeIss.valor.equals(idExigibilidadeISS.toString())) {
				return exigibilidadeIss;
			}
		}
		return ExigibilidadeIss.EXIGIVEL;

	}

	public Long getValue() {

		return new Long(valor);
	}
}
