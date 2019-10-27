package chap02_반복;

import java.util.Scanner;

public class Q11_피라미드 {
	// 연습문제 Q16   40p
	// n단의 피라미드를 출력하는 메서드를 작성하기 spira
	// i행에는 (i-1)*2+1 개의 기호 문자 *가 출력 되도록 하기(마지막 n행에는 (n-1)*2+1개가 출력)
	
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');					// 공백 출력
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		} // end for
		
	} // end spira
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);

		spira(n); 		// 피라미드를 나타냄
		
		sc.close();
	} // end main

} // end class
