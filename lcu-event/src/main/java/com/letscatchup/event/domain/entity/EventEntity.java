package com.letscatchup.event.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.letscatchup.core.domain.entity.BaseEntity;
import com.letscatchup.event.type.EventStatus;
import com.letscatchup.event.type.FoodType;
import com.letscatchup.group.domain.entity.GroupEntity;
import com.letscatchup.sponsor.domain.entity.SponsorEntity;
import com.letscatchup.user.domain.entity.UserEntity;

@Entity
@Table(name="LCU_EVENTS")
@AttributeOverride(name="id", column=@Column(name="EV_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_EVENTS_ID_SEQ")
public class EventEntity extends BaseEntity {
	
	public EventEntity(long eventId) {
		this.setId(eventId);
	}
	
	public EventEntity() {
		super();
	}

	@Column(name="EV_NAME")
	private String name;
	
	@Column(name="EV_DATETIME")
	private Date date;
	
	@Column(name="EV_ADDRESS")
	private String address;
	
	@Column(name="EV_DESCRIPTION")
	private String description;
	
	@Column(name="EV_RATE")
	private float rate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="EV_ORGANISER")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private UserEntity organiser;
	
	@Column(name="EV_STATUS")
	private EventStatus status;
	
	@Column(name="EV_FOOD_TYPE")
	private FoodType foodType;
	
	public String getImgAddress() {
		return imgAddress;
	}

	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}

	@Column(name="EV_IMG_ADDRESS")
	private String imgAddress;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="EV_GROUP")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private GroupEntity group;
	
	@ManyToMany
	@JoinTable(name = "LCU_EV_ATTENDEES", 
					joinColumns = @JoinColumn(name = "EVA_EV_ID"), 
					inverseJoinColumns = @JoinColumn(name = "EVA_USER_ID"))
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<UserEntity> attendees;
	
	@ManyToMany
	@JoinTable(name = "LCU_EV_SPONSORS", 
			joinColumns = @JoinColumn(name = "SPE_EV_ID"), 
			inverseJoinColumns = @JoinColumn(name = "SPE_SP_ID"))
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<SponsorEntity> sponsor;
	

	public List<SponsorEntity> getSponsor() {
		return sponsor;
	}

	public void setSponsor(List<SponsorEntity> sponsor) {
		this.sponsor = sponsor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public UserEntity getOrganiser() {
		return organiser;
	}

	public void setOrganiser(UserEntity organiser) {
		this.organiser = organiser;
	}

	public EventStatus getStatus() {
		return status;
	}

	public void setStatus(EventStatus status) {
		this.status = status;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public GroupEntity getGroup() {
		return group;
	}

	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	public List<UserEntity> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<UserEntity> attendees) {
		this.attendees = attendees;
	}
}
