package ex;

import java.util.Scanner;

public class Day04_Ex05_array_manage_sutdent_lande {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ε���            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1	���� : 11��
		System.out.println("�л� ��ȣ �Է�:");
		int num = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num == i) {
				System.out.printf("%d�� �л��� ���� = %d \n",i,arr[i]);
			}
		}
		System.out.println("===============================");
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		System.out.println("�л� ���� �Է�:");
		int num1 = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num1 == arr[i]) {
				System.out.printf("%d�� �л��� ��ȣ = %d \n",arr[i],i);
			}
		}
		
		System.out.println("===============================");
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003	���� : 45��
		System.out.println("�й� �Է�:");
		int num2 = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num2 == hakbuns[i]) {
				System.out.printf("%d�� ���� = %d \n",hakbuns[i],scores[i]);
			}
		}


	}
}
