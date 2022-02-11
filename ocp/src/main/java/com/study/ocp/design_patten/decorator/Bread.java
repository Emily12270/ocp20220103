package com.study.ocp.design_patten.decorator;

public class Bread extends Food {

	public Bread() {
		name = "麵包";
		price = 40;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
