package chap02_반복;

public class C5_다중루프 {

	public static void main(String[] args) {
		// 실습 1-7   36p
		// 곱셈표를 출력하기
		
		System.out.println("----- 곱셈표 -----");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		} // end for
		
	} // end main

} // end class
