package sasa;

import java.util.Scanner;

public class P07_숫자2개_입력받아_대소구분 {

	public static void main(String[] args) {
		System.out.println("숫자 두 개를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("앞의 숫자가 크면 yes, 뒤의 숫자가 크면 no 라고 입력해주세요");
		String c = sc.nextLine(); // 요걸 안해주면 입력이 안됨
		c = sc.nextLine();
		
//		if(c.equals("yes")) {
//			if(a > b) {
//				System.out.println(a + " 는(은) " + b + " 보다 크므로 정답 입니다.");
//			}else {
//				System.out.println(a + " 는(은) " + b + " 보다 작으므로 오답 입니다.");
//			} // end if2
//		}else if(c.equals("no")){
//			if(a < b) {
//				System.out.println(a + " 는(은) " + b + " 보다 작으므로 정답 입니다.");
//			}else {
//				System.out.println(a + " 는(은) " + b + " 보다 크므로 오답 입니다.");
//			} // end if3
//		}else {
//			System.out.println("yes 또는 no 로 입력해주세요");
//		} // end if
		
		System.out.println();
		
		if((a > b && c.equals("yes")) || (a < b && c.equals("no"))) {
			System.out.println((a > b ? a + " 은(는) " + b + " 보다 크므로 " : b + " 은(는)" + a + " 보다 작으므로 " ) + "정답입니다!");
		}else {
			System.out.println((a > b ? a + " 은(는) " + b + " 보다 크므로 " : b + " 은(는)" + a + " 보다 작으므로 " ) +"오답입니다!");
		}
		
		
		sc.close();
	} // end main

} // end class
