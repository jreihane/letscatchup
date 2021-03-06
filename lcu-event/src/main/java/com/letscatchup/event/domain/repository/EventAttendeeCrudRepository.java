package com.letscatchup.event.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.letscatchup.event.domain.entity.EventAttendeeEntity;
import com.letscatchup.event.domain.entity.EventAttendeeIdEntity;

public interface EventAttendeeCrudRepository extends CrudRepository<EventAttendeeEntity, EventAttendeeIdEntity> {

}
