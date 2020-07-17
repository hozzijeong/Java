package ex07_method;

import java.util.Scanner;

class Game{
	Scanner scan = new Scanner(System.in);
	
	int[] move = {0,0,0,0,8,0,0,0,0,0,0};
	int player = 4;
	
	void printPlay() {
		for(int i=0; i<move.length;i++) {
			if(move[i] ==0) System.out.print("[ ]");
			else System.out.print("읏");
		}
	}
	void showMenu() {
		System.out.println("1.좌");
		System.out.println("2.우");
		System.out.println("3.종료");
	}
	void moveLeft() {
		if(player>0) {
			move[player] = 0;
			move[player-1] = 8;
			player -=1;
		}else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	void moveRight() {
		if(player<move.length-1) {
			move[player] = 0;
			move[player+1] = 8;
			player+=1;
		}else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	void run() {
		while(true) {
			//게임 화면 출력
			printPlay();
			System.out.println();
			//메뉴 출력	
			showMenu();
			//메뉴 선택
			System.out.print(": ");
			int choice = scan.nextInt();
			
			System.out.println();
			if(choice ==1) {
				moveLeft();
			}
			else if(choice ==2) moveRight();
			else if(choice ==3) break;
		
		
		
		
		}
	}
}
public class Repeat_Ex06_movenum {
	public static void main(String[] args) {
		Game g = new Game();
		
		g.run();
	}
}
