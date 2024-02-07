package com.restaurant.irestaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.irestaurant.model.Restaurant;
import com.restaurant.irestaurant.repository.RestaurantRepository;

@Service
public class RestaurantServiceImp implements RestaurantService {
	
	private RestaurantRepository restaurantRepository; 
	
	@Autowired
	public void setRestaurantRepository(RestaurantRepository restaurantRepository) {
		this.restaurantRepository =restaurantRepository;
	}
	
	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantRepository.save(restaurant);
	}
	

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		restaurantRepository.deleteById(restaurantId);
	}

	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getById(int restaurantId) {
		// TODO Auto-generated method stub
		Optional<Restaurant> restOpt =restaurantRepository.findById(restaurantId);
		if (restOpt.isPresent()) {
			return restOpt.get();
		}
		return null;
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByItemName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return null;
	}

}
