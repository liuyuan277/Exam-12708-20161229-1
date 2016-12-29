package com.hand.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("beforeListsner")
public class FilmBoforeEventListener implements ApplicationListener<BoforeInsertFilmEvent> {

	@Override
	public void onApplicationEvent(BoforeInsertFilmEvent event) {
		System.out.println("Bofore Insert Film Data");		
	}

}
