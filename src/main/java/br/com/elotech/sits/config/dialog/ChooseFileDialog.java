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

package br.com.elotech.sits.config.dialog;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ChooseFileDialog extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1597261006003820802L;

	private static File selFile;

	private Log logger = LogFactory.getLog(ChooseFileDialog.class);

	private JFileChooser fileChooser;

	private ChooseOption option;

	private ChooseFileDialog(Frame owner, String title, ChooseOption option,
			boolean modal) {
		super(owner, title, modal);
		this.option = option;
		buildFileChooser();
	}

	public static File getFile(Frame owner, ChooseOption option) {

		ChooseFileDialog dialog = new ChooseFileDialog(owner,
				option == ChooseOption.FILE ? "Escolher arquivo"
						: "Escolher pasta", option, true);

		dialog.setMinimumSize(new Dimension(600, 400));

		dialog.setLocationRelativeTo(owner);

		dialog.setVisible(true);

		return selFile;

	}

	private void buildFileChooser() {

		getContentPane().add(fileChooser = new JFileChooser());

		fileChooser.setFileFilter(buildKeyStoreFileFilter());

		fileChooser.addActionListener(this);
		
	}

	private FileFilter buildKeyStoreFileFilter() {
		return new FileFilter() {

			private final List<String> ACEITAVEIS = Arrays.asList(new String[] {
					".p12", ".pfx" });

			@Override
			public String getDescription() {
				return "Arquivos de informações pessoais";
			}

			@Override
			public boolean accept(File f) {

				if (f.isDirectory()) {

					return true;

				} else if (option == ChooseOption.FILE) {

					for (String aceitavel : ACEITAVEIS) {
						if (f.getName().toLowerCase().endsWith(aceitavel)) {
							return true;
						}
					}

				}

				return false;
			}

		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		logger.info(e);

		if (e.getActionCommand().equals("CancelSelection")) {

			setVisible(false);

		} else {

			if ((!fileChooser.getSelectedFile().isDirectory())
					|| (option == ChooseOption.FOLDER)) {
				select();
			}

		}

	}

	private void select() {

		selFile = fileChooser.getSelectedFile();

		setVisible(false);

	}

}
