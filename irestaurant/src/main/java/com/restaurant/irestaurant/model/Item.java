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
@Table(name="item")
@Slf4j
@Data
public class Item {
	@Id
	@GeneratedValue(generator="item_gen",strategy=GenerationType.AUTO)
	private Integer itemId;
	@Column(name="item name")
	private String itemName;
	@Column(name="item price")
	private double itemPrice;
	@Column(name="category")
	private String  category;
	@Column(name="cuisine")
	private String cuisine;
	
	public Item() {
		log.info("This is item consturcter");
	}

}
