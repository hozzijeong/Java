package ex;

import java.util.Scanner;

//����
//1. 10 x 10
//2. 2�ο�
//3. �� ��
//4. �Էµ� X,Y������!
//5. ����
public class Day13_Ex02_OMOK {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int size = 10;
		int [][]omok = new int[size][size];
		
		
		int turn = 0; // ������ ����
		int win = 0; // ���� ����
		
		/* �ؾ��� ��
		 * 1. ������ ����
		 * 2. ������ �°� ��ġ�� �Է� ����.
		 * 3. �Է¹��� ��ġ�� player1 �ǰ�� 1��, player2�� ��� 2�� ǥ�� ����.
		 * 4. ǥ�ù��� ���� 1�� �鵹�� 2�� �浹�� �����ؼ� �����.
		 * �ϴ� �������
		 * ===================================================
		 * 
		 * �Ǵٸ� ���:
		 * "/"������ i+j�� ���� ��� ����. ���� ���� 5���� ���� ã���� ��.
		 * |(��������)������ i+j�� ���� +2�� ������. +2�� ������ ���� ã�������. 
		 * 
		 */
		
		while(true) {
			System.out.println("========== OMOK ==========");
			System.out.print("  ");
			for(int i=0; i<size;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i=0; i<size;i++) {
				System.out.print(i+" ");
				for(int j=0; j<size;j++) {
					if(omok[i][j] ==0) {
						System.out.print("  ");
					}else if(omok[i][j] ==1) {
						System.out.print("�� ");
					}else if(omok[i][j] ==2) {
						System.out.print("�� ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			if(turn%2==0) {
				System.out.println("   === [P1(��)]���� ===");
				
				System.out.println("X�Է�[0~9]");
				int x = scan.nextInt();
				System.out.println("Y�Է�[0~9]");
				int y = scan.nextInt();
				
				if(omok[y][x] ==0) {
					omok[y][x] = 1;
				}else {
					continue;
				}
				turn+=1;
				
			}else if(turn%2==1) {
				System.out.println("   === [P2(��)]���� ===");
				
				System.out.println("X�Է�[0~9]");
				int x = scan.nextInt();
				System.out.println("Y�Է�[0~9]");
				int y = scan.nextInt();
				
				if(omok[y][x] ==0) {
					omok[y][x] = 2;
				}else {
					continue;
				}
				turn+=1;				
				
			}
			
			
			/*
			 * ������ �¸�����:
			 * ���� Ȥ�� ���� Ȥ�� �밢��(���ӵ� ����)�� �����ϸ� �¸���.
			 * �ϴ��� ����/ ���ο��� count�� �̿��ؼ� ��� �˻縦 ��.
			 * 
			 * �밢���� �ϴ� ���߿�
			 * 
			 */
			
			for(int i=0; i<size;i++) {
				int p1_garo = 0;
				int p1_sero = 0;
				int p2_garo = 0;
				int p2_sero = 0;
				for(int j=0; j<size;j++) {
					if(omok[i][j] ==1) {
						p1_garo +=1;
						if(p1_garo ==5) {
							win = 1;
						}
					}
					if(omok[j][i] ==1) {
						p1_garo +=1;
						if(p1_garo ==5) {
							win = 1;
						}
					}
					if(omok[i][j] ==2) {
						p2_garo +=1;
						if(p2_garo ==5) {
							win = 2;
						}
					}
					if(omok[j][i] ==2) {
						p2_sero +=1;
						if(p2_sero ==5) {
							win = 2;
						}
					}
				}
			}
			// �� -> �� �밢��
			/*
			 * i �� 6���� �۾ƾ� �Ѵ�. �׷����� i+4�� ������ 9�� ���ü� ���ִ�
			 * j �� 4���� Ŀ���Ѵ�. �׷����� j-4�� ������ 0�� ���´�. 
			 * j �� 9���� �����ؼ� -1��, i �� 0���� �����ؼ� +1�� �Ѵ�. 
			 */
			for(int i=0;i<size-4;i++) {
				for(int j=size-1;j>3;j--) {
					int p1_cross = 0;
					int p2_cross = 0;
					for(int k=0; k<5;k++) {
						if(omok[i+k][j-k] ==1) {
							p1_cross +=1;
							if(p1_cross==5) {
								win = 1;
							}
						}
						if(omok[i+k][j-k]==2) {
							p2_cross+=1;
							if(p2_cross==5) {
								win=2;
							}
						}
					}
				}
			}
			
			for(int i=0; i<6;i++) {
				for(int j=0;j<6;j++) {
					int p1_cross = 0;
					int p2_cross = 0;
					for(int k=0;k<5;k++) {
						if(omok[i+k][j+k]==1) {
							p1_cross+=1;
							if(p1_cross==5) {
								win = 1;
							}
						}
						if(omok[i+k][j+k]==2) {
							p2_cross+=1;
							if(p2_cross==5) {
								win = 2;
							}
						}
					}
				}
			}
			
			
			if(win ==1)	{
				System.out.println("[P1(��)]�¸�");
				break;
			}else if(win ==2) {
				System.out.println("[P2(��)]�¸�");
				break;
			}
			
			
			
		}
		
		
	}
}
