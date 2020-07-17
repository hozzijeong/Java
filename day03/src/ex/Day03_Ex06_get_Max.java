package ex;
/*
 * # 최대값 구하기[2단계]
 * 1329~1333(4분)
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */

import java.util.Scanner;

public class Day03_Ex06_get_Max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		int max = 0;
		while (n<=3) {
			System.out.println("정수 입력:");
			int input = scan.nextInt();
			if (input > max) {
				max = input;
			}
			n +=1;
		}
		System.out.println("최댓값:"+max);
	}
}
