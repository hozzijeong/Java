package ex;

import java.util.Scanner;

//오목
//1. 10 x 10
//2. 2인용
//3. ○ ●
//4. 입력도 X,Y축으로!
//5. 승패
public class Day13_Ex02_OMOK {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int size = 10;
		int [][]omok = new int[size][size];
		
		
		int turn = 0; // 순서를 결정
		int win = 0; // 승패 결정
		
		/* 해야할 일
		 * 1. 오목판 생성
		 * 2. 순서에 맞게 위치를 입력 받음.
		 * 3. 입력받은 위치는 player1 의경우 1로, player2의 경우 2로 표시 받음.
		 * 4. 표시받은 것을 1은 백돌로 2는 흑돌로 변형해서 출력함.
		 * 일단 여기까지
		 * ===================================================
		 * 
		 * 또다른 방법:
		 * "/"방향은 i+j의 값이 모두 같음. 서로 같은 5개의 값을 찾으면 됨.
		 * |(역슬레시)방향은 i+j의 값이 +2씩 증가함. +2씩 증가한 값을 찾ㅈ으면됨. 
		 * 
		 */
		
		while(true) {
			System.out.println("========== OMOK ==========");
			System.out.print("  ");
			for(int i=0; i<size;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i=0; i<size;i++) {
				System.out.print(i+" ");
				for(int j=0; j<size;j++) {
					if(omok[i][j] ==0) {
						System.out.print("  ");
					}else if(omok[i][j] ==1) {
						System.out.print("○ ");
					}else if(omok[i][j] ==2) {
						System.out.print("● ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			if(turn%2==0) {
				System.out.println("   === [P1(백)]차례 ===");
				
				System.out.println("X입력[0~9]");
				int x = scan.nextInt();
				System.out.println("Y입력[0~9]");
				int y = scan.nextInt();
				
				if(omok[y][x] ==0) {
					omok[y][x] = 1;
				}else {
					continue;
				}
				turn+=1;
				
			}else if(turn%2==1) {
				System.out.println("   === [P2(흑)]차례 ===");
				
				System.out.println("X입력[0~9]");
				int x = scan.nextInt();
				System.out.println("Y입력[0~9]");
				int y = scan.nextInt();
				
				if(omok[y][x] ==0) {
					omok[y][x] = 2;
				}else {
					continue;
				}
				turn+=1;				
				
			}
			
			
			/*
			 * 오목의 승리조건:
			 * 가로 혹은 세로 혹은 대각선(연속된 숫자)이 존재하면 승리함.
			 * 일단은 가로/ 세로에서 count를 이용해서 요소 검사를 함.
			 * 
			 * 대각선은 일단 나중에
			 * 
			 */
			
			for(int i=0; i<size;i++) {
				int p1_garo = 0;
				int p1_sero = 0;
				int p2_garo = 0;
				int p2_sero = 0;
				for(int j=0; j<size;j++) {
					if(omok[i][j] ==1) {
						p1_garo +=1;
						if(p1_garo ==5) {
							win = 1;
						}
					}
					if(omok[j][i] ==1) {
						p1_garo +=1;
						if(p1_garo ==5) {
							win = 1;
						}
					}
					if(omok[i][j] ==2) {
						p2_garo +=1;
						if(p2_garo ==5) {
							win = 2;
						}
					}
					if(omok[j][i] ==2) {
						p2_sero +=1;
						if(p2_sero ==5) {
							win = 2;
						}
					}
				}
			}
			// 오 -> 왼 대각선
			/*
			 * i 는 6보다 작아야 한다. 그래야지 i+4를 했을때 9가 나올수 ㅜ있다
			 * j 는 4보다 커야한다. 그래야지 j-4를 했을때 0이 나온다. 
			 * j 는 9부터 시작해서 -1씩, i 는 0부터 시작해서 +1씩 한다. 
			 */
			for(int i=0;i<size-4;i++) {
				for(int j=size-1;j>3;j--) {
					int p1_cross = 0;
					int p2_cross = 0;
					for(int k=0; k<5;k++) {
						if(omok[i+k][j-k] ==1) {
							p1_cross +=1;
							if(p1_cross==5) {
								win = 1;
							}
						}
						if(omok[i+k][j-k]==2) {
							p2_cross+=1;
							if(p2_cross==5) {
								win=2;
							}
						}
					}
				}
			}
			
			for(int i=0; i<6;i++) {
				for(int j=0;j<6;j++) {
					int p1_cross = 0;
					int p2_cross = 0;
					for(int k=0;k<5;k++) {
						if(omok[i+k][j+k]==1) {
							p1_cross+=1;
							if(p1_cross==5) {
								win = 1;
							}
						}
						if(omok[i+k][j+k]==2) {
							p2_cross+=1;
							if(p2_cross==5) {
								win = 2;
							}
						}
					}
				}
			}
			
			
			if(win ==1)	{
				System.out.println("[P1(백)]승리");
				break;
			}else if(win ==2) {
				System.out.println("[P2(흑)]승리");
				break;
			}
			
			
			
		}
		
		
	}
}
