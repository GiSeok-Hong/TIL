package chap01_알고리즘이란;

public class Q4_세_값의_중앙값3 {
	// 연습문제 Q5   22p
	// 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있다.
	// 그러나 C2_세 값의 중앙값의 med3 메서드에 비해 효율이 떨어지는데 그 이유를 설명하시오.
	
	static int med3 (int a, int b, int c) {
		if((b >=a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
		
	} // end med3
	
	public static void main(String[] args) {

		

	} // end main

} // end class
