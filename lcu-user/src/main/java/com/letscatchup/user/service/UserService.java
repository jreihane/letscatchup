package com.letscatchup.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.letscatchup.core.db.LcuCrudRepository;
import com.letscatchup.core.domain.entity.BaseEntity;
import com.letscatchup.user.domain.entity.UserEntity;
import com.letscatchup.user.domain.repository.UserCrudRepository;

@Service
public class UserService {

	
	@Autowired
	private UserCrudRepository userCrudRepository;
	
	
	public UserEntity addUser(UserEntity userEntity) {
		
		return userCrudRepository.save(userEntity);
		
	}
	
	public UserEntity updateUser(UserEntity userEntity) {
		
		return userCrudRepository.save(userEntity);
		
	}
	
	public void deleteUser(Long userId) {
		
		userCrudRepository.delete(new UserEntity(userId));
		
	}

	public UserEntity loadUser(Long userId) {
		
		return userCrudRepository.findOne(userId);
		
	}
	/*
	public void updateUserStatus(UserEntity userEntity) {
		
		userCrudRepository.save(userEntity);
		
	}*/
	
	
}
