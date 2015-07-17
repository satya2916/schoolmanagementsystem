package com.mindtree.controllers;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.entity.Person;
import com.mindtree.service.LoginService;

@Controller

public class PersonController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/{username}/person.view",method=RequestMethod.GET)	
	public @ResponseBody Person getEntity(@PathVariable(value="username") String username){
		return loginService.getUser(username);
		
	}
	
	@RequestMapping(value="/person.view",method=RequestMethod.GET,produces="application/json")	
	public @ResponseBody List<Person> getCollection(){
		return loginService.getPersons();
		
	}
	
	@RequestMapping(value="/person.view",method=RequestMethod.POST,consumes="application/json")	
	public @ResponseBody HttpStatus createEntity(@RequestBody Person person){
		if(loginService.addNewUser(person)){
			return HttpStatus.CREATED;
		}
		return HttpStatus.CONFLICT;
		
	}
	

}
