package com.letscatchup.group.util;

import com.letscatchup.group.domain.dto.GroupMemberDto;
import com.letscatchup.group.domain.entity.GroupMemberEntity;
import com.letscatchup.group.domain.entity.GroupMemberIdEntity;
import com.letscatchup.group.type.MemberStatus;

public class GroupMemberConverter {

	public static GroupMemberEntity convertGroupCommentDtoToEntity(GroupMemberDto groupMemberDto) {
		GroupMemberEntity groupMemberEntity = new GroupMemberEntity();
		GroupMemberIdEntity groupMemberIdEntity = new GroupMemberIdEntity(
														groupMemberDto.getGroup(), 
														groupMemberDto.getUser());
		
		
		groupMemberEntity.setGroupMemberId(groupMemberIdEntity);
		groupMemberEntity.setJoinDate(groupMemberDto.getJoinDate());
		groupMemberEntity.setStatus(MemberStatus.ACTIVE);
		
		return groupMemberEntity;
	}
}
