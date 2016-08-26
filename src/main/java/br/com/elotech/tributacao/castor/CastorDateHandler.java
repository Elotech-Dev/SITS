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

package br.com.elotech.tributacao.castor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.exolab.castor.mapping.GeneralizedFieldHandler;

/**
 * The FieldHandler for the Date class
 * 
 */
public class CastorDateHandler extends GeneralizedFieldHandler {

	private String format;

	
	public CastorDateHandler() {


		 format= "yyyy-MM-dd";
	}
	

	/**
	 * This method is used to convert the value when the getValue method is
	 * called. The getValue method will obtain the actual field value from given
	 * 'parent' object. This convert method is then invoked with the field's
	 * value. The value returned from this method will be the actual value
	 * returned by getValue method.
	 * 
	 * @param value
	 *            the object value to convert after performing a get operation
	 * @return the converted value.
	 */
	public Object convertUponGet(Object value) {
		if (value == null) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = (Date) value;
		return formatter.format(date);
	}

	/**
	 * This method is used to convert the value when the setValue method is
	 * called. The setValue method will call this method to obtain the converted
	 * value. The converted value will then be used as the value to set for the
	 * field.
	 * 
	 * @param value
	 *            the object value to convert before performing a set operation
	 * @return the converted value.
	 */
	public Object convertUponSet(Object value) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = formatter.parse((String) value);
		} catch (ParseException px) {
			throw new IllegalArgumentException(px.getMessage(), px);
		}
		return date;
	}

	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	/**
	 * Returns the class type for the field that this GeneralizedFieldHandler
	 * converts to and from. This should be the type that is used in the object
	 * model.
	 * 
	 * @return the class type of of the field
	 */
	@SuppressWarnings("rawtypes")
	public Class getFieldType() {
		return Date.class;
	}

	/**
	 * Creates a new instance of the object described by this field.
	 * 
	 * @param parent
	 *            The object for which the field is created
	 * @return A new instance of the field's value
	 */
	public Object newInstance(Object parent) {
		// -- Since it's marked as a string...just return null,
		// -- it's not needed.
		return null;
	}

}