package chap01_알고리즘이란;

import java.util.Scanner;

public class Q01_네_값의_최댓값 {
	// 연습문제 Q1   19p
	
	static void max4(int a, int b, int c, int d) {
		// void 는 return 값이 없다.
		
		int max = a;
		
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		System.out.println(a + "," + b + "," + c + "," + d + " 중 가장 큰 값은 " + max + " 입니다.");

	} // end max4
	
	static int max5(int a, int b, int c, int d) {
		// int 형의 return 값이 필요하다.
		
		int max = a;
		
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
		
	} // end max5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("네 정수의 최댓값을 구합니다.");
		
		System.out.println("첫번째 값：");
		int a = sc.nextInt();
		
		System.out.println("두번째 값：");
		int b = sc.nextInt();
		
		System.out.println("세번째 값：");
		int c = sc.nextInt();
		
		System.out.println("네번째 값：");
		int d = sc.nextInt();
		
		max4(a, b, c, d);
		System.out.println();
		System.out.println("max5 : " + a + "," + b + "," + c + "," + 
							d + " 중 가장 큰 값은 " + max5(a, b, c, d) + " 입니다.");
		
		sc.close();
	} // end main

} // end class
