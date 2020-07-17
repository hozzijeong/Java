package ex;
/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 2337~2340
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 	1) 비겼다.
 * 	2) 내가 이겼다.
 * 	3) 내가 졌다.			
 * 를 출력한다.
 */

import java.util.Scanner;

public class Day01_Ex06_rocksciserpaper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = 1;
		System.out.println("==========");
		System.out.println("가위 바위 보 대국");
		System.out.println("가위(0) 바위(1) 보(2)중에 한개를 입력하시오");
		int me = scan.nextInt();
		if (me >com ) {
			System.out.println("내가 이겼다");
		}
		if (me ==com ) {
			System.out.println("비겼다...");
		}
		if (me <com ) {
			System.out.println("내가.. 졌다..");
		}
	}
}
