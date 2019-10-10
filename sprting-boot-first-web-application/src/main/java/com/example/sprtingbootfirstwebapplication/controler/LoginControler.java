package com.example.sprtingbootfirstwebapplication.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sprtingbootfirstwebapplication.servieces.LoginServiece;


@Controller
public class LoginControler {
	 @Autowired
	 private LoginServiece logser;
	 @RequestMapping(value = "/login",method = RequestMethod.GET)
	   
	    public String sayHello(ModelMap model)  {
	        return "login";
	    }
	 @RequestMapping(value = "/login",method = RequestMethod.POST)
	   
	    public String saywelcome(ModelMap model,@RequestParam String Name, @RequestParam String password)  {
		 	
		 boolean val=logser.validateuser(Name, password);
		 
		 	if(!val)
		 	{
		 		model.put("ErrorMessage","invalid credentials");
		 		return "login";
		 	}
		 	
		 	model.put("mame", Name);
		 	model.put("password",password);
	        return "welcome";
	    }

	}
