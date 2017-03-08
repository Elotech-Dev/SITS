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

 1 Erro na emissão
 2 Serviço não prestado
 3 Erro de assinatura
 4 Duplicidade da nota
 5 Erro de processamento

 */

public enum CodigoCancelamentoNfse implements CastorEnumDef<CodigoCancelamentoNfse> {

	ERRO_EMISSAO("1"), SERVICO_NAO_PRESTADO("2"), ERRO_ASSINATURA("3"),

	DUPLICIDADE_NOTA("4"), ERRO_PROCESSAMENTO("5");

	private final String valor;

	private CodigoCancelamentoNfse(String valor) {

		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	public static CodigoCancelamentoNfse fromValue(final String value) {
		for (CodigoCancelamentoNfse codigoCancelamentoNfse : CodigoCancelamentoNfse
				.values()) {
			if (codigoCancelamentoNfse.valor.equals(value)) {
				return codigoCancelamentoNfse;
			}
		}
		throw new IllegalArgumentException(value);
	}

	public String getValueStr(CodigoCancelamentoNfse object) {

		return object.valor;
		
	}

	public static CodigoCancelamentoNfse getById(Long cancelamentoCodigo) {

		if ( cancelamentoCodigo == null){
			
			return CodigoCancelamentoNfse.ERRO_EMISSAO;
		}
		
		for (CodigoCancelamentoNfse codigoCancelamentoNfse : CodigoCancelamentoNfse
				.values()) {
			if (codigoCancelamentoNfse.valor.equals(cancelamentoCodigo
					.toString())) {
				return codigoCancelamentoNfse;
			}
		}
		return CodigoCancelamentoNfse.ERRO_EMISSAO;		

	}
	
	public Long toLong() {
		return Long.parseLong(getValor());
	}
	
}
