package ex01;
/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

import java.util.Scanner;

public class Repeat_Ex10_get_max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개 입력:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int max = num1;
		
		if(max <num2 || max<num3) {	
			max = num2;
			if(max<num3) {
				max = num3;
			}
		}
		
		
		
		System.out.println(max);
	}
}
