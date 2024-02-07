package com.restaurant.irestaurant;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restaurant.irestaurant.model.Item;
import com.restaurant.irestaurant.model.Restaurant;
import com.restaurant.irestaurant.service.RestaurantService;

@SpringBootApplication
public class IrestaurantApplication  {

	public static void main(String[] args) {
		SpringApplication.run(IrestaurantApplication.class, args);
	}
	
	
	
}
