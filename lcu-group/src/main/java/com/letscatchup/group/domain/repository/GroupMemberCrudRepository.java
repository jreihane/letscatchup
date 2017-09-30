package com.letscatchup.group.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.letscatchup.group.domain.entity.GroupMemberEntity;

public interface GroupMemberCrudRepository extends CrudRepository<GroupMemberEntity, Long> {

}
