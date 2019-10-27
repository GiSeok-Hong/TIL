package chap02_반복;

import java.util.Scanner;

public class Q10_직각이등변삼각형 {
	// 연습문제 Q15   40p
	// 왼쪽 아래, 왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드 작성하기
	
	// 왼쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		} // end for
		System.out.println();
	} // end triangleLB
	

	// 왼쪽 위가 직각인 이등변삼각형을 출력
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		} // end for
		System.out.println();
	} // end triangleLU
	

	// 오른쪽 위가 직각인 이등변삼각형을 출력
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		} // end for
		System.out.println();
	} // end triangleRU
	

	// 오른쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		} // end for
		System.out.println();
	} // end triangleRB
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("삼각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);

		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n); // 왼쪽 아래가 직각인 이등변삼각형

		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n); // 오른쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n); // 오른쪽 아래가 직각인 이등변삼각형
		
		sc.close();
		
	} // end main

} // end class
