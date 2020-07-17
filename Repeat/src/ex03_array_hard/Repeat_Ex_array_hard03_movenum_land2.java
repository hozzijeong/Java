package ex03_array_hard;
/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 */

import java.util.Scanner;

public class Repeat_Ex_array_hard03_movenum_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		
		int player = 0;
		
		while(true) {
			for(int i=0; i<game.length;i++)	{
				if(game[i] ==2) {
					player = i;
					System.out.print("�� ");
				}else {
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			System.out.println("[1]�� [2]��");
			int move = scan.nextInt();
			if(game[2] ==0 || game[7] ==0) {
				game[2] = 1;
				game[7] = 1;
			}
			
			if(move ==1) {
				if(player-1>=0) {
					if(game[player-1] ==1) {
						System.out.println("[3]����");
						int pounch = scan.nextInt();
						if(pounch !=3) {
							continue;
						}
					}
					game[player] = 0;
					game[player-1] = 2;
					player-=1;
				}
			}else if(move ==2) {
				if(player+1<game.length) {
					if(game[player+1] ==1) {
						System.out.println("[3]����");
						int pounch = scan.nextInt();
						if(pounch !=3) {
							continue;
						}
					}
					game[player] = 0;
					game[player+1] = 2;
					player +=1;
				}
			}
		
		}
		

	}
}
