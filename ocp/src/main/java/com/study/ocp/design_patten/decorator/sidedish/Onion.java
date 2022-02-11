package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Onion extends SideDish {
	public Onion(Food food) {
		super(food);
		name = "洋蔥";
		price= 7;
	}
}
