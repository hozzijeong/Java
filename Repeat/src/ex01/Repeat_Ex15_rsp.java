package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # ����(0)����(1)��(2) ����[2�ܰ�]
 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 		1) ����.
 * 		2) ���� �̰��.
 * 		3) ���� ����.			�� ����Ѵ�.
 */


public class Repeat_Ex15_rsp {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int com = ran.nextInt(3);
		System.out.println("����(0) ����(1) ��(2) �Է�:");
		int myanswer = scan.nextInt();
		if(myanswer == com) {
			System.out.println("����.");
		}
		if((com+1)%3 == myanswer) {
			System.out.println("�̰��.");
		}
		if((com+2)%3 == myanswer) {
			System.out.println("����..");
		}
		
		
	}
	
}
