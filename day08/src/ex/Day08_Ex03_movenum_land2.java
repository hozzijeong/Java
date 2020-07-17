package ex;

import java.util.Scanner;

/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * .....������ �ٽ�...�غ���...
 */

public class Day08_Ex03_movenum_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		
		int player = 0;
		
		for(int i=0; i<9; i++) {
			if(game[i] ==2) {
				player = i;
			}
		}
		
		
		while(true) {
			for(int i=0; i<9; i++) {
				if(game[i]==2) {
					System.out.print("�� ");
				}else {
					System.out.print(game[i]+ " ");
				}
			}
				System.out.println();
				
			System.out.println("����[1] ������[2]");
			int move = scan.nextInt();
			
			if(move ==1) {
				if(player-1>=0) {
					if(game[player-1] ==1) {
						System.out.print("����[3]");
						int breaking = scan.nextInt();
						if(breaking !=3) {
							continue;
						}
					}
					game[player-1] = 2;
					game[player] = 0;
					player-=1;
				}
			}else if(move ==2) {
				if(player+1<9) {
					if(game[player+1]==1) {
						System.out.println("����[3]");
						int breaking = scan.nextInt();
						if(breaking !=3) {
							continue;
						}
					}
					game[player+1] = 2;
					game[player] = 0;
					player+=1;
				}
			}
			}

	}
}
