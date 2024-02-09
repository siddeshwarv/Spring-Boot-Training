package com.Demo.Mapping.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.Mapping.Repository.ContactRepository;
import com.Demo.Mapping.dto.ContactDTO;
import com.Demo.Mapping.entity.Contact;
import com.Demo.Mapping.mapper.ContactMapper;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ContactServiceImp implements ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	ContactMapper contactMapper;
	
	@Override
	public Contact saveContact(ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		log.info("This is save contatct service imp"+contactDTO.toString());
		log.info("This is contact to save"+contactMapper.toEntity(contactDTO).toString());
		Contact contact = contactMapper.toEntity(contactDTO);
		contact.setDate(LocalDate.now());
		return contactRepository.save(contact);
	}

	@Override
	public List<ContactDTO> getContact() {
		// TODO Auto-generated method stub
		List<Contact> contacts = contactRepository.findAll();
		return contactMapper.toDTOList(contacts);
	}

	@Override
	public ContactDTO getById(long id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id).map(contactMapper::toDTO).orElse(new ContactDTO());
	}

}
