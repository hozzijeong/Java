package ex01;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */


public class Repeat_Ex29_MaxNum_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int max = 0;
		while(i<3) {
			System.out.println("���� �Է�:");
			int num = scan.nextInt();
			if(num >=max) {
				max = num;
			}
			i+=1;
		}
		System.out.println("�ִ�:"+max);
	}
}
