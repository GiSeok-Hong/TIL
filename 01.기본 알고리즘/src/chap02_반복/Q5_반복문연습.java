package chap02_반복;

import java.util.Scanner;

public class Q5_반복문연습 {

	public static void main(String[] args) {
		// 연습문제 Q10   33p
		// 정수 b에서 정수 a를 뺀 값을 구합니다(b > a가 되도록 입력 받기)
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값：");
		int a = sc.nextInt();

		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = sc.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
		
		sc.close();
	} // end main

} // end class
