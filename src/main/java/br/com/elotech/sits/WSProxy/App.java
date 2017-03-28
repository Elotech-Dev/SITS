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

package br.com.elotech.sits.WSProxy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.elotech.sits.action.Action;
import br.com.elotech.sits.action.Config;
import br.com.elotech.sits.action.Setup;
import br.com.elotech.sits.service.ServiceFactory;

public class App {

	private static final Map<String, Class<? extends Action>> ACTIONS;
	
	static {

		Map<String, Class<? extends Action>> actions = new HashMap<String, Class<? extends Action>>();

		actions.put("--setup", Setup.class);
		actions.put("--config", Config.class);

		ACTIONS = Collections.unmodifiableMap(actions);

	}

	public static void main(String[] args) {

		if (args.length > 0) {

			execArgs(args);

		} else {

			send();

		}

	}

	private static void execArgs(String[] args) {

		Class<? extends Action> actionClass = ACTIONS.get(args[0]);

		if (actionClass == null) {
			
			throw new RuntimeException(String.format(
					"Argumento inválido: \"%s\"", args[0]));
			
		}

		try {
			Action action = actionClass.newInstance();
			action.run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void send() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "clientWs.xml" });

		ServiceFactory serviceFactory = (ServiceFactory) ctx
				.getBean("serviceFactory");

		try {
			serviceFactory.createService().send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
