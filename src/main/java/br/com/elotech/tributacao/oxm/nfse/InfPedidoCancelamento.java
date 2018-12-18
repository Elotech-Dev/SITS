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

public class InfPedidoCancelamento {

	private Long numero;
	
	private IdentificacaoNfse identificacaoNfse;
	
	private String chaveAcesso;

	private CodigoCancelamentoNfse codigoCancelamento;
	
	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public CodigoCancelamentoNfse getCodigoCancelamento() {
		return codigoCancelamento;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public void setCodigoCancelamento(CodigoCancelamentoNfse codigoCancelamento) {
		this.codigoCancelamento = codigoCancelamento;
	}

	public IdentificacaoNfse getIdentificacaoNfse() {
		return identificacaoNfse;
	}

	public void setIdentificacaoNfse(IdentificacaoNfse identificacaoNfse) {
		this.identificacaoNfse = identificacaoNfse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InfPedidoCancelamento [numero=");
		builder.append(numero);
		builder.append(", codigoCancelamento=");
		builder.append(codigoCancelamento);
		builder.append("]");
		return builder.toString();
	}
	
}
