package com.example.sprtingbootfirstwebapplication.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.sprtingbootfirstwebapplication.model.Todo;
import com.example.sprtingbootfirstwebapplication.servieces.TodoService;
import java.util.Date;

import javax.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControler {
	 @Autowired
	 private TodoService service;
	 @RequestMapping(value = "/list-todos",method = RequestMethod.GET)
	   
	    public String sayHello(ModelMap model)  {
		 	String name=(String) model.get("name");
		 	model.put("todos",service.retrieveTodos(name));
	        return "list-todos";
	    }
	 @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
		public String showAddTodoPage(ModelMap model) {
			model.addAttribute("todo", new Todo(0, (String) model.get("name"), "Default Desc",
					new Date(), false));
			return "todo";
		}	 @RequestMapping(value="/delete-todo", method = RequestMethod.GET)
		public String deleteTodo(@RequestParam int id){
			service.deleteTodo(id);
			return "redirect:/list-todos";
		}
	 @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	 public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
			
			if(result.hasErrors()){
				return "todo";
			}
			
			service.addTodo((String) model.get("name"), todo.getDesc(), new Date(),
					false);
			return "redirect:/list-todos";
		}
	

	}
