package com.letscatchup.core.db;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.letscatchup.core.domain.BaseEntity;

@Repository
public interface LcuCrudRepository<T extends BaseEntity, ID> extends CrudRepository<T , Long> {

}
