package ex;

import java.util.Random;
import java.util.Scanner;

public class Day12_Ex03_bingo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		
		final int Maxnum = 5;
		
		int [][] bingo = new int[Maxnum][Maxnum];
		int [][] mark = new int[Maxnum+1][Maxnum+1];
		
		int[] temp = new int[Maxnum*Maxnum]; // bingo 안에 들어갈 랜덤한 숫자 25개를 일단 여기에 넣음
		
		for(int i=0; i<temp.length;i++) {
			int r = ran.nextInt(50)+1;
			temp[i] = r;
			int j=0;
			int check = 1;
			while(j<i) {
				if(temp[j] == temp[i]) {
					check = -1;
				}
				j+=1;
			}
			if(check == -1) {
				i-=1;
			}
		}
		// temp안에 1~50까지의 숫자 중 랜덤한 숫자 25개를 넣음. 
		int k=0;
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j] = temp[k];
				k+=1;
			}                                  
		}
		// temp안에 있던 숫자를 bingo안에 넣었음!. 
		
		/* 해야할일
		 * 1. bingo게임을 실행한다.
		 * 		1. X,Y축을 입력 받고 거기에 해당하는 숫자를 넣어야 함. 즉 한번에 3개의 데이터를 받음.
		 * 		2. 입력받은 데이터가 해당 위치에 있는 숫자들과 맞아 떨어진다면, mark에 표시를 함 
		 * 		3. mark에 표시가 되었을때 빙고가 완성이 되면, 승리 출력. 
		 * 2. 승리 조건.
		 * 		1. 가로 5개중 한개가 먼저 완성이 된다.
		 * 		2. 세로 5개중 한개가 먼저 완성이 된다.
		 * 		3. 대각선 2개중 한개가 먼저 완성이 된다. 
		 */	
		
		
		
		int cross =0;
		int rcross = 0;
		while(true) {
			
			for(int i=0;i<bingo.length;i++) {
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j] ==100) {
						System.out.print("B\t");
					}else {
						System.out.print(bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			
			
			System.out.println("X축[0~4](가로)입력:");
			int x = scan.nextInt();
			System.out.println("Y축[0~4](세로)입력:");
			int y = scan.nextInt();
			System.out.println("값[1~50] 입력:");
			int data  = scan.nextInt();
			
			for(int i=0;i<bingo.length;i++) {
				for(int j=0;j<bingo[i].length;j++) {
					if(bingo[i][j] == data) {
						if(i == x && j ==y) {
							bingo[i][j] = 100;
							if(i == j) {
								cross+=1;
							}
							if(i+j ==4) {
								rcross+=1;
							}
						}
					}
				}
			}
			// 행과 열(X축 Y축)을 입력하고  입력한 값이 해당 위치에 있는데이터 값과 같으면 해당 숫자를 100으로 치환.
			
			int win = -1;
			for(int i=0;i<bingo.length;i++) {
				int garo = 0;
				int sero = 0;
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j] == 100) {
						mark[i][j] =1;
					}
					garo+= mark[i][j];
					sero+= mark[j][i];
				}
				mark[i][5] = garo;
				mark[5][i] = sero;
			}
			
			
			for(int i=0; i<5; i++) {
				if(mark[i][5] ==5) {
					win = 1;
				}
				if(mark[5][i] == 5) {
					win = 1;
				}
			}
			
			if(cross == 5) {
				win =1;
			}
			
			if(rcross ==5) {
				win =1;
			}
			
			
			if(win ==1) {
				System.out.println("bingo!");
				break;
			}
			
			
		}
		
	}
}
