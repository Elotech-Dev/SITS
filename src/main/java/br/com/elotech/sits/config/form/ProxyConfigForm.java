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

package br.com.elotech.sits.config.form;

import javax.swing.JCheckBox;
import javax.swing.SpringLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ProxyConfigForm extends ConfigForm implements ChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8308212390132318020L;
	private SpringLayout layout;
	private JCheckBox chkUseProxy;
	
	@Override
	public String getTitle() {
		return "Configurar Proxy";
	}

	@Override
	public void initComponents() {

		layout = getLayoutManager();

		buildChkUseProxy();

		super.initComponents();

	}

	private void buildChkUseProxy() {

		add(chkUseProxy = new JCheckBox("Usar Proxy"));
		
		chkUseProxy.addChangeListener(this);

		layout.putConstraint(SpringLayout.NORTH, chkUseProxy, 15,
				SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, chkUseProxy, 15,
				SpringLayout.WEST, this);

	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
