package com.lec.java.practice;

import java.util.Scanner;

public class Practice1073_0의개수_출력하기 {

	public static void main(String[] args) {
		// 핸드폰 번호에 0 이 몇개 있는지 출력하기
		// 핸드폰 번호를 010-0000-0000 와 같이 입력하여, 0이 몇개 있는지 출력하기 
		// 예를들어 010-0123-2345 와 같이 입력할 경우 0이 3개 있으므로, 3을 출력해야 한다. 
		// charAt(n)은 n 번째에 존재하는 문자를 가져온다.
		// 문자를 그대로 가져오기 때문에 입력받은 문자끼리의 비교 가능
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 핸드폰 번호를 입력해주세요");
		String phone = sc.nextLine();
		int count = 0;
		for(int i = 0; i < phone.length(); i++) {
			System.out.println((i + 1) + "번째 번호는 " + phone.charAt(i) + " 입니다");
			if(phone.charAt(i) == '0') {
				count++;
			}
		} // end for
		
		System.out.println("0의 개수는 " + count);
		
		sc.close();
	} // end main

} // end class
