package com.lec.java.practice;

import java.util.Scanner;

public class Practice1074_두정수_사이의_구구단출력 {

	public static void main(String[] args) {
//		두 정수 사이의 구구단을 출력하기
//		띄어쓰기로 구분된 2개의 정수를 입력 받아, 두 정수를 포함한 사이의 구구단을 출력하기
//		 또한, 각 단 위에 2단 3단 과 같은 단명을 출력해야 한다. 
//
//		즉, 2 4 로 입력 되면 2단, 3단, 4단 을 출력하며
//		2단
//		2*1=2
//		 ....
//		 3단
//		3*1=3
//		 ... 
//		과 같이 출력한다.
//		단, 사용자로부터 2부터 9까지의 정수만을 입력 받는다고 가정한다.
//		단, 사용자는 입력 하는 두 정수 중 작은것 부터 입력한다고 한다. 

		Scanner sc = new Scanner(System.in);
		int one, two = 0;
		System.out.println("원하시는 숫자를 두 개 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a <= 0 || b <= 0) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
			while(true) {
				a = sc.nextInt();
				b = sc.nextInt();
				if(a > 0 && b > 0) {
					break;
				}
			} // end while
		} // end if (1 이상의 숫자 입력 받기)
		
//		one = (a < b ? a : b);   삼항연산자를 사용할 시 
//		two = (a < b ? b : a);
		
		if(a < b) {
			one = a;
			two = b;
		}else{
			one = b;
			two = a;
		} // end if
		
		for(int i = one; i <= two; i++ ) {
			System.out.println(i + " 단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			} // end for2
			System.out.println();
		} // end for
		
		sc.close();
	} // end main

} // end class
