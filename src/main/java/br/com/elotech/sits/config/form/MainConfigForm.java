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
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import br.com.elotech.sits.config.dialog.ChooseFileDialog;
import br.com.elotech.sits.config.dialog.ChooseOption;
import br.com.elotech.sits.form.MainForm;

public class MainConfigForm extends ConfigForm implements ActionListener {

	private static final String BTN_PROXY = "btnProxy";

	/**
	 * 
	 */
	private static final long serialVersionUID = 639909135131271171L;

	private static final String BTN_KEYSTORE_FILE = "btnKeystoreFile";

	private JLabel labelServiceUrl;

	private JTextField fieldServiceUrl;

	private JLabel labelKeystoreFile;

	private JTextField fieldKeystoreFile;

	private JButton btnKeystoreFile;

	private JLabel labelKeystorePassword;

	private JTextField fieldKeystorePassword;

	private JLabel labelKeyPassword;

	private JTextField fieldKeyPassword;

	private JLabel labelTrustPassword;

	private JTextField fieldTrustPassword;

	private JLabel labelKeystoreType;

	private JTextField fieldKeystoreType;

	private JLabel labelSendFolder;

	private JTextField fieldSendFolder;

	private JLabel labelSentFolder;

	private JTextField fieldSentFolder;

	private JLabel labelReceivedFolder;

	private JTextField fieldReceivedFolder;

	private JButton btnProxy;

	@Override
	public void initComponents() {

		compMap = new HashMap<String, JComponent>();

		buildFields();

		buildProxyButton();

		super.initComponents();

	}

	private void buildProxyButton() {

		add(configBtnSize(btnProxy = new JButton("Proxy")));
		
		btnProxy.setActionCommand(BTN_PROXY);
		
		btnProxy.addActionListener(this);

		getLayoutManager().putConstraint(SpringLayout.NORTH, btnProxy, 5,
				SpringLayout.SOUTH, fieldReceivedFolder);

		getLayoutManager().putConstraint(SpringLayout.EAST, btnProxy, 0,
				SpringLayout.EAST, fieldReceivedFolder);

	}

	private void buildFields() {

		buildFieldServiceUrl();

		buildFieldKeystoreType();

		buildFieldKeyStoreFile();

		buildFieldsPassword();

		buildFieldSendFolder();

		buildFieldSentFolder();

		buildFieldReceivedFolder();

	}

	private void buildFieldReceivedFolder() {
		add(labelReceivedFolder = new JLabel("Pasta Recebidos:"));
		add(fieldReceivedFolder = new JTextField());

		compMap.put("ISS.dirReceived", fieldReceivedFolder);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldReceivedFolder, 8,
				SpringLayout.SOUTH, fieldSentFolder);

