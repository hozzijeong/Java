package day24;

import java.util.Random;
import java.util.Scanner;

class Speed{
	
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[][] front = new int[3][3];
	int [][] back = new int[3][3];
	
	int num = 1;
	
	void setNumber() {
		int k = 1;
		for(int i=0; i<front.length;i++) {
			for(int j=0; j<front[i].length;j++){
				front[i][j] = k;
				k+=1;
			}
		}
		
		for(int i=0; i<back.length;i++) {
			for(int j=0; j<back[i].length;j++) {
				back[i][j] = k;
				k+=1;
			}
		}
	}
	
	void shuffleCard() {
		for(int i=0; i<front.length; i++	) {
			for(int j=0; j<front[i].length;j++) {
				int xR = ran.nextInt(front.length);
				int yR = ran.nextInt(front[i].length);
				
				int temp = front[0][0];
				
				front[0][0] = front[yR][xR];
				front[yR][xR] = temp;
				
				temp = back[0][0];
				back[0][0] = back[yR][xR];
				back[yR][xR] = temp;
			}
		}
	}
	
	void showCard() {
		for(int i=0; i<front.length; i++) {
			for(int j=0; j<front[i].length; j++) {
				System.out.print(front[i][j] +"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	void selectCard() {
		System.out.println("x입력");
		int x = scan.nextInt() -1;
		
		System.out.println("y입력");
		int y = scan.nextInt() -1;
		
		if(num == front[y][x]) {
			if(num<=9) {
				front[y][x] = back[y][x];
			}else {
				front[y][x] = 0;
			}
			num +=1;
		}
	}
	
	void run() {
		setNumber();
		shuffleCard();
		
		while(true) {
			showCard();
			
			
			if(num ==19) {
				System.out.println("게임종료");
				break;
			}
			
			selectCard();
		}
		
	}
}
public class Day24_Ex02_1_to_18 {
	public static void main(String[] args) {
		Speed s = new Speed();
		
		s.run();
	}
}
