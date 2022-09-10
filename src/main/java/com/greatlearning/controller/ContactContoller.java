package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Contact;
import com.greatlearning.service.ContactService;

@RestController
@CrossOrigin(origins = "*")
public class ContactContoller {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/contact")
   public Contact saveContact(@RequestBody Contact contact)
   {
		System.out.println("===========");
		return  contactService.savecontact(contact);
   }
	
	@GetMapping("/listcontact")
	public List<Contact> list()
	{
		return contactService.getContacts();
	}
}
