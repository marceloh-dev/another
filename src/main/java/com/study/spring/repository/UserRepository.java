package com.study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.spring.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
