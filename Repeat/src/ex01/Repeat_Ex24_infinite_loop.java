package ex01;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */


public class Repeat_Ex24_infinite_loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력[EXIT->-100]:");
			int num1 = scan.nextInt();
			if(num1 == -100) {
				break;
			}
		}
		
	}
}
