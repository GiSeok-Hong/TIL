package sasa;

import java.util.Scanner;

public class P1083_두수사이의수1 {

	public static void main(String[] args) {
		// 1083: 두 수 사이의 수
		// 오름차순으로 정렬된 수열에서, 입력받은 두 수 사이(두 수 포함)에 있는 숫자의 갯수를 구하여라. 
		// 단 수열에 같은 값을 가진 수가 존재할 수 있다. 
		// 첫 줄에 수열의 길이 n (2 ≤ n ≤ 500,000) 
		// 두 번째줄부터 n개의 수 (0 ≤ 수 ≤ 500,000) 
		// 세 번째 줄에 두 수 a, b (-1,000,000 ≤ a ≤ b ≤ 1,000,000)
		// 입력 예시
		// 5
		// 1 2 2 4 5
		// 2 4
		// 출력 : 입력받은 두 수 사이(두 수 포함)에 있는 숫자의 갯수 
		// 출력 예시 : 3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력해주세요");
		int length = sc.nextInt();
		if(!(length >= 2 && length <= 500000)) {
			while(true) {
				System.out.println("2 이상, 500000 이하의 숫자를 입력해주세요");
				length = sc.nextInt();
				if(length >= 2 && length <= 500000) {
					break;
				} // end if2
			} // end while
		} // end if
		int [] arr = new int [length];
		System.out.println("배열의 길이는 " + length + " 입니다");
		System.out.println();
		
		System.out.println("배열에 들어갈 숫자를 " + length + " 번 입력해주세요");
		for(int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			if(input >= 0 && input <= 500000) {
				arr[i] = input;
			}else {
				while(true) {
					System.out.println("0이상, 500000 이하의 숫자를 입력해주세요");
					input = sc.nextInt();
					if(input >= 0 && input <= 500000) {
						arr[i] = input;
						break;
					} // end if2
				} // end while
			} // end if
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + "  ");
		} // 배열 값 보여주기 위해
		
		System.out.println();
		System.out.println();
		
		System.out.println("배열의 값 중 원하는 가장 작은 수를 입력하세요");
		int sel1 = sc.nextInt();
		System.out.println("배열의 값 중 원하는 가장 큰 수를 입력하세요");
		int sel2 = sc.nextInt();
		int i, j; // 인덱스 값
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == sel1) {
				System.out.println("낮은 인덱스 " + i);
				break;
			} // end if
		} // end for
		
		for(j = arr.length - 1; j >= 0; j--) {
			if(arr[j] == sel2) {
				System.out.println("높은 인덱스 " + j);
				break;
			}
		}
		
		System.out.println(sel1 + " 과(와) " + sel2 + " 사이에 있는 숫자의 개수는 " + (j - i + 1) + " 입니다");
		
		
		sc.close();
	} // end main

} // end class
