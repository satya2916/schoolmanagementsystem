package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Person;

public interface LoginDao {
	
	public Person getPerson(String username);
	public String registerNewUser(Person p);
	public List<Person> getCollection();

}
