package com.lec.java.practice;

import java.util.Scanner;

public class Practice1078_2차원배열채우기4 {

	public static void main(String[] args) {
		// 1078: 2차원 배열 채우기4
		// 사용자로부터 정수 하나를 입력 받아, 아래 예시와 같이 2차원 배열을 출력하시오. 
		// 입력 예시 5 아래 예시와 같은 규칙의 N * N 2차원 배열
//	    25 24 23 22 21 
//		20 19 18 17 16 
//		15 14 13 12 11 
//		10 9 8 7 6 
//		5 4 3 2 1 

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 숫자를 입력해주세요");
		int a = sc.nextInt();
		int [][] arr = new int [a][a];
		
		for(int i = 0; i < arr.length; i++) {
			int x = a * (a - i);
			for(int j = 0; j < arr[a - 1].length; j++) {
				arr[i][j] = x;
				x--;
				System.out.print(arr[i][j] + " ");
			} // end for2
			System.out.println();
		} // end for
		
		sc.close();
	} // end main

} // end class
