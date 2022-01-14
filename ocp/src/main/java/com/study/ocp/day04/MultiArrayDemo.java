package com.study.ocp.day04;

public class MultiArrayDemo{

	public static void main(String[] args) {
		char[][] ttt = {
				{'0', 'x', '0'},
				{' ', 'x', 'x'},
				{'0', ' ', '0'}	
		};
		System.out.println(ttt);
		System.out.println(ttt[0]);
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
		//如何讓 x 獲勝 ?
		ttt[1][0]= 'x';
		ttt[2][1]= 'x';
		System.out.println(ttt[0]);
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
	}

}
