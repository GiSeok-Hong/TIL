package sasa;

import java.util.Scanner;

public class P08_숫자3개_입력받아_대소구분 {

	public static void main(String[] args) {
		System.out.println("숫자 3개를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("가장 작은 값은 " + (a > b ? ((b > c) ? c : b) : ((a > c) ? c : a)) + " 입니다");
		System.out.println("가장 큰 값은 " + (a > b ? ((a > c) ? a : c) : ((b > c) ? b : c)) + " 입니다");
		sc.close();
	} // end main

} // end class
