package com.lec.java.practice;

import java.util.Scanner;

public class Practice1086_배열의값찾기 {

	public static void main(String[] args) {
		// 1086: [Java][PYTHON] 배열에 값 찾기1
		//사용자로부터 오름차순으로 정렬되어 있는 10개의 정수를 입력받는다.
		// 이 이후 한개의 정수를 입력 받아, 입력 받은 정수가 몇번째 입력 받은 정수인지 출력하는 프로그램을 작성하시오
//		첫번째줄: 오름차순으로 정렬되어 있는 정수 10개  ( 0 ~ 1000 )
//		두번째줄: 찾을 정수
		// 입력 예시
//		1 2 3 4 5 6 7 8 9 10
//		5
		
//		몇번째 입력 받은 정수인지 출력
//		 단, 입력 받은 정수가 없을 경우 -1 을 출력하시오.
		// 출력 예시
		// 5
		// Java.util.Arrays 에 포함되어 있는 .binarySearch 를 사용해보자.
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		System.out.println("숫자를 10 번 입력해주세요");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // end for
		
		System.out.println();
		System.out.println("찾으실 숫자를 입력해주세요");
		int sel = sc.nextInt();
		
		int idx = binarySearch(arr, sel);
		
		if(idx == -1) {
			System.out.println("값이 없습니다 " + idx);
		}else {
			System.out.println("찾으시는 숫자는 arr[" + idx + "] 에 있습니다.");
		}
		sc.close();
	} // end main

	public static int binarySearch(int[] a,int key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		} // end for
		return -1;
	} // end binarySearch
	
	
} // end class
