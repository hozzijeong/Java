package ex07_method;

import java.util.Scanner;

class Game{
	Scanner scan = new Scanner(System.in);
	
	int[] move = {0,0,0,0,8,0,0,0,0,0,0};
	int player = 4;
	
	void printPlay() {
		for(int i=0; i<move.length;i++) {
			if(move[i] ==0) System.out.print("[ ]");
			else System.out.print("��");
		}
	}
	void showMenu() {
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.����");
	}
	void moveLeft() {
		if(player>0) {
			move[player] = 0;
			move[player-1] = 8;
			player -=1;
		}else {
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
	}
	void moveRight() {
		if(player<move.length-1) {
			move[player] = 0;
			move[player+1] = 8;
			player+=1;
		}else {
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
	}
	void run() {
		while(true) {
			//���� ȭ�� ���
			printPlay();
			System.out.println();
			//�޴� ���	
			showMenu();
			//�޴� ����
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
