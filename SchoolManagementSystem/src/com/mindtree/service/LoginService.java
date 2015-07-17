package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.dao.LoginDao;
import com.mindtree.entity.Person;

@Component
public class LoginService {
	
	@Autowired
	public LoginDao loginDao;
	
	public Person validateUser(String username, String pwd){
		Person p = loginDao.getPerson(username);
		
		if(p != null && pwd.equals(p.getPassword())){
			return p;
		}
		
		return null;
	}
	public Person getUser(String username){
		 Person p = loginDao.getPerson(username);
		
		if(p != null ){
			return p;
		}
		
		return null;
	}
	
	public List<Person> getPersons(){
		return loginDao.getCollection();
	}
	
	public boolean addNewUser(Person person){
		
		String str = loginDao.registerNewUser(person);
		
		if(str == null || "".equals(str)){
			return false;
		}
		
		return true;
	}

}
