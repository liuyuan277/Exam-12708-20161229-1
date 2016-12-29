package com.hand.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("afterListener")
public class FilmAfterEventListener implements ApplicationListener<AfterInsertFilmEvent>{

	@Override
	public void onApplicationEvent(AfterInsertFilmEvent event) {
	   System.out.println("After Insert Film Data");
		
	}

}
