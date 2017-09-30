package com.letscatchup.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.group.domain.dto.GroupMemberDto;
import com.letscatchup.group.domain.entity.GroupMemberEntity;
import com.letscatchup.group.service.GroupMemberService;
import com.letscatchup.group.util.GroupMemberConverter;

@RestController
@RequestMapping("/group")
public class GroupMemberController {
	
	@Autowired
	private GroupMemberService groupMemberService;
	
	@RequestMapping(value = "/{groupId}/members", method= RequestMethod.POST)
	public GroupMemberEntity addMember(@PathVariable("groupId") Long groupId, @RequestBody GroupMemberDto groupMemberDto) {
		groupMemberDto.setGroup(groupId);
		return groupMemberService.addMember(GroupMemberConverter.convertGroupCommentDtoToEntity(groupMemberDto));
		
	}
		
	@RequestMapping(value = "/{groupId}/members/{userId}", method= RequestMethod.DELETE)
	public void removeMember(@PathVariable("groupId") Long groupId, @PathVariable("userId") Long userId) {
		
		groupMemberService.deleteMember(new GroupMemberEntity(groupId, userId));
		
	}
}
