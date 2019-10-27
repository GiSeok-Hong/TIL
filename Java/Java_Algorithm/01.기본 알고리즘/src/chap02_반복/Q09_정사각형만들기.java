package chap02_반복;

import java.util.Scanner;

public class Q09_정사각형만들기 {

	public static void main(String[] args) {
		// 연습문제 Q14   38p
		// 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("정사각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는：");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
		
		sc.close();
		
	} // end main

} // end class
