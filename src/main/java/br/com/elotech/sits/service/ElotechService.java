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

package br.com.elotech.sits.service;

import java.io.File;
import java.util.List;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.w3c.dom.Node;

class ElotechService extends AbstractService {

	@Override
	public void send() throws Exception {

		List<File> files = getFilesToSend();

		for (File file : files) {
			
			Node node = getXSDNotaFiscal(file);

			Object objectToSend = getObjectsToSend(file, node);
			
			WebServiceTemplate webServiceTemplateByXSD = getWebServiceTemplateByXSD(node);

			Object received = webServiceTemplateByXSD.marshalSendAndReceive(objectToSend);
			
			moveToSent(file);
					
			writeReceived(getFileToWriteResponse(file), received, node);

		}

	}
	
}
