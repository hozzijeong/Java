package ex;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 2332~2235(3분)
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */


public class Day01_Ex05_up_down_game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = 8;
		System.out.println("숫자 입력!:");
		int me = scan.nextInt();
		
		if (me<com) {
			System.out.println("Up!");
		}
		if (me==com) {
			System.out.println("Bingo!");
		}
		if (me>com) {
			System.out.println("Down!");
		}
	}
		
}
