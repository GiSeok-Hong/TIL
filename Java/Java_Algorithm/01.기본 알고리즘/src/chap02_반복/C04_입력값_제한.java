package chap02_반복;

import java.util.Scanner;

public class C04_입력값_제한 {

	public static void main(String[] args) {
		// 실습 1C-2   34p
		// 2자리의 양수만 입력 받기
		
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("2자리의 정수를 입력하세요.");

		do {
			System.out.print("입력：");
			num = sc.nextInt();
		} while (num < 10 || num > 99);	 // 10보다 작거나 99보다 크면 반복

		System.out.println("변수 num의 값은 " + num + " 입니다.");
		
		sc.close();
	} // end main

} // end class
