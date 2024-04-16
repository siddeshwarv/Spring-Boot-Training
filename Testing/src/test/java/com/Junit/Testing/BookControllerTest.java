package com.Junit.Testing;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.Junit.Testing.controller.BookController;
import com.Junit.Testing.entity.Book;
import com.Junit.Testing.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
public class BookControllerTest {
	private  MockMvc mockMvc;
	ObjectMapper objectMapper = new ObjectMapper();
	ObjectWriter objectWriter = objectMapper.writer();
	
	@Mock
	private BookRepository bookRepository;
	
	@InjectMocks
	private BookController bookController;
	
	Book RECORD_1 = new Book(1,"Atomic Habits","APple",10);
	Book RECORD_2 = new Book(2,"Atomic3 Habits","3APple",10);
	Book RECORD_3 = new Book(3,"Atomic Hdabits","AdPple",10);
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc MockMvcBuilders.standaloneSetup(bookController).build();
	}
	
	@Test
	public void getAllRecords_success() throws Exception{
		List<Book> records = new ArrayList<>(Arrays.asList(RECORD_1,RECORD_2,RECORD_3));
		
		Mockito.when(bookRepository.findAll()).thenReturn(records);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/book")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$",hasSize(3))
						).andExpect(jsonPath("$[2].name",is("Grooking ALgo")))
				);
						
		);
	}
}
