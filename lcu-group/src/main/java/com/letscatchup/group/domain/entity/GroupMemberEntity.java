package com.letscatchup.group.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.letscatchup.group.type.MemberStatus;
import com.letscatchup.user.domain.entity.UserEntity;

@Entity
@Table(name="LCU_GR_MEMBERS")
public class GroupMemberEntity {
	
	public GroupMemberEntity() {}
	
	public GroupMemberEntity(long groupId, long userId) {
		this.setGroupMemberId(new GroupMemberIdEntity(groupId, userId));
	}
	
	@EmbeddedId
	private GroupMemberIdEntity groupMemberId; 
	
	@Column(name="GRM_DATE")
	private Date joinDate;
	
	@Column(name="GRM_STATUS")
	private MemberStatus status;


	public GroupMemberIdEntity getGroupMemberId() {
		return groupMemberId;
	}

	public void setGroupMemberId(GroupMemberIdEntity groupMemberId) {
		this.groupMemberId = groupMemberId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public MemberStatus getStatus() {
		return status;
	}

	public void setStatus(MemberStatus status) {
		this.status = status;
	}	

}

