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
 1 Microempresa municipal
 2 Estimativa
 3 Sociedade de profissionais
 4 Cooperativa
 5 Microempresário Individual (MEI)
 6 Microempresário e Empresa de Pequeno Porte (ME EPP)
 */

public enum RegimeEspecialTributacao implements CastorEnumDef<RegimeEspecialTributacao> {

	MICROEMPRESA_MUNICIPAL("1"), ESTIMATIVA("2"), SOCIEDADE_PROFISSIONAIS("3"), COOPERATIVA(
			"4"), MICROEMPRESARIO_INDIVIDUAL("5"), MICROEMPRESARIO_EMPRESA_PEQUENO_PORTE(
			"6"), SIMPLES_NACIONAL("7");

	private final String valor;

	RegimeEspecialTributacao(String valor) {

		this.valor = valor;
	}

	public static RegimeEspecialTributacao fromValue(final String value) {
		for (RegimeEspecialTributacao regimeEspecialTributacao : RegimeEspecialTributacao
				.values()) {
			if (regimeEspecialTributacao.valor.equals(value)) {
				return regimeEspecialTributacao;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public String getValueStr(RegimeEspecialTributacao object) {

		return object.valor;
		
	}

	public static RegimeEspecialTributacao getById(
			Long idRegimeEspecialTributacao) {

		if (idRegimeEspecialTributacao == null) {

			return RegimeEspecialTributacao.MICROEMPRESA_MUNICIPAL;
		}

		for (RegimeEspecialTributacao regimeEspecialTributacao : RegimeEspecialTributacao
				.values()) {
			if (regimeEspecialTributacao.valor
					.equals(idRegimeEspecialTributacao.toString())) {
				return regimeEspecialTributacao;
			}
		}

		return RegimeEspecialTributacao.MICROEMPRESA_MUNICIPAL;
	}

	public long getValue() {

		return new Long(valor);
	}
}
