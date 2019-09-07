package chap01_알고리즘이란;

import java.util.Scanner;

public class Q2_세값의최소값 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	} // end min3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최소값을 구합니다.");
		
		System.out.println("첫번째 값：");
		int a = sc.nextInt();
		
		System.out.println("두번째 값：");
		int b = sc.nextInt();
		
		System.out.println("세번째 값：");
		int c = sc.nextInt();
		
		min3(a, b, c);
		System.out.println();
		System.out.println("min3 : " + a + "," + b + "," + c + "," + 
							" 중 가장 큰 값은 " + min3(a, b, c) + " 입니다.");
		
		sc.close();
	} // end main

} // end class
