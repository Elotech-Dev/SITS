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
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

abstract class AbstractService implements Service {
	
	private static final String ATRIBUTO_PRINCIPAL_NOTA_FISCAL = "xmlns";
	private static final String XSD_VERSAO_2_03 = "nfse_v2_03.xsd";

	CastorMarshaller castorMarshaller;
	
	CastorMarshaller castorMarshallerNfse203;

	String dirToSend;

	String dirReceived;

	String dirSent;

	WebServiceTemplate webServiceTemplate;
	
	WebServiceTemplate webServiceVersao203Template;

	public WebServiceTemplate getWebServiceTemplate() {
		return webServiceTemplate;
	}
	
	public WebServiceTemplate getWebServiceVersao203Template() {
		return webServiceVersao203Template;
	}
	
	public WebServiceTemplate getWebServiceTemplateByXSD(Node node) {
		
		if(Objects.nonNull(node) &&  
				Objects.nonNull(node.getNodeValue()) && 
				node.getNodeValue().contains(XSD_VERSAO_2_03)){
			return webServiceVersao203Template;		
		}
		
		return webServiceTemplate;
	}
	
	public CastorMarshaller getCastorMarshallerByXSD(Node node) {
		
		if(Objects.nonNull(node) &&  
				Objects.nonNull(node.getNodeValue()) && 
				node.getNodeValue().contains(XSD_VERSAO_2_03)){
			return castorMarshallerNfse203;		
		}
		
		return castorMarshaller;
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

	public Object getObjectsToSend(File fileToSend, Node node) throws XmlMappingException, IOException, ParserConfigurationException, SAXException {

		CastorMarshaller castorMarshallerByXSD = getCastorMarshallerByXSD(node);
		
		Source source = new StreamSource(new FileInputStream(fileToSend));
		
		return castorMarshallerByXSD.unmarshal(source);
			
	}
	
	public void writeReceived(File fileToWrite, Object received, Node node) throws XmlMappingException, IOException, ParserConfigurationException, SAXException {
		
		CastorMarshaller castorMarshallerByXSD = getCastorMarshallerByXSD(node);
		
		FileOutputStream fos =  new FileOutputStream(fileToWrite);
		
		Result result = new StreamResult(fos);
		
		castorMarshallerByXSD.marshal(received, result);
		
		fos.flush();
		
		fos.close();
		
	}
	
	public void moveToSent(File fileSent) throws IOException {
		
		FileUtils.moveFile(fileSent, getFileToWriteSent(fileSent));
		
	}
	
	public Node getXSDNotaFiscal(File file) throws ParserConfigurationException, SAXException, IOException{
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true);
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		
		Node root = (Node)doc.getDocumentElement();
		
		NamedNodeMap attributes = root.getAttributes();
	    if (attributes != null){
	        for (int i = 0; i < attributes.getLength(); i++){
	            Node node = attributes.item(i);
	            if (node.getNodeType() == Node.ATTRIBUTE_NODE){
	            	
	            	if(ATRIBUTO_PRINCIPAL_NOTA_FISCAL.equals(node.getNodeName())){
	            		return node;
	            	}	                
	            }
	        }
	    }
	    
	    return null;
		
	}

}
