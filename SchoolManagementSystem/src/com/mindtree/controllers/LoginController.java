package com.mindtree.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mindtree.entity.Person;
import com.mindtree.service.LoginService;

@org.springframework.stereotype.Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	
	@RequestMapping("/login.view")
	public String handleRequest(HttpServletRequest req,
			HttpServletResponse resp,Model model) throws Exception {
		
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		Person p = loginService.validateUser(uname, pwd);
		
		if(p != null){
			model.addAttribute("name", p.getfName()+p.getmName()+p.getlName());
			return "homepage"; 
		}
		
		model.addAttribute("msg", "Username or Password is invalid");
			
		return "index";
	}
	
	@RequestMapping("/adduser.view")
	public String addNewUser(Model model,HttpServletRequest req,
			HttpServletResponse resp){
		
		String msg = null;
		Person p = new Person();
		p.setfName(req.getParameter("fname"));
		p.setmName(req.getParameter("mname"));
		p.setlName(req.getParameter("lname"));
		p.setUserName(req.getParameter("username"));
		p.setPassword(req.getParameter("password"));
		
		if(loginService.addNewUser(p)){
			msg = "User registered successfully.";
		}else{
			msg = "User already exists.";
		}
		
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@RequestMapping("/adduserpage.view")
	public String addNewUserPage(Model model){
		return "registration";
	}

}
