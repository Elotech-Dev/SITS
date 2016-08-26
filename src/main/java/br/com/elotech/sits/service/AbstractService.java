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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

abstract class AbstractService implements Service {

	CastorMarshaller castorMarshaller;

	String dirToSend;

	String dirReceived;

	String dirSent;

	WebServiceTemplate webServiceTemplate;

	public WebServiceTemplate getWebServiceTemplate() {
		return webServiceTemplate;
	}
	
	public List<File> getFilesToSend() {

		File fileDirToSend = new File(dirToSend);

		File[] files = fileDirToSend.listFiles();

		List<File> rFiles = new ArrayList<File>();

		for (File file : files) {

			if (!file.isDirectory()) {
				rFiles.add(file);
			}

		}

		return rFiles;

	}

	public File getFileToWriteResponse(File receivedFile) {

		return getDestFile(receivedFile, "resp", dirReceived);

	}
	
	public File getFileToWriteSent(File sentFile) {

		return getDestFile(sentFile, "sent", dirSent);

	}
	
	private File getDestFile(File srcFile, String prefix, String destDir) {

		return new File(String.format("%s%s%s_%s", destDir,
				File.separator, prefix, srcFile.getName()));
		
	}

	public Object getObjectsToSend(File fileToSend) throws XmlMappingException, IOException {
		

			Source source = new StreamSource(new FileInputStream(fileToSend));
			
			return castorMarshaller.unmarshal(source);
			
	}
	
	public void writeReceived(File fileToWrite, Object received) throws XmlMappingException, IOException {
		
		FileOutputStream fos =  new FileOutputStream(fileToWrite);
		
		Result result = new StreamResult(fos);
		
		castorMarshaller.marshal(received, result);
		
		fos.flush();
		
		fos.close();
		
	}
	
	public void moveToSent(File fileSent) throws IOException {
		
		FileUtils.moveFile(fileSent, getFileToWriteSent(fileSent));
		
	}

}
