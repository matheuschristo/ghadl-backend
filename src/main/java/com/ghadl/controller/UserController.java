package com.ghadl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghadl.dto.user.CreateUserDTO;
import com.ghadl.dto.user.UserDTO;
import com.ghadl.service.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/user")
public class UserController {
	
	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<CreateUserDTO> addUser(@RequestBody CreateUserDTO dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateUser(@RequestBody UserDTO dto, @PathVariable(value = "id") Long id) {
		service.update(dto, id);
		return ResponseEntity.status(HttpStatus.OK).body("User update successfully.");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletedUser(@PathVariable(value = "id") Long id) {
		service.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body("Establishment deleted successfully");
	}
	
}
