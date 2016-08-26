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

public class CompNfse {

	private Nfse nfse;

	private CancelamentoNfse cancelamentoNfse;

	private SubstituicaoNfse substituicaoNfse;
	
	private String xml;

	public Nfse getNfse() {
		return nfse;
	}

	public void setNfse(Nfse nfse) {
		this.nfse = nfse;
	}

	public CancelamentoNfse getCancelamentoNfse() {
		return cancelamentoNfse;
	}

	public void setCancelamentoNfse(CancelamentoNfse cancelamentoNfse) {
		this.cancelamentoNfse = cancelamentoNfse;
	}

	public SubstituicaoNfse getSubstituicaoNfse() {
		return substituicaoNfse;
	}

	public void setSubstituicaoNfse(SubstituicaoNfse substituicaoNfse) {
		this.substituicaoNfse = substituicaoNfse;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompNfse [nfse=");
		builder.append(nfse);
		builder.append(", cancelamentoNfse=");
		builder.append(cancelamentoNfse);
		builder.append(", substituicaoNfse=");
		builder.append(substituicaoNfse);
		builder.append(", xml=");
		builder.append(xml);
		builder.append("]");
		return builder.toString();
	}

}
