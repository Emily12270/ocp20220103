package com.study.ocp.day08_4;

public class SingleTonTest {

	public static void main(String[] args) {
		//SingleTon s1 = new SingleTon();
		//SingleTon s2 = new SingleTon();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());
	}

}
