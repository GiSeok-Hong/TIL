package chap02_반복;

import java.util.Scanner;

public class C3_양수만_입력하기 {

	public static void main(String[] args) {
		// 실습 1-6   32p

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을구합니다.");

		do {
			System.out.print("n의 값：");
			n = sc.nextInt();
		} while (n <= 0);

		int sum = 0;		// 합

		for (int i = 1; i <= n; i++)
			sum += i;		// sum에 i를 더함

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		sc.close();
	} // end main 

} // end class
