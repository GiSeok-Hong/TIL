package sasa;

import java.util.Scanner;

public class P1081_replace {

	public static void main(String[] args) {
		// 1081: [Java][메소드] replace 문자열 치환
		// 사용자로부터 한 문장을 입력 받아, 띄어쓰기를 모두 제거하여 출력하는 프로그램을 작성하시오.
		// 입력 예시  You are the sunshine of my Life
		// 출력 예시  YouarethesunshineofmyLife

//		replaceAll("\\s","")
//		\w = 단어 문자 인 것
//
//		\W = 단어 문자가 아닌 것 (구두점 등 포함)
//
//		\s = 공백 문자 (공백, 탭 문자 등 포함)
//
//		\S = 공백 문자가 아닌 것 (글자와 숫자, 구두점 등 모두 포함)
//
//		(편집 : \s 가 정규 표현식 엔진에 도달하여 \\s 되도록하려는 경우 백 슬래시를 이스케이프 처리해야합니다.)

		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요");
		String text = sc.nextLine();
		System.out.println("입력하신 문장은 " + text + " 입니다" );
		text = text.replace(" ", "");
		System.out.println("바뀐 문장은 " + text + " 입니다");
		sc.close();
	} // end main

} // end class
