package sasa;

import java.util.Arrays;
import java.util.Scanner;

public class P1089_배열출력하기 {

	public static void main(String[] args) {
		// 1089: [Java] 배열 출력하기
//		사용자로 부터 단어 10개를 입력받아서 
//		[단어, 단어, 단어 ....] 형태로 출력하시오. 
//		띄어쓰기로 구분되어 있는, 사용자로 입력 받은 단어 10개
		// 입력 예시
//		ab bc cd de ef fg gh hi ik ke
//		출력예시
//		[ab, bc, cd, de, ef, fg, gh, hi, ik, ke]
//		Arrays.toString(Array) 를 이용하면, [단어, 단어, 단어, 단어 ...] 형태로 출력이 가능하다	
	
		Scanner sc = new Scanner(System.in);
		String [] arr = new String [10];
		System.out.println("적고 싶은 단어들을 10개 적어주세요");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		} // end for
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	} // end main

} // end class
