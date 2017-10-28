package com.letscatchup.sponsor.domain.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.letscatchup.core.domain.entity.BaseEntity;

@Entity
@Table(name="LCU_SPONSORS")
@AttributeOverride(name="id", column=@Column(name="SP_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_SPONSORS_ID_SEQ")
public class SponsorEntity extends BaseEntity {
	
	@Column(name="SP_NAME")
	private String name;
	
	@Column(name="SP_LEGAL_CODE")
	private String legalCode;
	
	@Column(name="SP_ADDRESS")
	private String address;
	
	@Column(name="SP_WEBSITE")
	private String website;
	
	@Column(name="SP_PHONE")
	private Integer phone;
	
	@Column(name="SP_USERNAME")
	private String userName;
	
	@Column(name="SP_PASSWORD")
	private String password;

	@Column(name="SP_LOGO")
	private String logo;
	

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegalCode() {
		return legalCode;
	}

	public void setLegalCode(String legalCode) {
		this.legalCode = legalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
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

}
