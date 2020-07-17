package ex07_method;

import java.util.Random;
import java.util.Scanner;

class memoryGame{
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1,1,2,2,3,3,4,4,5,5};
	int[] back = new int [10];
	
	int cnt = 0;
	
	void shuffle() {
		for(int i=0; i<500; i++	) {
			int r = ran.nextInt(10);
			
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
	}
	void printcard() {
		for(int i=0; i<front.length;i++) {
			System.out.print(front[i] +" ");
		}
		System.out.println();
		for(int i=0; i<back.length;i++) {
			System.out.print(back[i] +" ");
		}
	}
	void choicecard() {
		System.out.println("카드 1입력[1~10]:");
		int card1 = scan.nextInt()-1;
		System.out.println("카드2입력[1~10]:");
		int card2 = scan.nextInt()-1;
		
		if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			cnt+=1;
		}
	}
	void run() {
		shuffle();
		
		while(true) {
			printcard();
			
			if(cnt ==5) {
				System.out.println("게임 종료");
				break;
			}
			
			choicecard();
			
		}
	}
}
public class Repeat_Ex07_remembergame {
	public static void main(String[] args) {
		memoryGame mg = new memoryGame();
		mg.run();
	}
}
