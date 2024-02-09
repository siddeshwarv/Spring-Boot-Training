package com.Demo.Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.Mapping.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long>{
	
}
