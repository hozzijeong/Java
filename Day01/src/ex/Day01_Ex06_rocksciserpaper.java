package ex;
/*
 * # ����(0)����(1)��(2) ����[1�ܰ�]
 * 2337~2340
 * 1. com�� ����(1)�� �� �� �ִ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 	1) ����.
 * 	2) ���� �̰��.
 * 	3) ���� ����.			
 * �� ����Ѵ�.
 */

import java.util.Scanner;

public class Day01_Ex06_rocksciserpaper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = 1;
		System.out.println("==========");
		System.out.println("���� ���� �� �뱹");
		System.out.println("����(0) ����(1) ��(2)�߿� �Ѱ��� �Է��Ͻÿ�");
		int me = scan.nextInt();
		if (me >com ) {
			System.out.println("���� �̰��");
		}
		if (me ==com ) {
			System.out.println("����...");
		}
		if (me <com ) {
			System.out.println("����.. ����..");
		}
	}
}