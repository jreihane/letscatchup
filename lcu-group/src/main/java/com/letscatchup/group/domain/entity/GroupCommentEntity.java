package com.letscatchup.group.domain.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.letscatchup.core.domain.BaseEntity;
import com.letscatchup.user.domain.entity.UserEntity;

@Entity
@Table(name="LCU_GR_COMMENTS")
@AttributeOverride(name="id", column=@Column(name="GRC_CM_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_GRP_COMMENTS_CM_SEQ")
public class GroupCommentEntity extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name="GRC_GR_ID")
	private GroupEntity group;
	
	@ManyToOne
	@JoinColumn(name="GRC_USR_ID")
	private UserEntity user;
	
	@Column(name="GRC_COMMENT")
	private String content;
	
	@Column(name="GRC_DATETIME")
	private Date date;

	@Column(name="GRC_LAST_EDIT_DATETIME")
	private Date lastEditDate;

	public GroupEntity getGroup() {
		return group;
	}

	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
}