		getLayoutManager().putConstraint(SpringLayout.WEST, fieldReceivedFolder, 200,
				SpringLayout.WEST, this);
		getLayoutManager().putConstraint(SpringLayout.EAST, fieldReceivedFolder, -5,
				SpringLayout.EAST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelReceivedFolder, 0,
				SpringLayout.BASELINE, fieldReceivedFolder);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelReceivedFolder, -5,
				SpringLayout.WEST, fieldReceivedFolder);

	}

	private void buildFieldSentFolder() {

		add(labelSentFolder = new JLabel("Pasta Enviados:"));
		add(fieldSentFolder = new JTextField());

		compMap.put("ISS.dirSent", fieldSentFolder);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldSentFolder, 8,
				SpringLayout.SOUTH, fieldSendFolder);

		getLayoutManager().putConstraint(SpringLayout.WEST, fieldSentFolder, 200,
				SpringLayout.WEST, this);
		getLayoutManager().putConstraint(SpringLayout.EAST, fieldSentFolder, -5,
				SpringLayout.EAST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelSentFolder, 0,
				SpringLayout.BASELINE, fieldSentFolder);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelSentFolder, -5,
				SpringLayout.WEST, fieldSentFolder);

	}

	private void buildFieldSendFolder() {

		add(labelSendFolder = new JLabel("Pasta Enviar:"));
		add(fieldSendFolder = new JTextField());

		compMap.put("ISS.dirToSend", fieldSendFolder);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldSendFolder, 8,
				SpringLayout.SOUTH, fieldTrustPassword);

		getLayoutManager().putConstraint(SpringLayout.WEST, fieldSendFolder, 200,
				SpringLayout.WEST, this);
		getLayoutManager().putConstraint(SpringLayout.EAST, fieldSendFolder, -5,
				SpringLayout.EAST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelSendFolder, 0,
				SpringLayout.BASELINE, fieldSendFolder);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelSendFolder, -5,
				SpringLayout.WEST, fieldSendFolder);

	}

	private void buildFieldKeystoreType() {

		add(labelKeystoreType = new JLabel("Tipo Arquivo de Chaves:"));
		add(fieldKeystoreType = new JTextField(15));
		fieldKeystoreType.setEditable(false);

		compMap.put("ISS.key.type", fieldKeystoreType);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldKeystoreType, 8,
				SpringLayout.SOUTH, fieldServiceUrl);

		getLayoutManager().putConstraint(SpringLayout.WEST, fieldKeystoreType, 200,
				SpringLayout.WEST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelKeystoreType, 0,
				SpringLayout.BASELINE, fieldKeystoreType);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelKeystoreType, -5,
				SpringLayout.WEST, fieldKeystoreType);

	}

	private void buildFieldsPassword() {

		buildFieldKeystorePassword();

		buildFieldKeyPassword();

		buildFieldTrustPassword();

	}

	private void buildFieldTrustPassword() {

		add(labelTrustPassword = new JLabel("Senha Cadeia Confiança:"));
		add(fieldTrustPassword = new JTextField(15));

		compMap.put("ISS.key.trustStorePassword", fieldTrustPassword);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldTrustPassword, 8,
				SpringLayout.SOUTH, fieldKeyPassword);
		getLayoutManager().putConstraint(SpringLayout.WEST, fieldTrustPassword, 200,
				SpringLayout.WEST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelTrustPassword, 0,
				SpringLayout.BASELINE, fieldTrustPassword);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelTrustPassword, -5,
				SpringLayout.WEST, fieldTrustPassword);

	}

	private void buildFieldKeyPassword() {

		add(labelKeyPassword = new JLabel("Senha Chaves:"));
		add(fieldKeyPassword = new JTextField(15));

		compMap.put("ISS.key.securePassword", fieldKeyPassword);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldKeyPassword, 8,
				SpringLayout.SOUTH, fieldKeystorePassword);
		getLayoutManager().putConstraint(SpringLayout.WEST, fieldKeyPassword, 200,
				SpringLayout.WEST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelKeyPassword, 0,
				SpringLayout.BASELINE, fieldKeyPassword);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelKeyPassword, -5,
				SpringLayout.WEST, fieldKeyPassword);

	}

	private void buildFieldKeystorePassword() {

		add(labelKeystorePassword = new JLabel("Senha Arquivo de Chaves:"));
		add(fieldKeystorePassword = new JTextField(15));

		compMap.put("ISS.key.storePassword", fieldKeystorePassword);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldKeystorePassword, 8,
				SpringLayout.SOUTH, fieldKeystoreFile);
		getLayoutManager().putConstraint(SpringLayout.WEST, fieldKeystorePassword, 200,
				SpringLayout.WEST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelKeystorePassword, 0,
				SpringLayout.BASELINE, fieldKeystorePassword);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelKeystorePassword, -5,
				SpringLayout.WEST, fieldKeystorePassword);

	}

	private void buildFieldKeyStoreFile() {

		add(labelKeystoreFile = new JLabel("Arquivo de chaves:"));
		add(fieldKeystoreFile = new JTextField());
		add(btnKeystoreFile = new JButton("..."));

		compMap.put("ISS.key.path", fieldKeystoreFile);

		btnKeystoreFile.setActionCommand(BTN_KEYSTORE_FILE);

		btnKeystoreFile.addActionListener(this);

		getLayoutManager().putConstraint(SpringLayout.EAST, btnKeystoreFile, -10,
				SpringLayout.EAST, this);
		getLayoutManager().putConstraint(SpringLayout.HEIGHT, btnKeystoreFile, 0,
				SpringLayout.HEIGHT, fieldKeystoreFile);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldKeystoreFile, 8,
				SpringLayout.SOUTH, fieldKeystoreType);
		getLayoutManager().putConstraint(SpringLayout.BASELINE, btnKeystoreFile, 0,
				SpringLayout.BASELINE, fieldKeystoreFile);

		getLayoutManager().putConstraint(SpringLayout.WEST, fieldKeystoreFile, 200,
				SpringLayout.WEST, this);
		getLayoutManager().putConstraint(SpringLayout.EAST, fieldKeystoreFile, -1,
				SpringLayout.WEST, btnKeystoreFile);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelKeystoreFile, 0,
				SpringLayout.BASELINE, fieldKeystoreFile);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelKeystoreFile, -5,
				SpringLayout.WEST, fieldKeystoreFile);

	}

	private void buildFieldServiceUrl() {

		add(labelServiceUrl = new JLabel("Endereço do Web Service:"));
		add(fieldServiceUrl = new JTextField());

		compMap.put("ISS.url", fieldServiceUrl);

		getLayoutManager().putConstraint(SpringLayout.NORTH, fieldServiceUrl, 15,
				SpringLayout.NORTH, this);
		getLayoutManager().putConstraint(SpringLayout.WEST, fieldServiceUrl, 200,
				SpringLayout.WEST, this);
		getLayoutManager().putConstraint(SpringLayout.EAST, fieldServiceUrl, -10,
				SpringLayout.EAST, this);

		getLayoutManager().putConstraint(SpringLayout.BASELINE, labelServiceUrl, 0,
				SpringLayout.BASELINE, fieldServiceUrl);
		getLayoutManager().putConstraint(SpringLayout.EAST, labelServiceUrl, -5,
				SpringLayout.WEST, fieldServiceUrl);

	}

	@Override
	public String getTitle() {
		return "Configurações";
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String actionCommand = e.getActionCommand();

		if (actionCommand.equals(BTN_KEYSTORE_FILE)) {

			File file = ChooseFileDialog.getFile(getFrame(), ChooseOption.FILE);

			if (file != null) {
				fieldKeystoreFile.setText(file.getAbsolutePath());
			} else {
				fieldKeystoreFile.setText(null);
			}

		} else if (actionCommand.equals(BTN_PROXY)) {
			
			MainForm.getInstance().showForm(ProxyConfigForm.class);
			
		} else {
			
			super.actionPerformed(e);
			
		}

	}

}
