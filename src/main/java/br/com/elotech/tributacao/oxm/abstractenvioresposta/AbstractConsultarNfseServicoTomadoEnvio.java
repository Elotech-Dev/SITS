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

package br.com.elotech.tributacao.oxm.abstractenvioresposta;

import br.com.elotech.tributacao.oxm.nfse.IdentificacaoIntermediario;
import br.com.elotech.tributacao.oxm.nfse.IdentificacaoPrestador;
import br.com.elotech.tributacao.oxm.nfse.IdentificacaoTomador;
import br.com.elotech.tributacao.oxm.nfse.PeriodoCompetencia;
import br.com.elotech.tributacao.oxm.nfse.PeriodoData;

public abstract class AbstractConsultarNfseServicoTomadoEnvio extends AbstractEnvioMsg {

	private Integer numeroNfse;
	
	private PeriodoData periodoEmissao;
	
	private PeriodoCompetencia periodoCompetencia;
	
	private IdentificacaoPrestador identificacaoPrestador;
	
	private IdentificacaoTomador identificacaoTomador;
		
	private IdentificacaoIntermediario identificacaoIntermediario;
	
	private Integer pagina;

	
	public Integer getNumeroNfse() {
		return numeroNfse;
	}

	public void setNumeroNfse(Integer numeroNfse) {
		this.numeroNfse = numeroNfse;
	}

	public PeriodoData getPeriodoEmissao() {
		return periodoEmissao;
	}

	public void setPeriodoEmissao(PeriodoData periodoEmissao) {
		this.periodoEmissao = periodoEmissao;
	}

	public IdentificacaoPrestador getIdentificacaoPrestador() {
		return identificacaoPrestador;
	}

	public void setIdentificacaoPrestador(
			IdentificacaoPrestador identificacaoPrestador) {
		this.identificacaoPrestador = identificacaoPrestador;
	}

	public IdentificacaoIntermediario getIdentificacaoIntermediario() {
		return identificacaoIntermediario;
	}

	public void setIdentificacaoIntermediario(
			IdentificacaoIntermediario identificacaoIntermediario) {
		this.identificacaoIntermediario = identificacaoIntermediario;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	
	public PeriodoCompetencia getPeriodoCompetencia() {
		return periodoCompetencia;
	}

	public void setPeriodoCompetencia(PeriodoCompetencia periodoCompetencia) {
		this.periodoCompetencia = periodoCompetencia;
	}
		
	public IdentificacaoTomador getIdentificacaoTomador() {
		return identificacaoTomador;
	}

	public void setIdentificacaoTomador(IdentificacaoTomador identificacaoTomador) {
		this.identificacaoTomador = identificacaoTomador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConsultarNfseServicoTomadoEnvio [numeroNfse=");
		builder.append(numeroNfse);
		builder.append(", periodoEmissao=");
		builder.append(periodoEmissao);
		builder.append(", identificacaoPrestador=");
		builder.append(identificacaoPrestador);
		builder.append(", identificacaoIntermediario=");
		builder.append(identificacaoIntermediario);
		builder.append(", pagina=");
		builder.append(pagina);
		builder.append("]");
		return builder.toString()+super.toString();
	}

	@Override
	public String getTipoSolicitacao() {
		return "ConsultarNfseServicoTomadoEnvio";
	}
	

}
