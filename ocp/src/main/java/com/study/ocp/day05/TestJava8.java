package com.study.ocp.day05;
import java.util.Arrays;

public class TestJava8 {
	public static void main(String[] args) {
		
		Integer[] numberArray = new Integer[] {30,40,50};
		
		// Java 7 before (For-Each Loop)
		Integer sum1 = 20;
		
		for(Integer e : numberArray) {
			sum1 = sum1 + e;
		}
		
		System.out.println("sum1: " + sum1);
		
		// Java 7 before (For-Loop)
		Integer sum3 = 20;
		for(int i=0; i< numberArray.length; i++) {
			sum3 = sum3 + numberArray[i];
		}
		
		System.out.println("sum3: " + sum3);
		
		
		// Java 8
		Integer sum2 = Arrays.stream(numberArray).reduce(20, Integer::sum);
		
		System.out.println("sum2: " + sum2);
		
		System.out.println(sum1.equals(sum2));
	}
}
