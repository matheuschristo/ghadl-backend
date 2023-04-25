package com.ghadl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghadl.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	boolean existsByEmail (String email);
}
