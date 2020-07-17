package ex01;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */


public class Repeat_Ex29_MaxNum_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int max = 0;
		while(i<3) {
			System.out.println("정수 입력:");
			int num = scan.nextInt();
			if(num >=max) {
				max = num;
			}
			i+=1;
		}
		System.out.println("최댓값:"+max);
	}
}
