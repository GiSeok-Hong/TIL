package chap01_알고리즘이란;

import java.util.Scanner;


public class C2_세_값의_중앙값 {
	// 실습 1C-1   21p

	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
		
	} // end med3
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = sc.nextInt();
		System.out.print("b의 값：");	
		int b = sc.nextInt();
		System.out.print("c의 값：");	
		int c = sc.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");

		sc.close();
		
	} // end main

} // end class
