package com.abhay.sb.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@JmsListener(destination = "ABCD")
	public void readMessage(String sRecivedMessage)
	
	{
	
		System.out.println(" I am from Consumer App ==>"+sRecivedMessage);
	}
}
