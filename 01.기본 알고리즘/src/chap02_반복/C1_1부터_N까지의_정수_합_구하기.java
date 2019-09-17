package chap02_반복;

import java.util.Scanner;

public class C1_1부터_N까지의_정수_합_구하기 {

	public static void main(String[] args) {
		// 실습 1-4   27p
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
 		System.out.print("n의 값：");
		int n = sc.nextInt();

		int sum = 0;				// 합
		int i = 1;
		
		
		// while 문 반복
		while (i <= n) {			// i가 n 이하면 반복합니다.
			sum += i;				// sum에 i를 더합니다.
			i++;					// i 값을 1만큼 증가시킵니다.
		} // end while
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

		sc.close();
		
	} // end main

} // end class
