package chap02_반복;

import java.util.Scanner;

public class Q01_while문 {

	public static void main(String[] args) {
		// 연습문제 Q6   29p
		// C1에서 while문이 종료될 때 변수 i 값이 n + 1 이 됨을 확인하기 (변수 i 값을 출력하도록 만들기)
		
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
		System.out.println("변수 i의 값은 " + i + " 입니다");
		sc.close();

	}// end main

}  // end class
