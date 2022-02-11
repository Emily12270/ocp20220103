package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Tuna extends SideDish{

	public Tuna(Food food) {
		super(food);
		name = "鮪魚";
		price = 26;
	

	
	}

}
