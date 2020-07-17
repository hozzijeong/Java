package ex;

import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */
class Ex08{
	int [] game = {0,0,1,0,2,0,0,1,0,};
}

public class Day22_Ex09_movenum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex08 e = new Ex08();
		
		final int PLAYER = 2;
		final int WALL = 1;
		int pX = 0;
		
		for(int i=0; i<e.game.length;i++) {
			if(e.game[i] == PLAYER) {
				pX = i;
			}
		}
		
		
		while(true) {
			for(int i=0; i<e.game.length;i++) {
				if(e.game[i] == PLAYER) {
					System.out.print("��");
				}else if(e.game[i] ==WALL) {
					System.out.print("��");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
			
			System.out.println("[1]���� [2]������");
			int move = scan.nextInt();
			
			int xx = pX;
			
			if(move ==1) {
				xx -=1;
			}else if(move ==2) {
				xx +=1;
			}
			if(xx<0 || xx+1>e.game.length) continue;
			
			if( e.game[xx] ==WALL) {
				System.out.println("[3]����");
				int des = scan.nextInt();
				if(des == 3) {
					e.game[xx] = 0;
				}else {
					continue;
				}
			}
			
			e.game[pX] =0;
			pX = xx;
			e.game[pX] = PLAYER;
			
			
			
		}
		
		
		
	}
}
