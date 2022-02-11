package com.study.ocp.design_patten.decorator.sidedish;

import com.study.ocp.design_patten.decorator.Food;

public class Olives extends SideDish {
	public Olives(Food food) {
		super(food);
		name = "橄欖";
		price= 10;
	}
}
