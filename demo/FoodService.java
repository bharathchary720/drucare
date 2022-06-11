package com.example.demo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	private List<Food> foods = new ArrayList<>(Arrays.asList( 
			new Food("idle","ok","50"),
			new Food("puri","good","40"),
			new Food("dosa","super","70")
			));

	public List<Food>getAllfoods(){
		return foods;
	}
	public Food getFood(String item) {
		return foods.stream().filter(f->f.getItem().equals(item)).findFirst().get();
	}
	
	public void addFood(Food food) {
	 foods.add(food);
		
	}

}


