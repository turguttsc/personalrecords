package com.trgt.entity;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class User {
	
	 @Id
	 private String id ;
	 
	 @NotNull
	 @Size(min=2, message ="Name cannot be null")
	 private String name ;
	 @NotNull
	 @Size(min=2, message ="Surname cannot be null")
	 private String surname ;
	 
	 private String phoneNum ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
}
