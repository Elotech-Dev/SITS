package br.com.elotech.tributacao.castor;

import br.com.elotech.tributacao.oxm.nfse.Unidade;

public class CastorEnumHandlerUnidade extends CastorEnumHandler {

	@Override
	public Object convertUponSet(Object value) {

		return Unidade.fromValue((String) value);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class getFieldType() {

		return Unidade.class;
	}

}
