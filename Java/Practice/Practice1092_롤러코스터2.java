package com.lec.java.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1092_롤러코스터2 {

	public static void main(String[] args) {
		// [Java] 롤러코스터2
//		SASA에 숨겨져있는 투명 롤러코스터를 타기 위해서는 사전 등록이 필요하다.
//		사전등록 시스템에 이니셜을 입력하면, 등록이 되는데 
//		등록하는 순서대로 탈 수 있다고 한다.
//		물론, 사정이 생겨서 등록을 취소 할 수도 있다고 한다.
//		추가기능으로 미리 등록한 사람이 다른사람과 교체도 가능하다고 한다. 
//		ArrayList 를 이용하여 
//		예약 등록 및 취소하는 프로그램 작성해보자.
//		ADD 등록할이니셜
//		REMOVE 예약취소할이니셜
//		SET 예약한이니셜 교체할이니셜 
//		PRINT 최종 리스트 출력
//		[이니셜, 이니셜, 이니셜, 이니셜, 이니셜, 이니셜 ... ]
			
//		입력 예시
//		ADD JCY
//		ADD KDU
//		REMOVE KDU
//		ADD KKJ
//		ADD OTY
//		ADD HBJK
//		ADD KYN
//		ADD MKS
//		REMOVE MKS
//		SET KYN SHJ
//		PRINT		
				
//		출력 예시
//		[JCY, KKJ, OTY, HBJK, SHJ]
		
//		Java.util.ArrayList 를 활용합니다.
//		.add() / .set() / .remove()
		
		Scanner sc = new Scanner(System.in);
		ArrayList <String> customer = new ArrayList<>();
		
		while(true) {
			System.out.println("=============");
			System.out.println("[ 1 ] 예약 등록");
			System.out.println("[ 2 ] 예약 취소");
			System.out.println("[ 3 ] 예약 수정");
			System.out.println("[ 4 ] 종료");
			System.out.println("=============");

			int input = sc.nextInt();
			if(input == 1) {
				System.out.println("등록할 이름을 적어주세요");
				String add = sc.next();
				customer.add(add);
			}else if(input == 2) {
				System.out.println("\n\n 현재 리스트 \n" + customer);
				System.out.println("취소할 이름을 적어주세요");
				String remove = sc.next();
				customer.remove(remove);
			}else if(input == 3) {
				System.out.println("\n\n 현재 리스트 \n" + customer);
				System.out.println("수정할 사람의 번호를 적어주세요 (0번부터 시작)");
				int num1 = sc.nextInt();
				System.out.println("새로운 사람의 이름을 적어주세요");
				String per1;
				per1 = sc.next();
				customer.set(num1, per1);
			}else if(input == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("다시 입력해주세요 \n");
			} // end if
		} // end while
		
		System.out.println("\n\n 최종 리스트 \n" + customer);
		
		
		sc.close();
	} // end main
	
} // end class
