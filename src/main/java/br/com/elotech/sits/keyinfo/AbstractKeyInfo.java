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

package br.com.elotech.sits.keyinfo;

import java.security.KeyStore;
import java.util.Enumeration;


public abstract class AbstractKeyInfo implements KeyInfo {
	
	protected abstract KeyStore getKeyStore();

	@Override
	public String getAlias() throws Exception {
		Enumeration<String> aliases = getKeyStore().aliases();
		return aliases.nextElement();
	}
	
}
