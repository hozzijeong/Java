package ex01;
/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex18_guess_midnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rnum = ran.nextInt(101)+150;
		System.out.println("문제 = " + rnum);
		
		System.out.println("정답 입력:");
		int answer = scan.nextInt();
		
		int realanswer = (rnum%100)/10;
		if(answer == realanswer) {
			System.out.println("정답" + rnum +" "+ realanswer);
		}else {
			System.out.println("오답" + rnum+" " + realanswer);
		}
	}
}
