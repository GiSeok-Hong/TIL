package chap01_알고리즘이란;

public class Q03_세_값의_중앙값2 {
	// 연습문제 Q4   22p
	
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;  // 1. a > b > c   2. a > b = c
						   // 3. a = b > c   4. a = b = c
			else if (a <= c)
				return a;  // 1. a = c > b   2. c > a > b
		                   // 3. c > a = b
			else
				return c;  // a > c > b
		else if (a > c)
			return a;      // b > a > c
		else if (b > c)
			return c;      // 1. b > a = c   2. b > c > a
		else
			return b;      // 1. b = c > a   2. c > b > a
		
	} // end med3
	
	public static void main(String[] args) {
		// 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하기

		System.out.println("med3(3,2,1) = " + med3(3, 2, 1));		// [A] a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2));		// [B] a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2));		// [C] a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3));		// [D] a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3));		// [E] c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2));		// [F] a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3));		// [G] a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3));		// [H] c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1));		// [I] b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2));		// [J] b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2));		// [K] b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3));		// [L] b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3));		// [M] c＞b＞a
		
		
	} // end main
 
} // end class
