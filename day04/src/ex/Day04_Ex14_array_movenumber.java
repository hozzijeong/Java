package ex;
/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */

import java.util.Random;
import java.util.Scanner;

public class Day04_Ex14_array_movenumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}

		boolean run = true;
		while(run) {
			
			for(int i=0; i<7;i++) {
				if(game[i] ==2) {
					System.out.print("�� ");
				}else{
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			System.out.println("���� �Է�[1 <- or ->2]: ");
			int move = scan.nextInt();
			
			
			if(player>0) {
				if(move == 1) {
					game[player-1] =2; 
					game[player] = 0;
					player -=1;
				}
			}
			if(player<7) {
				if(move ==2) {
					game[player +1] = 2;
					game[player] = 0;
					player +=1;
				}
			}
			
		}


	}
}
