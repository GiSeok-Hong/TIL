package sasa;

import java.util.Scanner;

public class P02_단어입력 {

	public static void main(String[] args) {
		//2개 이상의 단어를 입력받아 처음 2개를 출력하는 Java 프로그램을 작성해 보자.
		// ex) 입력 : Welcome to Java World!!
		//     결과 : Welcome
		//	         to
			
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요");
		String A = sc.next();
		String B = sc.next();
		// next()와 nextLine() 차이점
		String C = sc.nextLine();
		System.out.println(A + "\n" + B + "\n" + C);
		// if()
		
		sc.close();
	} // end main

} // end class
