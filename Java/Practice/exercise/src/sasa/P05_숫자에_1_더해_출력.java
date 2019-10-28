package sasa;

import java.util.Scanner;

public class P05_숫자에_1_더해_출력 {

	public static void main(String[] args) {
		// 숫자 입력받아 1 더하여 출력하기
		// 숫자를 입력받아 byte형 변수에 저장한 후 1을 더해서 출력하는 프로그램을 작성하여 보자.
		// 정수값 N ( -128 <=N<=127)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		byte a = sc.nextByte();
		a++;
		System.out.println(a);
		sc.close();

	} // end main

} // end class
