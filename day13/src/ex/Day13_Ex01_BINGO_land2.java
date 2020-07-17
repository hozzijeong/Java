package ex;

import java.util.Random;
import java.util.Scanner;

public class Day13_Ex01_BINGO_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int Max = 5;
		int [][]p1_bingo = new int[Max][Max]; // player1�� ������
		int [][]p2_bingo = new int[Max][Max]; // player2�� ������
			
		int [] temp = new int[Max*Max]; // ������ ���ڸ� ���� �迭
	
		for(int i=0; i<temp.length;i++) {
			int r = ran.nextInt(50)+1;
			temp[i] = r;
			int j=0;
			int check = 1;
			while(j<i) {
				if(temp[j] == temp[i]) {
					check = -1;
				}
				j+=1;
			}
			if(check == -1) {
				i-=1;
			}
		}
		// temp�� 1~50���� ���� �� 25���� �ߺ����� ����.
		int k=0;
		for(int i=0; i<Max;i++) {
			for(int j=0; j<Max; j++) {
				p1_bingo[i][j] = temp[k];
				k+=1;
			}
		}
		// temp�� �ִ� ������ ���ڵ��� player1�����ǿ� ����
		
		for(int i=0; i<temp.length;i++) {
			int r = ran.nextInt(50)+1;
			temp[i] = r;
			int j=0;
			int check = 1;
			while(j<i) {
				if(temp[j] == temp[i]) {
					check = -1;
				}
				j+=1;
			}
			if(check == -1) {
				i-=1;
			}
		}
		// �Ǵٽ� temp�� 1~50������ ���� �� ������ ���� 25���� ����. 
		
		k = 0;
		for(int i=0; i<Max;i++) {
			for(int j=0; j<Max; j++) {
				p2_bingo[i][j] = temp[k];
				k+=1;
			}
		}
		// �̹��� player2�� �����ǿ� ���ڵ��� ������. ��
		
		
		int turn = 0; // player���� ������ �����ϴ� int. (Ȧ,¦ �� �������� ������ �ٲ�) 
		int win = 0; // ���� ���� ���� �����. 
		
		while(true) {
			System.out.println("================= BINGO =================");
			System.out.println("\t\t===[P1]===");
			System.out.print("\t");
			
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
				for(int j=0; j<Max;j++) {
					if(p1_bingo[i][j] ==0) {
						System.out.print("[O]\t");
					}else {
						System.out.print(p1_bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			// p1_bingo�� ������ ���
			
			System.out.println();
			
			System.out.println("\t\t===[P2]===");
			System.out.print("\t");
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
				for(int j=0; j<Max;j++) {
					if(p2_bingo[i][j] ==0) {
						System.out.print("[O]\t");
					}else {
						System.out.print(p2_bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			//p2_bingo�� ������ ���

			
			/* �ؾ��� ��
			 * 1.�Է� �ޱ�
			 * 	1. p1�� p2�� ������ �����ư��鼭 ���ڸ� �Է� �޵��� �Ѵ�.turn�� ���! 
			 * 	2. p1���� �Է��� �ε��� ��(x,y)���� ��!�� p2�� ���̵� ������, p2�� ���� ���� �����Ѵ�!.
			 * 	3. p1�� ���� �ٲ�� �翬�� mark�� ���� 0���� �����ϰ�, ���࿡ �ش� �ε����� �� ���� ���ٸ� p2�� mark���� ���� �������ش�.
			 *======================================================================================= 
			 * 2. ���� ���
			 * 	1. mark�� �� �� ���� ����/����/�밢�� ������ ä�� ���� �¸��� �Ѵ�. 
			 *	2. �Է¹��� �������� ��, �� 1-2���� �ϴ� �� �غ���...
			 */
			System.out.println();
			if(turn%2 ==0) {
				System.out.println("===== [P1]���� =====");
				System.out.println("[P1] X���Է�[0~4]");
				int x = scan.nextInt();
				System.out.println("[P1] Y�� �Է�[0~4]");
				int y = scan.nextInt();
				//p1�� üũ�� ���� �Է¹���.
				for(int i=0;i<Max;i++) {
					for(int j=0; j<Max; j++) {
						if(p1_bingo[y][x] == p2_bingo[i][j]) {
							p2_bingo[i][j] = 0;
						}
					}
				}
				// ���࿡ p1���� üũ�� ������ p2�� ������ �ִٸ� �ش� �ε����� �ִ� ���� 0���� �ٲ�
				
				p1_bingo[y][x] = 0;
				// p1�� ���� bingo ������ 0���� �ٲ�
				turn+=1;
				//turn�� Ȧ���� ���� ���� ������ �Ѱ���
				
			}else {
				System.out.println("===== [P2]���� =====");
				System.out.println("[P2] X���Է�[0~4]");
				int x = scan.nextInt();
				System.out.println("[P2] Y�� �Է�[0~4]");
				int y = scan.nextInt();
				//p2�� üũ�� ���� �Է¹���.
				for(int i=0;i<Max;i++) {
					for(int j=0; j<Max; j++) {
						if(p2_bingo[y][x] == p1_bingo[i][j]) {
							p1_bingo[i][j] = 0;
						}
					}
				}
				// ���࿡ p2���� üũ�� ������ p1�� ������ �ִٸ� �ش� �ε����� �ִ� ���� 0���� �ٲ���
				
				p2_bingo[y][x] = 0;
				// p2�� ���� bingo ������ 0���� �ٲ�
				turn +=1;
			}
			
			for (int i=0; i<Max; i++) {
				int p1_garo = 0;
				int p1_sero = 0;
				int p2_garo = 0;
				int p2_sero = 0;
				for(int j=0; j<Max; j++) {
					if(p1_bingo[i][j] ==0) {
						p1_garo+=1;
						if(p1_garo == 5) {
							win = 1;
						}
					}
					if(p1_bingo[j][i] ==0) {
						p1_sero+=1;
						if(p1_sero ==5) {
							win = 1;
						}
					}
					if(p2_bingo[i][j] ==0) {
						p2_garo+=1;
						if(p2_garo ==5) {
							win = 2;
						}
					}
					if(p2_bingo[j][i] ==0) {
						p2_sero +=1;
						if(p2_sero ==5) {
							win = 2;
						}
					}
				}
			}
			// ���� p1,p2�� ���� ���� �˻�.
			
			//���� �밢�� �˻�.
			int p1_cross = 0;
			int p2_cross = 0;
			for(int i=0; i<Max;i++) {
				if(p1_bingo[i][i] ==0) {
					p1_cross+=1;
					if(p1_cross ==5) {
						win = 1;
					}
				}
				if(p2_bingo[i][i] ==0) {
					p2_cross+=1;
					if(p2_cross==5) {
						win = 2;
					}
				}
			}
			
			//���밢�� �˻�
			
			int p1_rcross = 0;
			int p2_rcross = 0;
			for(int i=0; i<Max;i++) {
				for(int j=0; j<Max; j++) {
					if(i+j ==4 && p1_bingo[i][j]==0) {
						p1_rcross+=1;
						if(p1_rcross ==5) {
							win = 1;
						}
					}
					if(i+j ==4 && p2_bingo[i][j] ==0) {
						p2_rcross +=1;
						if(p2_rcross ==5) {
							win = 2;
						}
					}
				}
			}
			
			
			if(win ==2) {
				System.out.println("[P2]�¸�");
				break;
			}else if(win ==1) {
				System.out.println("[P1]�¸�");
				break;
			}
			
			
			
			
			
			
			
		}
	}
}
