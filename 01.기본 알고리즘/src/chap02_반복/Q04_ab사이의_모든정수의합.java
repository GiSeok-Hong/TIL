package chap02_반복;

import java.util.Scanner;

public class Q04_ab사이의_모든정수의합 {

	
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값
		int sum = 0; // 합
		
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		} // end if
	
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
		
	} // end sumof
	
	
	public static void main(String[] args) {
		// 연습문제 Q9   30p
		// 정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성
		
		Scanner sc = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값：");
		int a = sc.nextInt();
		System.out.print("b의 값：");
		int b = sc.nextInt();

		System.out.println("정수 " + a + ", " + b +" 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
		
		sc.close();
		
	} // end main

} // end class
