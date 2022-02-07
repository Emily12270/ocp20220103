package com.study.ocp.day09;

public class USCurrencyFactory {
	public static void main(String[] args) {
		//製造5每分地硬幣
		USCurrency usCoin1 = USCurrency.NICKLE;
		System.out.println(usCoin1.getValue());
		
		USCurrency usCoin2 = USCurrency.NICKLE;
		System.out.println(usCoin2.getValue());
	}
	
}
