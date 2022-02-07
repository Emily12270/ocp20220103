package com.study.ocp.day09;

public class BallEqualsTest {

	public static void main(String[] args) {
		Ball b1 = new Ball("Blue", 100);
		Ball b2 = new Ball("Red", 100);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
