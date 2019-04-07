package com.lec.java.hello;

public class Hello {

	public static void main(String[] args) {

		System.out.println(777); // 정수,
		System.out.println("Hello Java"); // "~" 문자열 (String)

		// print(), println() 차이
		System.out.print(777);
		System.out.println("Hello Java");

		System.out.println(3.14);

		System.out.println(10 + 20); // 여기서 덧셈( + ) 은 산술연산

		System.out.println("10" + "20"); // 여기서 덧셈 ( + ) 은 문자열 연결(concatenation)

		// 연산 : operation 연산자 : operator 피연산자 : operand

		// + 연산자는 피연산자 중 하나라도 문자열이면 문자열 연산을 한다
		System.out.println(80 + "1020"); // "801020"

		System.out.println(80 + "1020" + 77); // "80102077"

		System.out.println(80 + 77 + "1020"); // "1571020"

		System.out.println("1020" + 80 + 77); // "10208077"

		// 피연산자 둘 중에 하나라도 실수이면 실수 연산을 한다.
		System.out.println(4 + 3.5); // 4->4.0

		// 문자 하나를 담는 데이터 '~'
		System.out.println('a');
		System.out.println("a");
		
		//System.out.println('ab');  이건 되지 않음
		System.out.println("ab");
		
		
		
		
	} // end main()

} // end class
