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

public class DadosServico {

	private ValoresDeclaracaoServico valoresDeclaracaoServico;

	private SimNao issRetido;

	private ResponsavelRetencao responsavelRetencao;

	private String discriminacao;
	
	private String codigoTributacaoMunicipio;
	
	private String codigoNbs;

	private Integer codigoMunicipio;

	private String codigoPais;

	private ExigibilidadeIss exigibilidadeISS;

	private Integer municipioIncidencia;

	private String numeroProcesso;

	private ListaItensServico listaItensServico;

	public ListaItensServico getListaItensServico() {
		return listaItensServico;
	}

	public void setListaItensServico(ListaItensServico listaItensServico) {
		this.listaItensServico = listaItensServico;
	}

	public ValoresDeclaracaoServico getValoresDeclaracaoServico() {
		return valoresDeclaracaoServico;
	}

	public void setValoresDeclaracaoServico(
			ValoresDeclaracaoServico valoresDeclaracaoServico) {
		this.valoresDeclaracaoServico = valoresDeclaracaoServico;
	}

	public SimNao getIssRetido() {
		return issRetido;
	}

	public void setIssRetido(SimNao issRetido) {
		this.issRetido = issRetido;
	}

	public ResponsavelRetencao getResponsavelRetencao() {
		return responsavelRetencao;
	}

	public void setResponsavelRetencao(ResponsavelRetencao responsavelRetencao) {
		this.responsavelRetencao = responsavelRetencao;
	}
	
	public String getCodigoTributacaoMunicipio() {
		return codigoTributacaoMunicipio;
	}

	public void setCodigoTributacaoMunicipio(String codigoTributacaoMunicipio) {
		this.codigoTributacaoMunicipio = codigoTributacaoMunicipio;
	}

	public String getCodigoNbs() {
		return codigoNbs;
	}

	public void setCodigoNbs(String codigoNbs) {
		this.codigoNbs = codigoNbs;
	}

	public String getDiscriminacao() {
		return discriminacao;
	}

	public void setDiscriminacao(String discriminacao) {
		this.discriminacao = discriminacao;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public ExigibilidadeIss getExigibilidadeISS() {
		return exigibilidadeISS;
	}

	public void setExigibilidadeISS(ExigibilidadeIss exigibilidadeISS) {
		this.exigibilidadeISS = exigibilidadeISS;
	}

	public Integer getMunicipioIncidencia() {
		return municipioIncidencia;
	}

	public void setMunicipioIncidencia(Integer municipioIncidencia) {
		this.municipioIncidencia = municipioIncidencia;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosServico [valoresDeclaracaoServico=");
		builder.append(valoresDeclaracaoServico);
		builder.append(", issRetido=");
		builder.append(issRetido);
		builder.append(", responsavelRetencao=");
		builder.append(responsavelRetencao);
		builder.append(", discriminacao=");
		builder.append(discriminacao);
		builder.append(", codigoMunicipio=");
		builder.append(codigoMunicipio);
		builder.append(", codigoPais=");
		builder.append(codigoPais);
		builder.append(", exigibilidadeISS=");
		builder.append(exigibilidadeISS);
		builder.append(", municipioIncidencia=");
		builder.append(municipioIncidencia);
		builder.append(", numeroProcesso=");
		builder.append(numeroProcesso);
		builder.append(", listaItensServico=");
		builder.append(listaItensServico);
		builder.append("]");
		return builder.toString();
	}

}
