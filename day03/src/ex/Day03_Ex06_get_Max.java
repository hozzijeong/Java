package ex;
/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1329~1333(4��)
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */

import java.util.Scanner;

public class Day03_Ex06_get_Max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		int max = 0;
		while (n<=3) {
			System.out.println("���� �Է�:");
			int input = scan.nextInt();
			if (input > max) {
				max = input;
			}
			n +=1;
		}
		System.out.println("�ִ�:"+max);
	}
}
