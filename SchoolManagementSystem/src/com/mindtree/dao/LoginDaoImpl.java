package com.mindtree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mindtree.entity.Person;

@Component
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public Person getPerson(String username) {
		return hibernateTemplate.get(Person.class, username);
	}

	@Override
	public String registerNewUser(Person p) {
		if( hibernateTemplate.get(Person.class, p.getUserName()) != null){
			return "";
		}
		return (String) hibernateTemplate.save(p);
	}

	@Override
	public List<Person> getCollection() {
		return hibernateTemplate.find("from Person");
	}

}
