package com.example.sysecho.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sysecho.entity.UserEntity;
import com.example.sysecho.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<UserEntity> getAll(){
		return this.userMapper.getAll();
	}
	
	public UserEntity getOne(Long id){
		return this.getOne(id);
	}

	public void insert(UserEntity user){
		this.userMapper.insert(user);
	}

	public void update(UserEntity user){
		this.userMapper.update(user);
	}

	public void delete(Long id){
		this.userMapper.delete(id);
	}
}

