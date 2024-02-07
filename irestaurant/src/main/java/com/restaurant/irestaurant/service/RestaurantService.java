package com.restaurant.irestaurant.service;

import java.util.List;

import com.restaurant.irestaurant.model.Restaurant;

public interface RestaurantService {
	Restaurant addRestaurant(Restaurant restaurant);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantId);
	List<Restaurant> getAll();
	Restaurant getById(int restaurantId);
	
	List<Restaurant> getByCity(String city);
	List<Restaurant> getByType(String type); 
	
	List<Restaurant> getByItemName(String itemName);
	List<Restaurant> getByCuisine(String cuisine);
}
