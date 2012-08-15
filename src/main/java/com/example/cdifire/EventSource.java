package com.example.cdifire;

import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Singleton
public class EventSource {
	
	private final Logger log = Logger.getLogger(EventSource.class.getName());
	
	@Inject Event<Object> eventBus;
	
	@Schedule(second="*/3", minute="*", hour="*", dayOfWeek="*", persistent=false)
	public void sendSomething() {
		log.info("Send something!");
		eventBus.fire(new Booking(5.0));
		eventBus.fire(new Notify(new Date()));
	}

}
