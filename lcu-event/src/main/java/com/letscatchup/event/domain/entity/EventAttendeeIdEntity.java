package com.letscatchup.event.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EventAttendeeIdEntity implements Serializable {
	
	public EventAttendeeIdEntity() {
	}
	
	public EventAttendeeIdEntity(long eventId, long userId) {
		this.eventId = eventId;
		this.userId = userId;
	}

	@Column(name="EVA_EV_ID")
	private long eventId;

	@Column(name="EVA_USER_ID")
	private long userId;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
