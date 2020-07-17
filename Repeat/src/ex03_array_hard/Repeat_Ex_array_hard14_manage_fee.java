package ex03_array_hard;

import java.util.Scanner;

public class Repeat_Ex_array_hard14_manage_fee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			System.out.println("����==========");
			// ���� 1) ������ ������ �� ���
			// ���� 1) 4400, 7100, 5400
			for(int i = 0;i<pay.length;i++) {
				int sum = 0;
				for(int j=0; j<pay[i].length;j++) {
					sum+=pay[i][j];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
			
			System.out.println("����==========");
			// ���� 2) ȣ�� �Է��ϸ� ������ ���
			// ��    2) �Է� : 202	������ ��� : 2000
			System.out.println("ȣ �Է�:");
			int ho = scan.nextInt();
			int idx1 = 0;
			int idx2 = 0;
			
			for(int i=0; i<apt.length;i++) {
				for(int j=0;j<apt[i].length;j++) {
					if(ho == apt[i][j]) {
						idx1 = i;
						idx2 = j;
					}
				}
			}
			System.out.printf("%dȣ�� ������ %d��",ho,pay[idx1][idx2]);
			System.out.println();
			
			
			System.out.println("����==========");
			// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
			// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
			int max = pay[0][0];
			int m_idx1 = 0; int m_idx2 = 0;
			int min = pay[0][0];
			int i_idx1 = 0; int i_idx2 = 0;
			for(int i=0;i<pay.length;i++) {
				for(int j=0;j<pay[i].length;j++) {
					if(pay[i][j]>max) {
						max = pay[i][j];
						m_idx1 = i;
						m_idx2 = j;
					}
					if(pay[i][j]<min) {
						min = pay[i][j];
						i_idx1 = i;
						i_idx2 = j;
					}
				}
			}
			
			System.out.printf("���� ���� ������: %dȣ\n ���� ���� ���� ��: %dȣ",apt[m_idx1][m_idx2],apt[i_idx1][i_idx2]);
			System.out.println();
			
			System.out.println("����==========");
			// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
			System.out.println("ȣ1 �Է�:");
			int ho1 = scan.nextInt();
			System.out.println("ȣ2 �Է�:");
			int ho2 =  scan.nextInt();
			
			int ho1_idx_i = 0; int ho1_idx_j = 0; 
			int ho2_idx_i = 0; int ho2_idx_j = 0; 
			for(int i=0; i<apt.length;i++) {
				for(int j=0; j<apt[i].length;j++) {
					if(ho1 == apt[i][j]) {
						ho1_idx_i = i;
						ho1_idx_j = j;
					}
					if(ho2 == apt[i][j]) {
						ho2_idx_i = i;
						ho2_idx_j = j;
					}
				}
			}
			
			int temp = pay[ho1_idx_i][ho1_idx_j];
			pay[ho1_idx_i][ho1_idx_j] = pay[ho2_idx_i][ho2_idx_j];
			pay[ho2_idx_i][ho2_idx_j] = temp;
			
			for(int i=0; i<pay.length;i++) {
				for(int j=0; j<pay[i].length;j++) {
					System.out.print(pay[i][j] + " ");
				}
				System.out.println();
			}
	}
}
