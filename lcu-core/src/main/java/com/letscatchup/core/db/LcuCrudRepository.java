package com.letscatchup.core.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letscatchup.core.domain.entity.BaseEntity;

@Repository
public interface LcuCrudRepository<T extends BaseEntity, ID> extends JpaRepository<T , Long> {

}
