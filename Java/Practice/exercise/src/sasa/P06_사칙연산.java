package sasa;

import java.util.Scanner;

public class P06_사칙연산 {
	
	static void Plus(int a, int b) {
		int a1 = a;
		int b1 = b;
		System.out.println(a1 + " + " + b1 + " 의 결과는 " +(a1 + b1) + " 입니다");
		System.out.println();
	} // end Plus

	static void Minus(int a, int b) {
		int a1 = a;
		int b1 = b;
		System.out.println(a1 + " - " + b1 + " 의 결과는 " +(a1 - b1) + " 입니다");
		System.out.println();
	} // end Minus
	
	static void Times(int a, int b) {
		int a1 = a;
		int b1 = b;
		System.out.println(a1 + " * " + b1 + " 의 결과는 " +(a1 * b1) + " 입니다");
		System.out.println();
	} // end Times
	
	static void Divide(int a, int b) {
		int a1 = a;
		int b1 = b;
		System.out.println(a1 + " / " + b1 + " 의 결과는 " +(a1 / b1) + " 이고 나머지는 " + a1 % b1 + " 입니다" );
		System.out.println();
	} // end Divide
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Plus(a,b);
		Minus(a,b);
		Times(a,b);
		Divide(a,b);
		
		sc.close();
	} // end main

} // end class
