package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class Repeat_Ex15_rsp {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int com = ran.nextInt(3);
		System.out.println("가위(0) 바위(1) 보(2) 입력:");
		int myanswer = scan.nextInt();
		if(myanswer == com) {
			System.out.println("비겼다.");
		}
		if((com+1)%3 == myanswer) {
			System.out.println("이겼다.");
		}
		if((com+2)%3 == myanswer) {
			System.out.println("졌다..");
		}
		
		
	}
	
}
