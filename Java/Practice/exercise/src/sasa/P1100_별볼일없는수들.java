package sasa;

import java.util.Scanner;

public class P1100_별볼일없는수들 {

	public static void main(String[] args) {
//		1110: 별 볼 일 없는 수들
//		사용자로부터 n을 입력받아, 1부터 n까지의 정수 중에서 다음의 수를 제외하고 모두 출력해보자. 
//		 - 소수					 양의 약수로 1과 자신만을 가진 자연수
//		 - 완전제곱수				
//		 - 2^k 인 수(k는 자연수)      2의 제곱승
//		 - 10 * k 인 수(k는 자연수)  10의 배수
//		 입력
//		 n(15 ≤ n ≤ 100)
//		 입력예시 15
//		 출력 : 해당하는 숫자들을 한 칸 띄워서 출력 
//		 출력예시 6 12 14 15   제외된 수 : 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13
		Scanner sc = new Scanner(System.in);
		System.out.println("15에서 100까지 사이의 숫자 중 하나를 입력해주세요");
		int input = sc.nextInt();
		if(!(input <= 100 && input >= 15)) {
			while(true) {
				System.out.println("다시 입력해주세요");
				input = sc.nextInt();
				if(input <= 100 && input >= 15) {
					break;
				} // end if
			} // end while
		} // end if
		
		
		
		
		
		
		sc.close();
	} // end main

} // end class
