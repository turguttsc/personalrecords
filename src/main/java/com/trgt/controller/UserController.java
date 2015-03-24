package com.trgt.controller;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



import com.trgt.entity.User;
import com.trgt.service.UserService;

@ManagedBean
@ViewScoped
public class UserController  implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private List<User> users;
	
	@ManagedProperty("#{userService}")
	private UserService userService;
	
	@PostConstruct
	public void loadUsers(){
		users = userService.getAllUsers();
	}
	
	
	public String sayHello(){
		
		return "hello";
	}
	
	

	public void save(){
		userService.save(user);
		user = new User();
		users = userService.getAllUsers();
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"User Saved",null));
	}
	
	
	
	public User getUser() {
		return user;
	}

	public void delete(User user){
		userService.delete(user);
		users = userService.getAllUsers();
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"User Deleted",null));
	}
	
	public void clear(){
		user = new User();
	}
	
	
	
	
	
	
	
	public void setUser(User user) {
		this.user = user;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
