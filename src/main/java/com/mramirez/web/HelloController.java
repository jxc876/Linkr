package com.mramirez.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mramirez.model.User;

@Controller
public class HelloController {
		
	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
	public @ResponseBody User getHello(@PathVariable("id") int id){
		User user = new User(id, "FirstName", "LastName");
		return user;
	}

}
