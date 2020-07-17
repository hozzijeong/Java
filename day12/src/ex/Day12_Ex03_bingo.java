package ex;

import java.util.Random;
import java.util.Scanner;

public class Day12_Ex03_bingo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		
		final int Maxnum = 5;
		
		int [][] bingo = new int[Maxnum][Maxnum];
		int [][] mark = new int[Maxnum+1][Maxnum+1];
		
		int[] temp = new int[Maxnum*Maxnum]; // bingo �ȿ� �� ������ ���� 25���� �ϴ� ���⿡ ����
		
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
		// temp�ȿ� 1~50������ ���� �� ������ ���� 25���� ����. 
		int k=0;
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j] = temp[k];
				k+=1;
			}                                  
		}
		// temp�ȿ� �ִ� ���ڸ� bingo�ȿ� �־���!. 
		
		/* �ؾ�����
		 * 1. bingo������ �����Ѵ�.
		 * 		1. X,Y���� �Է� �ް� �ű⿡ �ش��ϴ� ���ڸ� �־�� ��. �� �ѹ��� 3���� �����͸� ����.
		 * 		2. �Է¹��� �����Ͱ� �ش� ��ġ�� �ִ� ���ڵ�� �¾� �������ٸ�, mark�� ǥ�ø� �� 
		 * 		3. mark�� ǥ�ð� �Ǿ����� ���� �ϼ��� �Ǹ�, �¸� ���. 
		 * 2. �¸� ����.
		 * 		1. ���� 5���� �Ѱ��� ���� �ϼ��� �ȴ�.
		 * 		2. ���� 5���� �Ѱ��� ���� �ϼ��� �ȴ�.
		 * 		3. �밢�� 2���� �Ѱ��� ���� �ϼ��� �ȴ�. 
		 */	
		
		
		
		int cross =0;
		int rcross = 0;
		while(true) {
			
			for(int i=0;i<bingo.length;i++) {
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j] ==100) {
						System.out.print("B\t");
					}else {
						System.out.print(bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			
			
			System.out.println("X��[0~4](����)�Է�:");
			int x = scan.nextInt();
			System.out.println("Y��[0~4](����)�Է�:");
			int y = scan.nextInt();
			System.out.println("��[1~50] �Է�:");
			int data  = scan.nextInt();
			
			for(int i=0;i<bingo.length;i++) {
				for(int j=0;j<bingo[i].length;j++) {
					if(bingo[i][j] == data) {
						if(i == x && j ==y) {
							bingo[i][j] = 100;
							if(i == j) {
								cross+=1;
							}
							if(i+j ==4) {
								rcross+=1;
							}
						}
					}
				}
			}
			// ��� ��(X�� Y��)�� �Է��ϰ�  �Է��� ���� �ش� ��ġ�� �ִµ����� ���� ������ �ش� ���ڸ� 100���� ġȯ.
			
			int win = -1;
			for(int i=0;i<bingo.length;i++) {
				int garo = 0;
				int sero = 0;
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j] == 100) {
						mark[i][j] =1;
					}
					garo+= mark[i][j];
					sero+= mark[j][i];
				}
				mark[i][5] = garo;
				mark[5][i] = sero;
			}
			
			
			for(int i=0; i<5; i++) {
				if(mark[i][5] ==5) {
					win = 1;
				}
				if(mark[5][i] == 5) {
					win = 1;
				}
			}
			
			if(cross == 5) {
				win =1;
			}
			
			if(rcross ==5) {
				win =1;
			}
			
			
			if(win ==1) {
				System.out.println("bingo!");
				break;
			}
			
			
		}
		
	}
}
