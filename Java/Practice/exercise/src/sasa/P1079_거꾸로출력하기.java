package sasa;

import java.util.Scanner;

public class P1079_거꾸로출력하기 {

	public static void main(String[] args) {
		// 1079: [Java][배열 기초] 거꾸로 출력하기1, 2
		// 사용자로부터 10개의 정수를 입력 받아, 꺼꾸로 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 배열의 크기를 입력해주세요");
		int n = sc.nextInt();	// 배열의 크기를 사용자로부터 직접 입력 받음
		int[] arr = new int[n]; 
		System.out.println("숫자를 입력해주세요!");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // end for
		for(int i = (arr.length - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		} // end for
		
		
		
		
		
		sc.close();
	} // end main

} // end class
