package com.vue.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vue.domain.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserIdAndUserPw(String id, String pw);
	
	public User findByUserId(String id);
	
}
