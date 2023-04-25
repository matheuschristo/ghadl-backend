package com.ghadl.service;

import com.ghadl.dto.user.CreateUserDTO;
import com.ghadl.dto.user.UserDTO;

public interface UserService {
	
	CreateUserDTO save(CreateUserDTO dto);
	
	void update(UserDTO dto, Long id);
	
	void delete(Long id);
}
