package com.ghadl.service;

import org.springframework.stereotype.Service;

import com.ghadl.dto.exception.UserEmailAlreadyRegisteredException;
import com.ghadl.dto.exception.UserNotFoundException;
import com.ghadl.dto.user.CreateUserDTO;
import com.ghadl.dto.user.UserDTO;
import com.ghadl.entity.UserEntity;
import com.ghadl.mapper.UserMapper;
import com.ghadl.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;
	private final UserMapper mapper;
	
	public UserServiceImpl(UserRepository repository, UserMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public CreateUserDTO save(CreateUserDTO dto) {
		
		if(repository.existsByEmail(dto.email()))
			throw new UserEmailAlreadyRegisteredException("Email "+ dto.email() +" is already registered.");
		
		UserEntity user = mapper.toEntity(dto);
		UserEntity userSaved = repository.save(user);
		
		return mapper.toDTO(userSaved);
	}

	public void update(UserDTO dto, Long id) {
		
		UserEntity user = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User "+ id +" was not found."));
		
		user.setName(dto.name());
		user.setEmail(dto.email());
		
		repository.save(user);
	}

	public void delete(Long id) {
		
		if(!repository.existsById(id))
			throw new UserNotFoundException("User "+ id +" was not found.");
		
		repository.deleteById(id);
	}

}
