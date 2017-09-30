package com.letscatchup.group.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.letscatchup.user.domain.entity.UserEntity;

@Embeddable
public class GroupMemberIdEntity implements Serializable {
	
	public GroupMemberIdEntity() {}
	
	public GroupMemberIdEntity(long group, long user) {
		this.group = new GroupEntity(group);
		this.user = new UserEntity(user);
	}
	
	@ManyToOne
	@JoinColumn(name="GRM_USR_ID")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name="GRM_GR_ID")
	private GroupEntity group;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public GroupEntity getGroup() {
		return group;
	}

	public void setGroup(GroupEntity group) {
		this.group = group;
	}
	
}
