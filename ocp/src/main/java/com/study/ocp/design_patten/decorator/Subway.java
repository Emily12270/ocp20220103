package com.study.ocp.design_patten.decorator;

import com.study.ocp.design_patten.decorator.sidedish.Egg;
import com.study.ocp.design_patten.decorator.sidedish.Ham;
import com.study.ocp.design_patten.decorator.sidedish.Lettuce;
import com.study.ocp.design_patten.decorator.sidedish.Olives;
import com.study.ocp.design_patten.decorator.sidedish.Onion;
import com.study.ocp.design_patten.decorator.sidedish.Tomato;
import com.study.ocp.design_patten.decorator.sidedish.Tuna;

public class Subway {

	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Olives(food);
		food = new Tomato(food);
		food = new Tuna(food);
		food = new Onion(food);
		food = new Egg(food);

		System.out.println(food.getName());
		System.out.println(food.getPrice());
	}

}
