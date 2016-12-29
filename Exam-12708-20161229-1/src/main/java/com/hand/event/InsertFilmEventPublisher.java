package com.hand.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component("filmpublish")
public class InsertFilmEventPublisher  implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
       this.applicationEventPublisher=applicationEventPublisher;
	}	

	public void publishBofore(){
		BoforeInsertFilmEvent boforeEvent=new BoforeInsertFilmEvent(this);
		applicationEventPublisher.publishEvent(boforeEvent);
	}

	public void publishAfter(){
		AfterInsertFilmEvent afterEvent=new AfterInsertFilmEvent(this);
		applicationEventPublisher.publishEvent(afterEvent);
	}
}
