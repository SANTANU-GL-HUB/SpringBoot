package org.tech.debu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.tech.debu.model.User;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/api/v1")
public class AppController {
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id) {
		
		return ResponseEntity<>(u,HttpStatus.OK);
	}
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		return ResponseEntity<>(u,HttpStatus.OK);
	}
	@PutMapping("/user/{id}")
	public ResponseEntity<User> modifyUser(@PathVariable String id,@RequestBody User user) {
		
		return ResponseEntity<>(u,HttpStatus.OK);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> removeUser(@PathVariable String id) {
		
		return ResponseEntity<>(u,HttpStatus.OK);
	}


}
