package com.example.sprtingbootfirstwebapplication.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.sprtingbootfirstwebapplication.servieces.LoginServiece;


@Controller
@SessionAttributes("name")
public class WelcomeControler {
	 @Autowired
	 private LoginServiece logser;
	 @RequestMapping(value = "/",method = RequestMethod.GET)
	   
	    public String sayHello(ModelMap model)  {
		 model.put("name", "varun");
	        return "welcome";
	    }
	 private String getLoggedInUserName(ModelMap model) {
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

			if (principal instanceof UserDetails)
				return ((UserDetails) principal).getUsername();

			return principal.toString();
		}
	
	}
