package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class Repeat_Ex14_gugudan_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int r1 = ran.nextInt(7)+2;
		int r2 = ran.nextInt(8)+1;
		
		System.out.println(r1+"X"+r2+"=");
		int my = scan.nextInt();
		
		if(my == r1*r2) {
			System.out.println("정답");
		}
		if(my != r1*r2) {
			System.out.println("땡");
		}
	}
	

}
