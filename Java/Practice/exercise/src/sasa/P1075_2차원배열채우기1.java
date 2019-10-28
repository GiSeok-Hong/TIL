package sasa;

import java.util.Scanner;

public class P1075_2차원배열채우기1 {

	public static void main(String[] args) {
		// 1075: 2차원 배열 채우기1
		// 사용자로 부터 정수 하나를 입력 받아,  
		// 2차원 배열을 다음과 같이 채워 출력하는 프로그램을 작성하시오. 
		// 입력 예시 10
		// 출력 예시 N * N 의 이차원 배열 출력
//		1 2 3 4 5 6 7 8 9 10 
//		...
//		91 92 93 94 95 96 97 98 99 100 
// 5행 10열의 배열인 table[5][10] 의 경우		
// table.length 를 호출하면 5가  나올 것이고,  table[0].length 를 호출하면 10이 반환된다.

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력해주세요");
		int ui = sc.nextInt();
		int a = 1;
		int[][] arr = new int[ui][ui];
		
		System.out.println("arr.length 는 " + arr.length);
		System.out.println("arr[ui - 1].length 는 " + arr[ui - 1].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[ui - 1].length; j++) {
				arr[i][j] = a;
				a++;
				System.out.print(arr[i][j] + " ");
			} // end for2
			System.out.println();
		} // end for
		
		sc.close();
	} // end main

} // end class
