package sasa;

import java.util.Scanner;

public class P1071_5개의_양의정수의_합 {

	public static void main(String[] args) {
		// 5개의 양의 정수의 합 
		// 5개의 자연수를 입력 받고 그 합을 출력하자. 단, 0 이하의 수가 들어오면 다시 입력받아야 한다.

		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 양의 정수를 입력해주세요");
		int [] arr = new int[5];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
//			if(arr[i] <= 0) {
//				i--;
//				continue;
//			}
//			total += arr[i];
			if(arr[i] > 0) {
				total += arr[i];
			}else {
				while(true) {
					arr[i] = sc.nextInt();
					if(arr[i] > 0) {
						total += arr[i];
						break;
					} // end if2			
				} // end while
			} // end if
		} // end for
		
		System.out.println("5개의 합은 " + total + " 입니다.");
		sc.close();
	} // end main

} // end class
