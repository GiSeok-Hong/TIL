package chap01_알고리즘이란;

import java.util.Scanner;	// import 선언.   java.util 패키지는 Scanner 클래스가 소속된 곳 

public class C01_세_값의_최댓값 {

	
	// 3개의 입력값 중 최대값을 구하는 메서드
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
		
	} // end max3
	
	
	public static void main(String[] args) {
		// 실습 1-1   13p
		
		Scanner sc = new Scanner(System.in);
		// System.in 은 키보드와 연결된 표준 입력 스트림(standard input stream)
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	int a = sc.nextInt();
		
		System.out.print("b의 값：");
		int b = sc.nextInt();
		
		System.out.print("c의 값：");
		int c = sc.nextInt();
		
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;

		System.out.println("최댓값은 " + max + "입니다.");
		System.out.println();
		
		sc.close();
		
		
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// [A] a＞b＞c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// [B] a＞b＝c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// [C] a＞c＞b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// [D] a＝c＞b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// [E] c＞a＞b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// [F] a＝b＞c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// [G] a＝b＝c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// [H] c＞a＝b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// [I] b＞a＞c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// [J] b＞a＝c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// [K] b＞c＞a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// [L] b＝c＞a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// [M] c＞b＞a
		
		
	} // end main

	

	
} // end class 
