package ex03_array_hard;

import java.util.Scanner;

public class Repeat_Ex_array_hard12_two_demention_array_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		System.out.println("����==========");
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println("�ε���1 �Է�:");
		int idx1 = scan.nextInt();
		
		System.out.println("�ε���2 �Է�:");
		int idx2 = scan.nextInt();
		System.out.println("�� ���:"+arr[idx1][idx2]);
		
		
		
		System.out.println("����==========");
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("�� �Է�:");
		int value = scan.nextInt();
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == value) {
					System.out.printf("�ε���1: %d �ε���2: %d ",i,j);
				}
			}
		}
		System.out.println();
		System.out.println("����==========");
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0;
		idx1 = 0; idx2 = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++	) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.printf("���� ū �ε���: %d %d",idx1,idx2);
		System.out.println();
		System.out.println("����==========");
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println("��1 �Է�:");
		int value1 = scan.nextInt();
		int v1_i = 0; int v1_j = 0;
		System.out.println("��2 �Է�:");
		int value2 = scan.nextInt();
		int v2_i=0; int v2_j=0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == value1) {
					v1_i = i;
					v1_j = j;
				}else if(arr[i][j] == value2) {
					v2_i = i;
					v2_j = j;
				}
			}
		}
		
		int temp = arr[v1_i][v1_j];
		arr[v1_i][v1_j] = arr[v2_i][v2_j];
		arr[v2_i][v2_j] = temp;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}
