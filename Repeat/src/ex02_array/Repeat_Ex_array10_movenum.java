package ex02_array;

import java.util.Scanner;

/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */


public class Repeat_Ex_array10_movenum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		
		boolean run = true;
		
		while(run) {
			for(int i=0; i<7; i++) {
				if(game[i] == 2) {
					player = i;
					System.out.print("�� ");
				}else {
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			System.out.println("���� �Է� [1]�� ����, [2]�� ������ �̵�");
			int num = scan.nextInt();
			
			if(player-1 >=0) {
				if(num ==1) {
				game[player-1] = game[player];
				game[player] = 0;
				}
			}
			if(player+1<=6) {
				if(num ==2) {
					game[player +1] = game[player];
					game[player] = 0;
				}
			}
		}


	}
}
