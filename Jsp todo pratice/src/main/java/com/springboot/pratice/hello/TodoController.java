package com.springboot.pratice.hello;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.pratice.service.TodoService;
import com.springboot.pratice.todo.Todo;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private final TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
	
	@RequestMapping("list-todos")
	public String listAllTodos( ModelMap model) {
		List <Todo> todos = todoService.findByUsername("Python");
		model.addAttribute("todos",todos);
		return "listTodos";
	}
	
	
}
