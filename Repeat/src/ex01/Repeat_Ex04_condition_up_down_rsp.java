package ex01;

import java.util.Scanner;

public class Repeat_Ex04_condition_up_down_rsp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� 1) ���, 0, ���� ���
		int num = -10;
		if(num<0) {
			System.out.println("����");
		}
		if(num == 0) {
			System.out.println("0");
		}
		if(num>0) {
			System.out.println("���");
		}
		
		// ���� 2) 4�� ��� ���
		int num1 = 12;
		if(num1%4==0) {
			System.out.println("4�� ���");
		}
		if(num1%4 !=0) {
			System.out.println("4�ǹ�� �ƴ�");
		}
		
		// ���� 3) �հ�, ���հ� ���
		int score = 87;
		if(score>=60 && score <=100) {
			System.out.println("�հ�");
		}
		if(score<60 && score>=0) {
			System.out.println("���հ�");
		}
		
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 1. com�� 8�̴�.
		 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
		 * 3. ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		int com = 8;
		System.out.println("���� �Է�:");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("UP!");
		}
		if(me==com) {
			System.out.println("BINGO!");
		}
		if(me>com) {
			System.out.println("DOWN!");
		}
		
		
		
		/*
		 * # ����(0)����(1)��(2) ����[1�ܰ�]
		 * 1. com�� ����(1)�� �� �� �ִ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
		 * 3. com�� me�� ����,
		 * 		1) ����.
		 * 		2) ���� �̰��.
		 * 		3) ���� ����.			�� ����Ѵ�.
		 */
		
		int rsp = 1; //����
		
		System.out.println("����[0] ����[1] ��[2]:");
		int me1 = scan.nextInt();
		
		if(me1>rsp) {
			System.out.println("���� �̰��.");
		}
		if(me1==rsp) {
			System.out.println("����.");
		}
		if(me1<rsp) {
			System.out.println("���� ����.");
		}
		
		
		

	}
}
