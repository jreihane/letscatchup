package com.letscatchup.event.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.event.domain.entity.EventEntity;
import com.letscatchup.event.domain.repository.EventCrudRepository;

@Service
public class EventService {

	@Autowired
	private EventCrudRepository eventCrudRepository;
	
	
	public EventEntity addEvent(EventEntity eventEntity) {
		
		return eventCrudRepository.save(eventEntity);
		
	}
	
	public EventEntity updateEvent(EventEntity eventEntity) {
		
		return eventCrudRepository.save(eventEntity);
		
	}
	
	public void deleteEvent(Long eventId) {
		
		eventCrudRepository.delete(eventId);
		
	}

	public List<EventEntity> loadEvents(Long eventId) {
		
		if(eventId != null && eventId > 0) {
			List<EventEntity> result = new ArrayList<>();
			result.add(eventCrudRepository.findOne(eventId));
			
			return result;
		}
		
		return eventCrudRepository.findAll();
	}
}
