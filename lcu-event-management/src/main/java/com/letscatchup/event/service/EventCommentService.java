package com.letscatchup.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.event.domain.entity.EventCommentEntity;
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
	
	public EventCommentEntity loadComment(long commentId) {
		return eventCommentsCrudRepository.findOne(commentId);
	}
	
	public EventCommentEntity updateComment(EventCommentEntity eventCommentEntity) {
		return eventCommentsCrudRepository.save(eventCommentEntity);
	}
}
