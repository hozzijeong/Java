package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_array08_change_Value {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    1) �ε���1 �Է� : 1
		//		   �ε���2 �Է� : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.println("�ε��� 1�Է�:");
		int idx1 = scan.nextInt();
		System.out.println("�ε���2�Է�:");
		int idx2 = scan.nextInt();
		
		int x = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = x;
		for(int i=0; i<5;i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		System.out.println("==================");
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    2) ��1 �Է� : 40
		//        ��2 �Է� : 20
		//		  {10, 20, 30, 40, 50}
		
		System.out.println("��1�Է�:");
		int value1 = scan.nextInt();
		System.out.println("��2�Է�:");
		int value2 = scan.nextInt();
		
		int k =0;
		int j =0;
		
		for (int i=0; i<5; i++) {
			if(arr[i] == value1) {
				k = i;

			}
		}
		for(int i=0; i<5; i++) {
			if(arr[i] == value2) {
				j = i;
			}
		}
		
		
		int m = arr[k];
		arr[k] = arr[j];
		arr[j] = m;
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// ��    3) �й�1 �Է� : 1002
		//        �й�2 �Է� : 1003
		//		 {87, 45, 11, 98, 23}
		
		System.out.println("�й�1 �Է�:");
		int h1 = scan.nextInt();
		System.out.println("�й�2 �Է�:");
		int h2 = scan.nextInt();
		int x1 = 0;
		int y = 0;
		
		for(int i=0; i<5; i++) {
			if(hakbuns[i] == h1) {
				x1 = i;
			}
			if(hakbuns[i] == h2) {
				y = i;
			}
		}
		
		int z = scores[x1];
		scores[x1] = scores[y];
		scores[y] = z;
		
		for(int i = 0; i<5; i++) {
			System.out.print(scores[i] +" ");
			
		}
		
		

		
		
		
	
	}
}
