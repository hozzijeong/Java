package ex;

import java.util.Scanner;

public class Day04_Ex13_array_change_value {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    1) �ε���1 �Է� : 1
		//		   �ε���2 �Է� : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println("�ε��� 1�Է�:");
		int index1 = scan.nextInt();
		System.out.println("�ε���2�Է�:");
		int index2 = scan.nextInt();
		int x = 0;
		
		x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("=========================");
		
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    2) ��1 �Է� : 40
		//        ��2 �Է� : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println("�� 1�Է�:");
		int value1 = scan.nextInt();
		System.out.println("��2�Է�:");
		int value2 = scan.nextInt();
		int j = 0;
		int k = 0;
		
		for(int i = 0; i<5; i++) {
			if(arr[i] == value1) {
				j = i;
			}
			if(arr[i] == value2) {
				k = i;
			}
		}

		int y = arr[j];
		arr[j]= arr[k];
		arr[k] = y;
		
		for(int i =0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// ��    3) �й�1 �Է� : 1002
		//        �й�2 �Է� : 1003
		//		 {87, 45, 11, 98, 23}
		System.out.println("�й�1 �Է�:");
		int hak1 = scan.nextInt();
		System.out.println("�й�2 �Է�:");
		int hak2 = scan.nextInt();
		
		int a = 0;
		int b = 0;
		
		for (int i =0; i<5; i++) {
			if(hak1 == hakbuns[i]) {
				a = i;
			}
			if(hak2 == hakbuns[i]) {
				b = i;
			}
		}
		int m = scores[a];
		scores[a] = scores[b];
		scores[b] = m;
		
		for(int i =0; i<5; i++) {
			System.out.print(hakbuns[i]+" ");
		}
		System.out.println();
		for(int i =0; i<5; i++) {
			System.out.print(scores[i]+" ");
		}
		
	}
}
