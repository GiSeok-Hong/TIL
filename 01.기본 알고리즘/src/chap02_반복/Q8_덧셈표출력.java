package chap02_반복;

public class Q8_덧셈표출력 {

	public static void main(String[] args) {
		// 연습문제 Q13   38p
		// 덧셈을 출력하는 프로그램 작성
		
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		} // end for
		
	} // end main

} // end class
