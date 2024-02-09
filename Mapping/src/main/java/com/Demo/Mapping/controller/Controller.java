package com.Demo.Mapping.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.Mapping.dto.ContactDTO;
import com.Demo.Mapping.entity.Contact;
import com.Demo.Mapping.service.ContactService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class Controller {
	@Autowired
	ContactService contactService;
	@PostMapping("/contact")
	public  ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
		log.info("hey controller here contactDTO"+contactDTO.toString());
		return ResponseEntity.ok(contactService.saveContact(contactDTO));
	}
	@GetMapping("/contact")
	public  ResponseEntity<List<ContactDTO>> getContact(){
		return ResponseEntity.ok(contactService.getContact());
	}
	
	@GetMapping("/contact/{id}")
	public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
		return ResponseEntity.ok(contactService.getById(id));
	}
}
