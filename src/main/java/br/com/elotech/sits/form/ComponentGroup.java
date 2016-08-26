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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class ComponentGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1250079651099682231L;
	private List<JComponent> components;
	
	public void addComponent(JComponent component) {
		if (components == null) {
			components = new ArrayList<JComponent>();
		}
		components.add(component);
	}
	
	public void setGroupEnabled(boolean enabled) {
		for (JComponent component : components) {
			component.setEnabled(enabled);
		}
	}

	public void enableGroup() {
		setGroupEnabled(true);
	}

	public void disableGroup() {
		setGroupEnabled(false);
	}

}
