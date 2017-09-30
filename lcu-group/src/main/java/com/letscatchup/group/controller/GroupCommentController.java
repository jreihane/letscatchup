package com.letscatchup.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.group.domain.entity.GroupCommentEntity;
import com.letscatchup.group.domain.entity.GroupEntity;
import com.letscatchup.group.service.GroupCommentService;

@RestController
@RequestMapping("/group")
public class GroupCommentController {

	@Autowired
	private GroupCommentService groupCommentService;
	
	@RequestMapping(value = "/{groupId}/comments/{commentId}", method= RequestMethod.GET)
	public GroupCommentEntity loadComment(@PathVariable("groupId") Long groupId, @PathVariable("commentId") Long commentId) {
		
		return groupCommentService.loadComment(commentId);
		
	}
	
	@RequestMapping(value = "/{groupId}/comments", method= RequestMethod.POST)
	public GroupCommentEntity addComment(@PathVariable("groupId") Long groupId, @RequestBody GroupCommentEntity groupCommentEntity) {
		groupCommentEntity.setGroup(new GroupEntity(groupId));
		
		return groupCommentService.addComment(groupCommentEntity);
		
	}
		
	@RequestMapping(value = "/{groupId}/comments/{commentId}", method= RequestMethod.DELETE)
	public void removeComment(@PathVariable("groupId") Long groupId, @PathVariable("commentId") Long commentId) {
		
		groupCommentService.removeComment(commentId);
		
	}
	
	@RequestMapping(value = "/{groupId}/comments", method= RequestMethod.PUT)
	public GroupCommentEntity editComment(@PathVariable("groupId") Long groupId, @RequestBody GroupCommentEntity groupCommentEntity) {
		groupCommentEntity.setGroup(new GroupEntity(groupId));
		
		return groupCommentService.updateComment(groupCommentEntity);
		
	}
}
