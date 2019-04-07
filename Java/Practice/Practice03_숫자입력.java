package com.lec.java.practice;

import java.util.Scanner;

public class Practice03_숫자입력 {

	public static void main(String[] args) {
		// 숫자를 입력받아 int형 변수에 저장한 후 출력하는 프로그램을 작성해 보자.
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}

}
