package day24;

import java.util.Random;
import java.util.Scanner;

class Plus{
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	
	int total = 0;
	
	void setNumber() {
		for(int i=0; i<game.length;i++) {
			int r = ran.nextInt(10)+1;
			
			game[i] =r;
			
			int check = 1;
			
			for(int j=0; j<i; j++) {
				if(game[i] == game[j]) {
					check = -1;
				}
			}
			
			if(check ==-1) {
				i-=1;
			}
		}
		
	}
	
	
	void setIdx() {
		for(int i=0; i<idx.length;i++) {
			int r = ran.nextInt(6);
			idx[i] = r;
			
			int check = 1;
			
			for(int j=0; j<i; j++) {
				if(idx[i] == idx[j]) {
					check = -1;
				}
			}
			
			if(check ==-1) {
				i-=1;
			}
		}
	}
	
	
	void setTotal() {
		for(int i=0; i<idx.length;i++) {
			total += game[idx[i]];
		}
	}
	
	void printNumber() {
		System.out.print("[");
		for(int i=0; i<game.length;i++) {
			System.out.print(game[i]+" ");
		}
		System.out.println("]");
		
		System.out.println("합 = "+ total);
	}
	
	
	int choiceIdx()	{
		for(int i=0; i<myIdx.length;i++) {
			System.out.print("인덱스"+(i+1)+"입력:");
			int r = scan.nextInt();
			myIdx[i] = r;
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(myIdx[i] == myIdx[j]) {
					check = -1;
				}
			}
			
			if(check ==-1) {
				i-=1;
			}
			
			
		}
		
		int myTotal = 0;
		
		for(int i=0; i<myIdx.length;i++) {
			myTotal+= game[myIdx[i]];
		}
		
		return myTotal;
	}
	
	void run() {
		
		setNumber();
		
		setIdx();
		
		setTotal();
		
		
		
		while (true) {
			System.out.println("@합과 일치하도록 숫자 3개 선택");
			printNumber();
			
			int myTotal = choiceIdx();
			
			if(total == myTotal) {
				System.out.println("정답");
				break;
			}
		}
	}
}
public class Day24_Ex01_SUMGAME {
	public static void main(String[] args) {
		Plus p = new Plus();
		
		p.run();
	}
}
