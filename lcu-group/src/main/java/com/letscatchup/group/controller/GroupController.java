package com.letscatchup.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.group.domain.entity.GroupEntity;
import com.letscatchup.group.service.GroupService;

@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	@RequestMapping(value = "/", method= RequestMethod.POST)
	public void addGroup(@RequestBody GroupEntity groupEntity) {
		groupService.addGroup(groupEntity);
		
	}
	
	@RequestMapping(value = "/", method= RequestMethod.PUT)
	public void updateGroup(@RequestBody GroupEntity groupEntity) {
		groupService.updateGroup(groupEntity);
		
	}
	
	@RequestMapping(value = "/{groupId}", method= RequestMethod.DELETE)
	public void deleteGroup(@PathVariable(name="groupId") Long groupId) {
		groupService.deleteGroup(groupId);
		
	}
	
	@RequestMapping(value = "/{groupId}", method= RequestMethod.GET)
	public GroupEntity getGroup(@PathVariable(name="groupId") Long groupId) {
		return groupService.loadGroup(groupId);
		
	}
}
