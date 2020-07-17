package ex07_method;

import java.util.Scanner;

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	int turn = 0;
	int win = 0;
	
	void setGame() {
		for(int i=0; i<game.length;i++) {
			for(int j=0; j<game[i].length;j++) {
				game[i][j] = " ";
			}
		}
	}
	
	void showGame() {
		System.out.println("==Æ½ÅÃÅä==");
		for(int i=0; i<game.length;i++) {
			for(int j=0; j<game[i].length;j++) {
				System.out.print("["+game[i][j]+"]");
				
			}
			System.out.println();
		}
		System.out.println("==========");
	}
	
	void choiceIdx() {
		if(turn%2 ==0) {
			System.out.println("[1ÅÏ]xÀÎµ¦½º ÀÔ·Â:");
			int x = scan.nextInt();
			System.out.println("[1ÅÏ]yÀÎµ¦½º ÀÔ·Â:");
			int y = scan.nextInt();
			
			if(game[y][x].equals(" ")) {
				game[y][x] = "[O]";
				turn+=1;
			}else {
				System.out.println("´Ù½Ã!");
			}
		}else if(turn%2 ==1) {
			System.out.println("[2ÅÏ]xÀÎµ¦½º ÀÔ·Â:");
			int x = scan.nextInt();
			System.out.println("[2ÅÏ]yÀÎµ¦½º ÀÔ·Â:");
			int y = scan.nextInt();
			if(game[y][x].equals(" ")) {
				game[y][x] = "[X]";
				turn +=1;
			}else {
				System.out.println("´Ù½Ã!");
			}
		}
	}
		
		void exitWidth() {
			for(int i=0; i<game.length;i++) {
				if(game[i][0].equals("[O]")&&game[i][1].equals("[O]")&&game[i][2].equals("[O]")) {
					win = 1;
				}
				if(game[i][0].equals("[X]")&&game[i][1].equals("[X]")&&game[i][2].equals("[X]")) {
					win = 2;
				}
			}
		}
		
		void exitHeight() {
			for(int i=0; i<game.length;i++) {
				if(game[0][i].equals("[O]")&& game[1][i].equals("[O]")&&game[2][i].equals("[O]")){
					win =1;
				}
				if(game[0][i].equals("[X]")&& game[1][i].equals("[X]")&&game[2][i].equals("[X]")){
					win =2;
				}
			}
		}
		
		void exitCross() {
			if(game[0][0].equals("[O]") && game[1][1].equals("[O]") && game[2][2].equals("[O]")) {
				win = 1;
			}
			if(game[0][0].equals("[X]") && game[1][1].equals("[X]") && game[2][2].equals("[X]")) {
				win = 1;
			}
		}
		void run() {
			
			setGame();
			
			while(true) {
				showGame();
				
				if(win ==1) {
					System.out.println("[p1]½Â");
					break;
				}else if(win ==2) {
					System.out.println("[p2]½Â");
					break;
				}
			choiceIdx();
			
			exitWidth();
			exitHeight();
			exitCross();
			
			
			}
			
		}

		
	
}
public class Repeat_Ex10_tictactoe {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		
		
		t.run();
	}
}
