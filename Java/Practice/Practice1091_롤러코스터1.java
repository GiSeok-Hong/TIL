package com.lec.java.practice;

import java.util.ArrayList;

import java.util.Scanner;

public class Practice1091_롤러코스터1 {

	public static void main(String[] args) {
		// 1091: [Java] 롤러코스터
//		SASA에 숨겨져있는 투명 롤러코스터를 타기 위해서는 사전 등록이 필요하다.
//		사전등록 시스템에 이니셜을 입력하면, 등록이 되는데 
//		등록하는 순서대로 탈 수 있다고 한다.
//		물론, 사정이 생겨서 등록을 취소 할 수도 있다고 한다.
//		[Java]
//		 ArrayList 를 이용하여
//		 예약 등록 및 취소하는 프로그램 작성해보자.
//		입력
//		ADD 등록할이니셜
//		REMOVE 예약취소할 이니셜
//		PRINT 
//		입력 예시
//		ADD JCY
//		ADD KDU
//		ADD KKJ
//		ADD OTY
//		ADD HBJK
//		ADD KYN
//		ADD MKS
//		REMOVE MKS
//		REMOVE KDU
//		PRINT
		
//		출력 예시
//		[JCY, KKJ, OTY, HBJK, KYN]
		
//		Java.util.ArrayList 를 활용하자.
//		.add() / .remove()
		
		Scanner sc = new Scanner(System.in);
		ArrayList <String> customer = new ArrayList<>(); // ArrayList 선언
		
		
		while(true) {
			System.out.println("add 또는 remove 또는 end 라고 작성해주세요");
			System.out.println();
			String input = sc.next();
			if(input.equals("add")) {
				System.out.println("등록할 이름을 적어주세요");
				String add = sc.next();
				customer.add(add);
			}else if(input.equals("remove")) {
				System.out.println("취소할 이름을 적어주세요");
				String remove = sc.next();
				customer.remove(remove);
			}else if(input.equals("end")) {
				break;
			}else {
				System.out.println("다시 입력해주세요 \n");
			} // end if
			
		} // end for
		
		System.out.println(customer);
		
		
		sc.close();
		
	} // end main

} // end class
