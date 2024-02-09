package com.Demo.Mapping.service;

import java.util.List;

import com.Demo.Mapping.dto.ContactDTO;
import com.Demo.Mapping.entity.Contact;

public interface ContactService {

	Contact saveContact(ContactDTO contactDTO);

	List<ContactDTO> getContact();
	
	ContactDTO getById(long id);

}
