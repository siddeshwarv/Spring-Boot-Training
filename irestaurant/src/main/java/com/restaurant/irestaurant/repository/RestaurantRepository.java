package com.restaurant.irestaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.irestaurant.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
	
}
