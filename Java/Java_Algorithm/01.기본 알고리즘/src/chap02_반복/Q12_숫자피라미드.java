package chap02_반복;

import java.util.Scanner;

public class Q12_숫자피라미드 {
	// 연습문제 Q16   40p
	// i행에 출력하는 숫자는 i % 10으로 구하기
	
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print(i % 10);
			System.out.println(); 						// 개행(줄변환)
		}
	} // end npira

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);

		npira(n); // 피라미드를 나타냄
		
		sc.close();
	} // end main

}
