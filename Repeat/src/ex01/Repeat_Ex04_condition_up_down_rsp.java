package ex01;

import java.util.Scanner;

public class Repeat_Ex04_condition_up_down_rsp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제 1) 양수, 0, 음수 출력
		int num = -10;
		if(num<0) {
			System.out.println("음수");
		}
		if(num == 0) {
			System.out.println("0");
		}
		if(num>0) {
			System.out.println("양수");
		}
		
		// 문제 2) 4의 배수 출력
		int num1 = 12;
		if(num1%4==0) {
			System.out.println("4의 배수");
		}
		if(num1%4 !=0) {
			System.out.println("4의배수 아님");
		}
		
		// 문제 3) 합격, 불합격 출력
		int score = 87;
		if(score>=60 && score <=100) {
			System.out.println("합격");
		}
		if(score<60 && score>=0) {
			System.out.println("불합격");
		}
		
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 com의 숫자를 맞추는 게임이다.
		 * 3. 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		int com = 8;
		System.out.println("숫자 입력:");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("UP!");
		}
		if(me==com) {
			System.out.println("BINGO!");
		}
		if(me>com) {
			System.out.println("DOWN!");
		}
		
		
		
		/*
		 * # 가위(0)바위(1)보(2) 게임[1단계]
		 * 1. com은 바위(1)만 낼 수 있다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다.
		 * 3. com과 me를 비교해,
		 * 		1) 비겼다.
		 * 		2) 내가 이겼다.
		 * 		3) 내가 졌다.			를 출력한다.
		 */
		
		int rsp = 1; //바위
		
		System.out.println("가위[0] 바위[1] 보[2]:");
		int me1 = scan.nextInt();
		
		if(me1>rsp) {
			System.out.println("내가 이겼다.");
		}
		if(me1==rsp) {
			System.out.println("비겼다.");
		}
		if(me1<rsp) {
			System.out.println("내가 졌다.");
		}
		
		
		

	}
}
