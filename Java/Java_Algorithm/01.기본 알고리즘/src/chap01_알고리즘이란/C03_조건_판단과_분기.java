package chap01_알고리즘이란;

import java.util.Scanner;

public class C03_조건_판단과_분기 {
	// 실습 1-3   22p

	public static void main(String[] args) {
		// 입력한 정수값의 부호를 판단하여 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int n = sc.nextInt();

		if (n > 0)
			System.out.println("이 수는 양수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0입니다.");

		sc.close();
	} // end main

} // end class
