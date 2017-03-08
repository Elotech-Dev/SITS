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

import java.util.Date;

import br.com.elotech.tributacao.oxm.nfse203.Prestador;

public class InfDeclaracaoPrestacaoServico {

	private InfRps rps;

	private Date competencia;

	private DadosServico servico;

	private DadosPrestador prestador;
	
	private Prestador identificacaoPrestador;

	private DadosTomador tomador;

	private DadosIntermediario intermediario;

	private DadosConstrucaoCivil construcaoCivil;

	private RegimeEspecialTributacao regimeEspecialTributacao;

	private SimNao incentivoFiscal;

	public InfRps getRps() {
		return rps;
	}

	public void setRps(InfRps rps) {
		this.rps = rps;
	}

	public Date getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Date competencia) {
		this.competencia = competencia;
	}

	public DadosServico getServico() {
		return servico;
	}

	public void setServico(DadosServico servico) {
		this.servico = servico;
	}

	public DadosPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(DadosPrestador prestador) {
		this.prestador = prestador;
	}

	public DadosTomador getTomador() {
		return tomador;
	}

	public void setTomador(DadosTomador tomador) {
		this.tomador = tomador;
	}

	public DadosIntermediario getIntermediario() {
		return intermediario;
	}

	public void setIntermediario(DadosIntermediario intermediario) {
		this.intermediario = intermediario;
	}

	public DadosConstrucaoCivil getConstrucaoCivil() {
		return construcaoCivil;
	}

	public void setConstrucaoCivil(DadosConstrucaoCivil construcaoCivil) {
		this.construcaoCivil = construcaoCivil;
	}

	public RegimeEspecialTributacao getRegimeEspecialTributacao() {
		return regimeEspecialTributacao;
	}

	public void setRegimeEspecialTributacao(
			RegimeEspecialTributacao regimeEspecialTributacao) {
		this.regimeEspecialTributacao = regimeEspecialTributacao;
	}

	public SimNao getIncentivoFiscal() {
		return incentivoFiscal;
	}

	public void setIncentivoFiscal(SimNao incentivoFiscal) {
		this.incentivoFiscal = incentivoFiscal;
	}
	
	public Prestador getIdentificacaoPrestador() {
		return identificacaoPrestador;
	}

	public void setIdentificacaoPrestador(
			Prestador identificacaoPrestador) {
		this.identificacaoPrestador = identificacaoPrestador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InfDeclaracaoPrestacaoServico [rps=");
		builder.append(rps);
		builder.append(", competencia=");
		builder.append(competencia);
		builder.append(", servico=");
		builder.append(servico);
		builder.append(", prestador=");
		builder.append(prestador);
		builder.append(", tomador=");
		builder.append(tomador);
		builder.append(", intermediario=");
		builder.append(intermediario);
		builder.append(", construcaoCivil=");
		builder.append(construcaoCivil);
		builder.append(", regimeEspecialTributacao=");
		builder.append(regimeEspecialTributacao);
		builder.append(", incentivoFiscal=");
		builder.append(incentivoFiscal);
		builder.append("]");
		return builder.toString();
	}

}
