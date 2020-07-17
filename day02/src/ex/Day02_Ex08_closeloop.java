package ex;

/*
 * # 반복문 종료(-100)
 * 2200~2203
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */


import java.util.Scanner;

public class Day02_Ex08_closeloop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i == 1) {
			System.out.println("숫자입력(-100은 종료)");
			int input = scan.nextInt();
			if (input == -100) {
				i = input;
				System.out.println("종료합니다");
			}
		}
	}
}
