package com.ghadl.mapper;

import org.springframework.stereotype.Service;

import com.ghadl.dto.user.CreateUserDTO;
import com.ghadl.entity.UserEntity;

@Service
public class UserMapper {

	public CreateUserDTO toDTO(UserEntity user) {
		return new CreateUserDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
	}
	
	public UserEntity toEntity(CreateUserDTO dto) {
		return new UserEntity(dto.id(), dto.name(), dto.email(), dto.password());
	}
}
