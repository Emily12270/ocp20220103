package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Egg extends SideDish{

	public Egg(Food food) {
		super(food);
		name = "雞蛋";
		price= 10;
	}
}