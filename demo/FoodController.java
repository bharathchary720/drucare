package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController{
	@Autowired
	private FoodService foodservice;

	@RequestMapping("/waiter")
	public List<Food> getAll() {
		return  foodservice.getAllfoods();
	}
	@RequestMapping("/waiter/{item}")
	public Food getFood(@PathVariable String item) {
		return foodservice.getFood(item);
	}
	@RequestMapping(method=RequestMethod.POST,value="/waiter")
	public void addFood(@RequestBody Food food) {
		foodservice.addFood(food);
	}
	
	


}


