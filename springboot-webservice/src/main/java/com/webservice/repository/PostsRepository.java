package com.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.domain.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long>{

}
