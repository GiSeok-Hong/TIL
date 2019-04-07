package com.lec.java.practice;

import java.util.Scanner;

public class Practice04_라인단위_입력 {

	public static void main(String[] args) {
		// 라인단위로 입력받아 출력하기
		// 줄단위로 문자 또는 숫자를 입력받아 첫번째 줄을 출력하는 프로그램을 작성해보자.
		/*
		 * 입력 예
		 * Hello
			Java
			World!!
			
		 * 출력 예
		 * Hello
		 */
		
		System.out.println("원하시는 글을 써주세요~");
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		System.out.println(A);
		sc.close();
	} // end main

} // end class
