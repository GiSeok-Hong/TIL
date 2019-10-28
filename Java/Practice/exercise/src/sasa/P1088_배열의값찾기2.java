package sasa;

import java.util.Arrays;
import java.util.Scanner;

public class P1088_배열의값찾기2 {

	public static void main(String[] args) {
		// 1088: [Java][PYTHON] 배열에 값 찾기2
//		사용자로부터 N개의 정수를 입력 받아, K번째 큰 정수를 출력하는 프로그램을 작성하시오.
//		단, N, K < 100 이하
//		입력받을 정수의 개수 : N
//		띄어쓰기로 구분되어 있는 N개의 정수
//		 크기를 확인할 : K
		// 입력 예시
//		10
//		6 7 8 9 10 1 2 3 4 5
//		5
//		출력 예시
//		K번째로 큰 정수
		// 출력 예시
		// 6
		// Java.util.sort(); 를 활용하자!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 숫자의 개수를 입력해주세요");
		int in = sc.nextInt();
		int [] arr = new int [in];
		
		System.out.println("\n" + in + " 개의 숫자를 입력해주세요");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print("arr[" + i + "] = " + arr[i] + " ");
		} // end for
		System.out.println();
		System.out.println();
		
		Arrays.sort(arr);	// 오름차순 정렬을 함
		System.out.println("정렬 후 배열");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + " ");
		} // end for
		
		System.out.println();
		System.out.println("숫자를 입력하세요");
		int k = sc.nextInt();
		System.out.println(k + " 번째로 큰 숫자는 " + arr[(in - k)] + " 입니다");
		
		
		sc.close();
	} // end main

} // end class
