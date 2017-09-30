package com.letscatchup.group.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.group.domain.entity.GroupCommentEntity;
import com.letscatchup.group.domain.repository.GroupCommentCrudRepository;

@Service
public class GroupCommentService {
	
	@Autowired
	private GroupCommentCrudRepository groupCommentCrudRepository;
	
	public GroupCommentEntity addComment(GroupCommentEntity groupCommentEntity) {
		return groupCommentCrudRepository.save(groupCommentEntity);
	}
	
	public void removeComment(long commentId) {
		groupCommentCrudRepository.delete(commentId);
	}
	
	public GroupCommentEntity loadComment(long commentId) {
		return groupCommentCrudRepository.findOne(commentId);
	}
	
	public GroupCommentEntity updateComment(GroupCommentEntity groupCommentEntity) {
		return groupCommentCrudRepository.save(groupCommentEntity);
	}

}
