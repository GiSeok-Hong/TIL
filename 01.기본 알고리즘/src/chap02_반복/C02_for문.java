package chap02_반복;

import java.util.Scanner;

public class C02_for문 {

	public static void main(String[] args) {
		// 실습 1-5   29p
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
		System.out.print("n의 값：");
		int n = sc.nextInt();

		int sum = 0;					// 합

		for (int i = 1; i <= n; i++)
			sum += i;					// sum에 i를 더합니다.

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

		sc.close();
	} // end main

} // end class
