package ex03_array_hard;

import java.util.Scanner;

/*
 * # EXIT ����
 * 1. game�迭���� exit������ ���� ���� ��ġ�� �Է��Ѵ�.
 * 2. ������ ���߸� exit������ 1�����Ѵ�.
 * 3. exit������ ���� 16�̵Ǹ� ������ ����ȴ�.
 */

public class Repeat_Ex_array_hard04_EXIT_GAME {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int exit = 10;
		
		int[] game = {11,15,10,14,12,13};
		
		while(exit<16) {
			System.out.println("EXIT:"+exit);
			for(int i=0; i<game.length;i++) {
				System.out.print(game[i] +" ");
			}
			System.out.println();
			System.out.println("��ġ �Է�[1~6]:");
			int idx = scan.nextInt();
			
			int eidx = 0;
			for(int i=0; i<game.length;i++) {
				if(game[i] ==exit) {
					eidx = i;
				}
			}
			if((idx-1) == eidx) {
				exit+=1;
			}
		}
		
		
	}
}
