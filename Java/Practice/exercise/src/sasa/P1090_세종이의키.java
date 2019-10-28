package sasa;

import java.util.Arrays;
import java.util.Scanner;

public class P1090_세종이의키 {

	public static void main(String[] args) {
		// 1090: 세종이의 키
//		세종이가 세종과학예술영재학교로 전학을 왔다.
//		세종이는 자기의 키가 얼마나 큰 지 알고 싶다.
//		학생들의 인원수와 키가 주어졌을 때 세종이의 키는 몇 번째로 큰 지 구하여라.
//		입력
//		학생 수 n(1 <= n <= 100)
//		 n명의 키(1 <= 키 <= 200)
//		세종이의 키
		
//		입력 예시
//		5
//		150 160 157 155 174
//		155
		
//		출력
//		세종이 키의 순서
//		출력예시
//		4
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생들의 수를 입력 해주세요");
		int stu = sc.nextInt();
		int [] tall = new int [stu]; // 학생들의 키가 들어갈 변수 tall
		
		System.out.println();
		System.out.println("학생들의 키를 입력 해주세요");
		for(int i = 0; i < tall.length; i++) {
			tall[i] = sc.nextInt();
		} // end for
		
		System.out.println();
		System.out.println("세종이의 키를 입력 해주세요");
		int sj = sc.nextInt();
		
		Arrays.sort(tall); // 오름차순 정렬
		
		for(int i = 0; i < tall.length; i++) {
			if(tall[i] == sj) {
				System.out.println("세종이는 " + (tall.length - i) + " 번째로 키가 큽니다.");
			} // end if
		} // end for
		
		sc.close();
	} // end main

} // end class
