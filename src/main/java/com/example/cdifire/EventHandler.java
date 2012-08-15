package com.example.cdifire;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;

public class EventHandler {

	private final Logger log = Logger.getLogger(EventHandler.class.getName());

	public void logBooking(@Observes Booking booking) {
		log.info("Got booking " + booking);
	}
	
	public void logNotify(@Observes Notify notify) {
		log.info("Got notify " + notify);
	}
	
//	public void logObject(@Observes Object object) {
//		log.info("Got object " + object);
//	}
	
}
