package ex;

import java.util.Scanner;

public class Day10_Ex02_two_dimentional_array_land2 {
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
		System.out.println("=====����1=====");
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println("�ε��� 2�� �Է�:");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		
		System.out.println("�� ���:"+arr[idx1][idx2]);
		
		System.out.println("=====����2=====");
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("�� �Է�:");
		int data = scan.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == data) {
					System.out.printf("�ε���1: %d �ε���2: %d",i,j );
				}
			}
		}
		System.out.println();
		
		System.out.println("=====����3=====");
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0;
		int mi = 0;
		int mj = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] >max) {
					max = arr[i][j];
					mi = i;
					mj = j;
				}
			}
		}
		System.out.printf("���� ū ���� �ε���: %d  %d ",mi,mj);
		
		System.out.println();
		
		System.out.println("=====����4=====");
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println("�� 2�� �Է�:");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		int a = 0;
		int b = 0;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == value1) {
					a = i;
					b = j;
				}
				if(arr[i][j] == value2) {
					x = i;
					y = j;
				}
			}
		}
		
		int temp = arr[a][b];
		arr[a][b] = arr[x][y];
		arr[x][y] = temp;
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++)	{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}
}
