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

import java.awt.Dimension;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4598307505242780138L;
	private static MainForm instance;
	
	private Stack<JPanel> contents;
	
	private MainForm() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(600, 400));
		setLocationRelativeTo(null);
	}
	
	public static MainForm getInstance() {
		
		if (instance == null) {
			instance = new MainForm();
		}
		
		return instance;
		
	}
	
	public void showForm(Class<? extends Form> classForm) {
		
		if (contents == null) {
			contents = new Stack<JPanel>();
		} else {
		
			contents.push((JPanel) getContentPane().getComponent(0));
			getContentPane().removeAll();
			
		}
		
		try {
			
			Form form = classForm.newInstance();
			
			setTitle(form.getTitle());
			
			form.show(this);
			
			pack();
			
			setVisible(true);
						
			repaint();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void close() {
		
		if (contents.size() == 0) {
			System.exit(0);
		}
		
		getContentPane().removeAll();
		
		getContentPane().add(contents.pop());
		
		pack();
		
		repaint();
		
	}

}
