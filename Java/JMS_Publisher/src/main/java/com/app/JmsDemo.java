package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service (value="shravanjms")
public class JmsDemo {
	
	@Autowired
	private JmsTemplate jmsVar;
	
	
	public void setJmsVar(JmsTemplate jmsVar) {
		this.jmsVar = jmsVar;
	}



	public void sendData(Student st) {
				
		jmsVar.convertAndSend(st);
		
	}
	
	
	
}
