package com.letscatchup.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.event.domain.entity.EventEntity;
import com.letscatchup.event.service.EventService;

@RestController
@RequestMapping("/event")
//@CrossOrigin(origins = "http://localhost:8091")
public class EventController {
	

	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/", method= RequestMethod.POST)
	public void addEvent(@RequestBody EventEntity eventEntity) {
		eventService.addEvent(eventEntity);
		
	}
	
	@RequestMapping(value = "/", method= RequestMethod.PUT)
	public void updateEvent(@RequestBody EventEntity eventEntity) {
		eventService.updateEvent(eventEntity);
		
	}
	
	@RequestMapping(value = "/{eventId}", method= RequestMethod.DELETE)
	public void deleteEvent(@PathVariable(name="eventId") Long eventId) {
		eventService.deleteEvent(eventId);
		
	}
	
	@RequestMapping(value = "/{eventId}", method= RequestMethod.GET)
	public List<EventEntity> getEvent(@PathVariable(name="eventId") Long eventId) {
		return eventService.loadEvents(eventId);
		
	}
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public List<EventEntity> getEvents() {
		return eventService.loadEvents(null);
		
	}
	
}
