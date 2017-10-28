package com.letscatchup.event.domain.repository;

import java.util.List;

import com.letscatchup.core.db.LcuCrudRepository;
import com.letscatchup.event.domain.entity.EventCommentEntity;
import com.letscatchup.event.domain.entity.EventEntity;

public interface EventCommentsCrudRepository extends LcuCrudRepository<EventCommentEntity, Long>{

	List<EventCommentEntity> findByEvent(EventEntity eventEntity);
}
