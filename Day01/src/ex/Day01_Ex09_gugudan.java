package ex;
/*
 * # ������ ����[1�ܰ�]
 * 2354~2357
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

import java.util.Scanner;

public class Day01_Ex09_gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====������=====");
		System.out.println("���� 2�� �Է�:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1+"x"+num2+"=");
		int right = num1*num2;
		System.out.println("���� �Է�:");
		int myco = scan.nextInt();
		if (myco == right) {
			System.out.println("����");
		}
		
		if (myco != right) {
			System.out.println("��!");
		}
		
	}
}
