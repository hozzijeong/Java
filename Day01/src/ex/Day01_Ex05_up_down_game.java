package ex;

import java.util.Scanner;

/*
 * # Up & Down ����[1�ܰ�]
 * 2332~2235(3��)
 * 1. com�� 8�̴�.
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */


public class Day01_Ex05_up_down_game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = 8;
		System.out.println("���� �Է�!:");
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
