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

public class LoteRps {

	private Integer numeroLote;

	private Integer quantidadeRps;

	private ListaRps listaRps;

	public ListaRps getListaRps() {
		return listaRps;
	}

	public void setListaRps(ListaRps listaRps) {
		this.listaRps = listaRps;
	}

	public Integer getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public Integer getQuantidadeRps() {
		return quantidadeRps;
	}

	public void setQuantidadeRps(Integer quantidadeRps) {
		this.quantidadeRps = quantidadeRps;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoteRps [numeroLote=");
		builder.append(numeroLote);
		builder.append(", quantidadeRps=");
		builder.append(quantidadeRps);
		builder.append(", listaRps=");
		builder.append(listaRps);
		builder.append("]");
		return builder.toString();
	}

}
