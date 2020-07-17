package ex;

import java.util.Scanner;

/* 
 * # ∆Ω≈√≈‰
 * === ∆Ω≈√≈‰ ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]¿Œµ¶Ω∫ ¿‘∑¬ : 6
 * === ∆Ω≈√≈‰ ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]Ω¬∏Æ
 * 
 */

public class Day05_Ex03_TickTackTok {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 *  0 1 2
		 *  3 4 5
		 *  6 7 8
		 */
		
		
		int[] game = new int[9];

		
		int turn = 0;
		int win = 0;
		
		while(true) {	
			System.out.println("===== ∆Ω≈√≈‰ =====");
			for(int i=0; i<9; i++) {
				if(game[i] == 0) {
					System.out.print("[ ]");
				}else if(game[i] == 1) {
					System.out.print("[O]");
				}else if (game[i] ==2) {
					System.out.print("[X]");
				}
				if(i % 3 == 2) {
					System.out.println();
				}
			}
			
			if (win == 1) {
				System.out.println("[p1]Ω¬∏Æ:");
				break;
			}
			else if(win ==2) {
				System.out.println("[p2]Ω¬∏Æ");
				break;
			}
			
			
			if(turn%2 == 0) {
				System.out.println("[p1]¿‘∑¬:");
				int p1 = scan.nextInt();
				
				if(game[p1] == 0) {
					game[p1] = 1;
					turn+=1;
				}
			}
			else if (turn %2 ==1) {
				System.out.println("[p2]¿‘∑¬:");
				int p2 = scan.nextInt();
				
				if(game[p2] ==0) {
					game[p2]=2;
					turn +=1;
				}
			}
			
			for( int i = 0; i<9; i+=3) {
				if(game[i] ==1 &&game[i+1]==1&& game[i+2]==1) {
					win = 1;
				}
				if(game[i] ==2 &&game[i+1]==2&& game[i+2]==2) {
					win = 2;
				}
			}
			for(int i =0; i<3; i++) {
				if(game[i+3]==1 && game[i+6]==1 && game[i] ==1) {
					win = 1;
				}
				if(game[i+3]==2 && game[i+6]==2 && game[i] ==2) {
					win = 2;
				}
			}
			if(game[0] ==1 && game[4] ==1 && game[8] ==1 ) {
				win =1;
			}
			if(game[2] ==1 && game[4] ==1 && game[6] ==1 ) {
				win =1;
			}
			if(game[0] ==2 && game[4] ==2 && game[8] ==2 ) {
				win =2;
			}
			if(game[2] ==2 && game[4] ==2 && game[6] ==2 ) {
				win =2;
			}			
		}
	}
}






