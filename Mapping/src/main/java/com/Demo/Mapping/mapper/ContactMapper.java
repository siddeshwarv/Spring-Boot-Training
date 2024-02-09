package com.Demo.Mapping.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.Demo.Mapping.dto.ContactDTO;
import com.Demo.Mapping.entity.Contact;

@Mapper(componentModel="spring")
public interface ContactMapper {
	@Mapping(source="emailId",target="email")
	Contact toEntity(ContactDTO contactDTO);
	@Mapping(source="email",target="emailId")
	ContactDTO toDTO(Contact contact);
	@Mapping(source="email",target="emailId")
	List<ContactDTO> toDTOList(List<Contact> contact);
} 
