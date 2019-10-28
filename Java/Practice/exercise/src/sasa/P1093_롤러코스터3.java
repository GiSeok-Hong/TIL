package sasa;

import java.util.ArrayList;
import java.util.Scanner;

public class P1093_롤러코스터3 {

	public static void main(String[] args) {
		// 1093: [Java] 롤러코스터3
//		SASA에 숨겨져있는 투명 롤러코스터를 타기 위해서는 사전 등록이 필요하다.
//		사전등록 시스템에 이니셜을 입력하면, 등록이 되는데 
//		등록하는 순서대로 탈 수 있다고 한다.
//		물론, 사정이 생겨서 등록을 취소 할 수도 있다고 한다.
//		추가기능으로 미리 등록한 사람이 다른사람과 교체도 가능하다고 한다.
//		롤러코스터를 운영하던 사세종은 명단을 출력할때
//		 한번에 4명씩 밖에 못타기 떄문에, 총 몇명이 탔는지
//		 그리고 4명씩 명단을 출력하도록 프로그램을 수정하였다.  
//		ArrayList 를 이용하여 
//		예약 등록 및 취소, 명단을 출력하는 프로그램 작성해보자.
//
//		 [명령어]
//		ADD 등록할이니셜
//		REMOVE 예약취소할이니셜
//		SET 예약한이니셜 교체할이니셜 
//		PRINT 최종 리스트 출력 
//		EX)
//		 6 
//		이니셜, 이니셜, 이니셜, 이니셜 
//		이니셜, 이니셜 
		
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
//		5
//		JCY KKJ OTY HBJK
//		SHJ
		
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
		
		System.out.println("\n\n 최종 리스트 ");
		
		int size = customer.size();
		for(int i = 0; i < size ; i++) {
			if((i + 1) % 4 == 0) {
				System.out.println(customer.get(i) + "  ");
			}else {
				System.out.print(customer.get(i) + "  ");
			}
		} // end for
		
		sc.close();
	} // end main
	
} // end class
