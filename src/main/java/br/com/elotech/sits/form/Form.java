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

package br.com.elotech.sits.form;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public abstract class Form extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4662426966827699370L;
	private Container container;
	private MainForm frame;
	private SpringLayout layoutManager;
	
	private static final Dimension BTN_DIMENSION = new Dimension(128, 25);

	public abstract void initComponents();
	
	public void show(MainForm frame) {
		
		layoutManager = new SpringLayout();

		setLayout(layoutManager);

		initComponents();
		
		this.frame = frame;
		
		container = frame.getContentPane();
		
		container.add(this);
		
	}
	
	public void close() {
		
		frame.close();

	}
	
	public SpringLayout getLayoutManager() {
		return layoutManager;
	}

	public abstract String getTitle();
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JButton configBtnSize(JButton btn) {

		btn.setMaximumSize(BTN_DIMENSION);
		btn.setPreferredSize(BTN_DIMENSION);
		btn.setMinimumSize(BTN_DIMENSION);

		return btn;

	}
	
}
