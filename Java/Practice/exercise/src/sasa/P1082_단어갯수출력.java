package sasa;

import java.util.Scanner;

public class P1082_단어갯수출력 {

	public static void main(String[] args) {
		// 1082: [Java][PYTHON] 문장을 구성하고 있는 단어의 갯수
		// 사용자로부터 한개의 문장을 입력 받아, 그 문장을 구성하고 있는 단어의 갯수를 출력하는 프로그램을 작성하시오.
		// 입력 예시 Forever you'll stay in my heart
		// 출력 예시 구성하고 있는 단어의 갯수 6
		
		// split 함수   - 분열하다
		//public String split(String regex)
		//public String split(String regex, int limit)
		
		// regex : 문자열을 구분하기 위한 정규 표현입니다. 
		// limit : 분류할 문자열의 수입니다. 분류할 수 있는 단어가 10개인데 limit 가 5 이면 5개만 구분하고 나머지는 통채로 출력합니다. 

		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요");
		String text = sc.nextLine();
		System.out.println("입력하신 문장은 " + text + " 입니다");
		System.out.println();
		
		String [] word = text.split(" ");
		for(int i = 0 ; i < word.length ; i++) {
			System.out.println(word[i]);
		}
		System.out.println();
		System.out.println("입력하신 문장의 단어의 개수는 " + word.length + " 입니다");
		sc.close();
	} // end main

} // end class
