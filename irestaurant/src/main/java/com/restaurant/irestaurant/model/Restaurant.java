package com.restaurant.irestaurant.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name="restaurant")
@Slf4j
@Data
public class Restaurant {
	@Id
	@GeneratedValue(generator="restaurant_gen",strategy=GenerationType.IDENTITY)
	private Integer restaurantId;
	@Column(name="restaurant name")
	private String  restaurantName;
	@Column(name="city")
	private String city;
	@Column(name="type")
	private String type;
	@OneToMany
	Set<Item> items;
	public Restaurant() {
		log.info("Restaurant entity is called!!!");
	}
	
}
