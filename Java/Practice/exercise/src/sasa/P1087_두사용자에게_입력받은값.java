package sasa;

import java.util.Scanner;

public class P1087_두사용자에게_입력받은값 {

	public static void main(String[] args) {
		// 1087: [Java] 두명의 사용자로부터 입력 받은값 확인하기
//		두명의 사용자로부터 각각 5개의 문자열을 입력받는다. 
//		입력 받은 각각 5개의 문자열이 모두 일치하는지 확인하여 출력하는 프로그램을 작성하시오. 
//		두명의 사용자로 부터 각각 5개의 문자열을 입력받는다.
//		(총 10개의 문자열을 입력 받음) 
//		
//		입력 예시
//		Girls are like
//		apples on trees.
//		the best
//		ones are at the top
//		of the tree.
//		Girls are like
//		apples on trees.
//		the best
//		ones are at the top
//		of the tree.
		// 출력
//		true OR false
		// 출력 예시
		// true
//		String[] arr = new String[5]; 와 같이 배열을 이용해보자.
//		Java.util.Arrays 자바 API를 활용하면.. equals(Array, Array)를 사용 할 수 있다.

		Scanner sc = new Scanner(System.in);
		String [] arr1 = new String[5];
		String [] arr2 = new String[5];
		
		System.out.println("사용자 A님 원하는 문장 다섯 줄을 입력해주세요");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextLine();
		} // end for
		
		System.out.println("사용자 B님 원하는 문장 다섯 줄을 입력해주세요");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextLine();
		} // end for
		
		System.out.println(search(arr1,arr2));
		
		sc.close();
	} // end main

	public static String search(String[] a, String[] b) {
		for(int i = 0; i < a.length; i++) {
			if(!(a[i].equals(b[i]))) {
				return "false";
			}
		} // end for
		return "true";
	} // end search
	
} // end class
