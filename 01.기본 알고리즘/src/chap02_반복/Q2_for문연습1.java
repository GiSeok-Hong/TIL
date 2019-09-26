package chap02_반복;

import java.util.Scanner;

public class Q2_for문연습1 {

	public static void main(String[] args) {
		// 연습문제 Q7   30p
		// C2를 참고하여 n이 7이면 '1 + 2 + ... + 7 = 28' 로 출력하는 프로그램 작성하기
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
		System.out.print("n의 값：");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum에 i를 더함
		} // end for
		
		System.out.println(" = " + sum);
		
		sc.close();
	} // end main

} // end class
