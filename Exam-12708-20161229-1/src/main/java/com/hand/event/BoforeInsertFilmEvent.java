package com.hand.event;

import org.springframework.context.ApplicationEvent;

public class BoforeInsertFilmEvent extends ApplicationEvent{

	public BoforeInsertFilmEvent(Object source) {
		super(source);
	}

}
