package com.letscatchup.user.domain.repository;

import com.letscatchup.core.db.LcuCrudRepository;
import com.letscatchup.user.domain.entity.UserEntity;

public interface UserCrudRepository extends LcuCrudRepository<UserEntity, Long> {

}
