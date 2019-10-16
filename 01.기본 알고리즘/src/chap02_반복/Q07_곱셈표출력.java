package chap02_반복;

public class Q07_곱셈표출력 {

	public static void main(String[] args) {
		// 연습문제 Q12   38p
		// 곱셈표를 출력하는 프로그램 작성 (구분선은 |, - , + 사용하기)
		
		// System.out.printf(format, args);
		// format에는 %d, %f, %s, %c 가 들어갈수 있다.
		// args에는 %* 에 들어갈 인자값이 들어갑니다. (* 안에는 d, f, s, c가 들어갈 수 있음)
		// https://hongku.tistory.com/8 

		
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);   // 3자리의 정수형을 출력한다는 뜻, 한 자리면 앞에 빈 공간을 2칸 두고 출력 
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		} // end for
		
	} // end main

} // end class
