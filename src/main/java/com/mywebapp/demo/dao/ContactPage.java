package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ContactPage {

	@Id
	private int contactId;
	private String[] address_key;
	private String[] address_value;
	
	public ContactPage() {
		
		String[] address_key = {
	        "Permannent Address", 
	        "Email", 
	        "LinkedIn"			
		};
		
		String[] address_value = {
	        "Jabalpur, Madhya Pradesh (482002), India", 
	        "ashhark31@gmail.com", 
	        "linkedin.com/in/mak27072000"			
		};
		
		setContactId(1);
		setAddress_key(address_key);
		setAddress_value(address_value);
	}
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String[] getAddress_key() {
		return address_key;
	}
	public void setAddress_key(String[] address_key) {
		this.address_key = address_key;
	}
	public String[] getAddress_value() {
		return address_value;
	}
	public void setAddress_value(String[] address_value) {
		this.address_value = address_value;
	}
	
}
