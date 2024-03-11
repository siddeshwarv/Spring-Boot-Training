package com.springboot.pratice.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.pratice.todo.Todo;

@Component
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"Python","learn python",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"Lenin","learn Java",LocalDate.now().plusYears(2),false));
		
	}
	
	public List<Todo> findByUsername(String username){
	return todos;	
	}
}
