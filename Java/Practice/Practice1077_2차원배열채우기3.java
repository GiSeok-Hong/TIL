package com.lec.java.practice;

import java.util.Scanner;

public class Practice1077_2차원배열채우기3 {

	public static void main(String[] args) {
		// 1077: 2차원 배열 채우기3
		// 사용자로부터 정수 하나를 입력 받아 다음과 같이 2차원배열을 채우고, 출력하시오.
		// 입력 예시 5
		// 출력 예시
//		아래 예시와 일치하는 규칙을 가진 N * N 크기의 2차원 배열 
//		21 22 23 24 25 
//		16 17 18 19 20 
//		11 12 13 14 15 
//		6 7 8 9 10 
//		1 2 3 4 5 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 숫자를 입력해주세요");
		int a = sc.nextInt();
		int [][] arr = new int [a][a];
		
		for(int i = 0; i < arr.length; i++) {
			int x = a * (a - (i + 1));
			for(int j = 0; j < arr[a - 1].length; j++) {
				x++;
				arr [i][j] = x;
				System.out.print(arr[i][j] + " ");
			} // end for2
			System.out.println();
		} // end for
		
		
		
		
		sc.close();
	} // end main

} // end class
