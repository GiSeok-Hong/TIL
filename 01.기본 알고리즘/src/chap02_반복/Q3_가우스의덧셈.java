package chap02_반복;

import java.util.Scanner;

public class Q3_가우스의덧셈 {

	public static void main(String[] args) {
		// 연습문제 Q8   30p
		// 1부터 10까지의 합은 (1+10)*5 와 같은 방법으로 구할 수 있습니다.
		// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램 작성하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을구합니다.");
		System.out.print("n의 값：");
		int n = sc.nextInt();
		int gaussSum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		// n이 짝수일 경우에는 (n + 1) * (n / 2) 으로 충분하나 n이 홀수 일 경우에는 값이 달라짐
		// 그래서 조건 연산자인 3항 연산자를 사용
		
		
		// int divide = n / 2;
		// System.out.println(divide);
		
		
		System.out.println("1부터 " + n + "까지의 합은 " + gaussSum + "입니다.");
		
		sc.close();
		
	} // end main

} // end class
