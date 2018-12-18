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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import org.apache.commons.logging.LogFactory;

import br.com.elotech.sits.form.Form;
import br.com.elotech.sits.keyinfo.KeyInfo;
import br.com.elotech.sits.keyinfo.PKCS12KeyInfo;

public abstract class ConfigForm extends Form implements ActionListener {

	private static final String CONFIG_FILE = System.getenv("SITS_HOME") + File.separator + "client.properties";

	/**
	 * 
	 */
	private static final long serialVersionUID = -1861591143796173117L;

	protected static final String BTN_CANCEL = "btnCancel";

	protected static final String BTN_SAVE = "btnSave";

	private JButton btnSave;

	private JButton btnCancel;

	protected Map<String, JComponent> compMap;

	@Override
	public void actionPerformed(ActionEvent e) {

		String actionCommand = e.getActionCommand();

		if (actionCommand.equals(BTN_SAVE)) {

			save();

		} else if (actionCommand.equals(BTN_CANCEL)) {

			close();

		}

	}

	@Override
	public void initComponents() {

		buildButtons();

		loadConfig();

	}

	private void loadConfig() {

		Properties config = loadConfigFile();

		try {

			File configFile = new File(CONFIG_FILE);

			if (!configFile.exists()) {
				configFile.createNewFile();
			}

			config.load(new FileInputStream(configFile));

			loadFields(config);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Properties loadConfigFile() {
		Properties defaultProp = new Properties();

		defaultProp.setProperty("ISS.key.type", "PKCS12");

		defaultProp.setProperty("ISS.serviceType", "elotech");

		defaultProp.setProperty("ISS.dirToSend", "C:\\SITS\\ISS\\enviar");

		defaultProp.setProperty("ISS.dirSent", "C:\\SITS\\ISS\\enviado");

		defaultProp.setProperty("ISS.dirReceived", "C:\\SITS\\ISS\\recebido");

		Properties config = new Properties(defaultProp);
		return config;
	}

	private void loadFields(Properties config) {

		Set<Entry<String,JComponent>> configsSet = compMap.entrySet();

		for (Entry<String, JComponent> conf : configsSet) {
			
			JComponent comp = conf.getValue();
			
			if (comp instanceof JTextField) {
			
				((JTextField)comp).setText(config.getProperty(conf.getKey()));
			}

		}

	}

	private void buildButtons() {
		add(configBtnSize(btnSave = new JButton("Salvar")));
		add(configBtnSize(btnCancel = new JButton("Cancelar")));

		btnSave.setActionCommand(BTN_SAVE);
		btnSave.addActionListener(this);

		btnCancel.setActionCommand(BTN_CANCEL);
		btnCancel.addActionListener(this);

		getLayoutManager().putConstraint(SpringLayout.SOUTH, btnSave, -10,
				SpringLayout.SOUTH, this);

		getLayoutManager().putConstraint(SpringLayout.SOUTH, btnCancel, -10,
				SpringLayout.SOUTH, this);

		getLayoutManager().putConstraint(SpringLayout.EAST, btnSave, -5,
				SpringLayout.WEST, btnCancel);

		getLayoutManager().putConstraint(SpringLayout.EAST, btnCancel, -10,
				SpringLayout.EAST, this);
	}

	private void save() {

		Properties config = new Properties(loadConfigFile());

		config.setProperty("ISS.serviceType", "elotech");

		try {

			saveFields(config);

			saveKeyAlias(config);

			config.store(new FileOutputStream(new File(CONFIG_FILE)),
					"Arquivo gerado pelo configurador");

			close();

		} catch (Exception e) {

			LogFactory.getLog(getClass()).error(e.getLocalizedMessage(), e);

			JOptionPane.showMessageDialog(getFrame(), e.getLocalizedMessage(),
					"Erro durante gravação", JOptionPane.CLOSED_OPTION
							+ JOptionPane.ERROR_MESSAGE);

		}

	}

	private void saveKeyAlias(Properties config) throws Exception {

		KeyInfo keyInfo = new PKCS12KeyInfo();

		keyInfo.openKeyStore(new File(config.getProperty("ISS.key.path")),
				config.getProperty("ISS.key.storePassword"));

		config.setProperty("ISS.key.alias", keyInfo.getAlias());

	}

	private void saveFields(Properties config) {

		Set<Entry<String,JComponent>> configsSet = compMap.entrySet();

		for (Entry<String, JComponent> conf : configsSet) {

			JComponent comp = conf.getValue();
			
			if (comp instanceof JTextField) {
				config.setProperty(conf.getKey(), ((JTextField)comp).getText());
			}

		}

	}

}
