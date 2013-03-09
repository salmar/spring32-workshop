package com.sergialmar.spring32.service.impl;

import com.sergialmar.spring32.service.GreetingService;

public class UserGreetingService implements GreetingService {
	
	public String getUserGreeting() {
		return "Hi reader! Welcome to our blog!";
	}

}
