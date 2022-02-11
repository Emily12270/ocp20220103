package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Lettuce extends SideDish{
	
	public Lettuce(Food food) {
		super(food);
		name = "生菜";
		price= 15;
	}
}
