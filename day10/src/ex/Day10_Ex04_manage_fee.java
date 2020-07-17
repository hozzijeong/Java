package ex;

import java.util.Scanner;

public class Day10_Ex04_manage_fee {
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
			System.out.println("=====����1=====");
			// ���� 1) ������ ������ �� ���
			// ���� 1) 4400, 7100, 5400
			
			for(int i=0;i<pay.length;i++) {
				int sum = 0;
				for(int j=0;j<pay[i].length;j++) {
					sum+= pay[i][j];
				}
				System.out.printf("%d���� ������: %d ",i+1,sum);
				System.out.println();
			}
			System.out.println();
			
			System.out.println("=====����2=====");
			// ���� 2) ȣ�� �Է��ϸ� ������ ���
			// ��    2) �Է� : 202	������ ��� : 2000
			System.out.println("ȣ �Է�:");
			int ho = scan.nextInt();
			int x = 0;
			int y = 0;
			for(int i=0;i<apt.length;i++) {
				for(int j=0;j<apt[i].length;j++) {
					if(ho == apt[i][j]) {
						x = i;
						y = j;
					}
				}
			}
			System.out.printf("%dȣ�� ������: %d�� ",ho,pay[x][y]);
			System.out.println();
			
			System.out.println("=====����3=====");
			// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
			// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
			int max = 0;
			int min = 99999999;
			
			int mx = 0; int my = 0;
			int ix = 0; int iy = 0;
			
			for(int i=0; i<pay.length;i++) {
				for(int j=0;j<pay[i].length;j++) {
					if(max<pay[i][j]) {
						max = pay[i][j];
						mx = i;
						my = j;
					}
					if(min>pay[i][j]) {
						min = pay[i][j];
						ix = i;
						iy = j;
					}
				}
			}
			System.out.printf("���� ���� ������(%d), ���� ���� ������(%d)",apt[mx][my],apt[ix][iy]);
			System.out.println();
			
			System.out.println("=====����4=====");
			// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
			
			System.out.println("ȣ1 �Է�:");
			int ho1 = scan.nextInt();
			
			System.out.println("ȣ2 �Է�:");
			int ho2 = scan.nextInt();
			
			int ho1_x = 0; int ho1_y = 0;
			int ho2_x = 0; int ho2_y = 0;
			
			for(int i=0; i<apt.length;i++) {
				for(int j=0; j<apt[i].length;j++) {
					if(ho1 == apt[i][j]) {
						ho1_x = i;
						ho1_y = j;
					}
					if(ho2 == apt[i][j]) {
						ho2_x = i;
						ho2_y = j;
					}
				}
			}
			
			int temp = pay[ho1_x][ho1_y];
			pay[ho1_x][ho1_y] = pay[ho2_x][ho2_y];
			pay[ho2_x][ho2_y] = temp;
			
			for(int i=0; i<pay.length;i++) {
				for(int j=0; j<pay[i].length;j++) {
					System.out.print(pay[i][j] +" ");
				}
				System.out.println();
			}
			


	}
}
