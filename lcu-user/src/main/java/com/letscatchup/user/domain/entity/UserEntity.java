package com.letscatchup.user.domain.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.letscatchup.core.domain.entity.BaseEntity;
import com.letscatchup.user.types.UserStatus;

@Entity
@Table(name="LCU_USER")
@AttributeOverride(name="id", column=@Column(name="USR_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_USER_ID_SEQ")
public class UserEntity extends BaseEntity {
	
	public UserEntity() {}
	
	public UserEntity(Long userId) {
		setId(userId);
	}
	
	@Column(name="USR_FIRST_NAME")
	private String firstName;
	
	@Column(name="USR_LAST_NAME")
	private String lastName;
	
	@Column(name="USR_USERNAME")
	private String userName;
	
	@Column(name="USR_PASSWORD")
	private String password;
	
	@Column(name="USR_STATUS")
	private UserStatus status;

	@Column(name="USR_PIC")
	private String picture;
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
}
