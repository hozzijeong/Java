package ex;

import java.util.Scanner;

public class Day04_Ex15_array_movenum {
	public static void main(String[] args) {
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		Scanner scan = new Scanner(System.in);
		int player = 0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<6; i++) {
				if(game[i] == 2) {
					System.out.print("¿Ê ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
			
			System.out.print("¿ÞÂÊ[1] ¿À¸¥ÂÊ[2] ÀÔ·Â : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(player - 1 >= 0) {
					game[player - 1] = 2;
					game[player] = 0;
					player -= 1;
				}
			}
			else if(move == 2) {
				if(player + 1 < 6) {
					game[player + 1] = 2;
					game[player] = 0;
					player += 1;
				}
			}
		}
		


	}
}
