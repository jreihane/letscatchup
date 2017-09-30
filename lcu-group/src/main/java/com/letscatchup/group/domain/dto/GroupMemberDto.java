package com.letscatchup.group.domain.dto;

import java.util.Date;

public class GroupMemberDto {

	private long user;
	
	private long group;
	
	private Date joinDate;

	public long getUser() {
		return user;
	}

	public void setUser(long user) {
		this.user = user;
	}

	public long getGroup() {
		return group;
	}

	public void setGroup(long group) {
		this.group = group;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
}
