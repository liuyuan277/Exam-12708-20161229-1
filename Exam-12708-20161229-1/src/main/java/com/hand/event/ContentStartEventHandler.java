package com.hand.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;
@Component("contentStart")
public class ContentStartEventHandler  implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		 System.out.println("Context Start");
	}
	  
}
