package ex;
/*
 * # 구구단 게임[1단계]
 * 2354~2357
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

import java.util.Scanner;

public class Day01_Ex09_gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====구구단=====");
		System.out.println("숫자 2개 입력:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1+"x"+num2+"=");
		int right = num1*num2;
		System.out.println("정답 입력:");
		int myco = scan.nextInt();
		if (myco == right) {
			System.out.println("정답");
		}
		
		if (myco != right) {
			System.out.println("땡!");
		}
		
	}
}
