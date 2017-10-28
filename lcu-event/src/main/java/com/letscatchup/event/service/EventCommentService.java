package com.letscatchup.event.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.letscatchup.event.domain.entity.EventCommentEntity;
import com.letscatchup.event.domain.entity.EventEntity;
import com.letscatchup.event.domain.repository.EventCommentsCrudRepository;

@Service
public class EventCommentService {

	@Autowired
	EventCommentsCrudRepository eventCommentsCrudRepository;
	
	public EventCommentEntity addComment(EventCommentEntity eventCommentEntity) {
		return eventCommentsCrudRepository.save(eventCommentEntity);
	}
	
	public void removeComment(long commentId) {
		eventCommentsCrudRepository.delete(commentId);
	}
	
	public List<EventCommentEntity> loadComment(long eventId, Long commentId) {
		if(commentId != null && commentId > 0) {
			List<EventCommentEntity> result = new ArrayList<>();
			eventCommentsCrudRepository.findOne(commentId);
			
			return result;
		}
		
		EventEntity event = new EventEntity(eventId);
		return eventCommentsCrudRepository.findByEvent(event);
	}
	
	public EventCommentEntity updateComment(EventCommentEntity eventCommentEntity) {
		return eventCommentsCrudRepository.save(eventCommentEntity);
	}
}
