package com.sb.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class WelcomeService {
	//Spring to manage this bean and create an instance on this.
			public String retrieveWelcomeMessage() {
			return "Good Morning Ash updated with diff pkg";
		}
	
}
