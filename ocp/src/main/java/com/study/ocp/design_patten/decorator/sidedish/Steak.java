package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Steak extends SideDish{

	public Steak(Food food) {
		super(food);
		name = "牛排";
		price = 88;
	}
}