package chap02_반복;

import java.util.Scanner;

public class Q06_자리수표현 {

	public static void main(String[] args) {
		// 연습문제 Q11   33p
		// 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성
		// ex) 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하면 된다.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = sc.nextInt();
		} while (n <= 0);		// 입력한 수 n이 양수일 때 DoWhile 종료

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			// System.out.println("n의 값:" + n);
			no++;
		}

		System.out.println(n + "은 " + no + "자리입니다.");
		sc.close();
		
	} // end main

} // end class
