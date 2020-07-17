package ex;

import java.util.Random;
import java.util.Scanner;

public class Day13_Ex01_BINGO_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int Max = 5;
		int [][]p1_bingo = new int[Max][Max]; // player1의 빙고판
		int [][]p2_bingo = new int[Max][Max]; // player2의 빙고판
			
		int [] temp = new int[Max*Max]; // 임의의 숫자를 넣을 배열
	
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
		// temp에 1~50까지 숫자 중 25개를 중복없이 넣음.
		int k=0;
		for(int i=0; i<Max;i++) {
			for(int j=0; j<Max; j++) {
				p1_bingo[i][j] = temp[k];
				k+=1;
			}
		}
		// temp에 있던 임의의 숫자들을 player1빙고판에 넣음
		
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
		// 또다시 temp에 1~50까지의 숫자 중 임의의 숫자 25개를 넣음. 
		
		k = 0;
		for(int i=0; i<Max;i++) {
			for(int j=0; j<Max; j++) {
				p2_bingo[i][j] = temp[k];
				k+=1;
			}
		}
		// 이번엔 player2의 빙고판에 숫자들을 배정함. ㅓ
		
		
		int turn = 0; // player들의 순서를 결정하는 int. (홀,짝 을 구분으로 순서를 바꿈) 
		int win = 0; // 누가 먼저 빙고를 만드냐. 
		
		while(true) {
			System.out.println("================= BINGO =================");
			System.out.println("\t\t===[P1]===");
			System.out.print("\t");
			
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
				for(int j=0; j<Max;j++) {
					if(p1_bingo[i][j] ==0) {
						System.out.print("[O]\t");
					}else {
						System.out.print(p1_bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			// p1_bingo의 빙고판 출력
			
			System.out.println();
			
			System.out.println("\t\t===[P2]===");
			System.out.print("\t");
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			for(int i=0; i<Max;i++) {
				System.out.print(i+"\t");
				for(int j=0; j<Max;j++) {
					if(p2_bingo[i][j] ==0) {
						System.out.print("[O]\t");
					}else {
						System.out.print(p2_bingo[i][j]+"\t");
					}
				}
				System.out.println();
			}
			//p2_bingo의 빙고판 출력

			
			/* 해야할 일
			 * 1.입력 받기
			 * 	1. p1과 p2가 순서를 번갈아가면서 숫자를 입력 받도록 한다.turn을 사용! 
			 * 	2. p1에서 입력한 인덱스 값(x,y)축의 값!이 p2의 값이도 있으면, p2의 값도 같으 변경한다!.
			 * 	3. p1의 값이 바뀌면 당연히 mark의 값도 0으로 변경하고, 만약에 해당 인덱스도 그 값이 같다면 p2의 mark값도 같이 변경해준다.
			 *======================================================================================= 
			 * 2. 승자 계산
			 * 	1. mark의 값 중 먼저 가로/세로/대각선 한줄을 채운 쪽을 승리로 한다. 
			 *	2. 입력받은 데이터의 값, 즉 1-2번을 일단 잘 해본다...
			 */
			System.out.println();
			if(turn%2 ==0) {
				System.out.println("===== [P1]차례 =====");
				System.out.println("[P1] X축입력[0~4]");
				int x = scan.nextInt();
				System.out.println("[P1] Y축 입력[0~4]");
				int y = scan.nextInt();
				//p1의 체크할 값을 입력받음.
				for(int i=0;i<Max;i++) {
					for(int j=0; j<Max; j++) {
						if(p1_bingo[y][x] == p2_bingo[i][j]) {
							p2_bingo[i][j] = 0;
						}
					}
				}
				// 만약에 p1에서 체크한 값들이 p2의 값에도 있다면 해당 인덱스에 있는 값을 0으로 바꿈
				
				p1_bingo[y][x] = 0;
				// p1에 나온 bingo 값들을 0으로 바꿈
				turn+=1;
				//turn을 홀수로 만들어서 다음 턴으로 넘겨줌
				
			}else {
				System.out.println("===== [P2]차례 =====");
				System.out.println("[P2] X축입력[0~4]");
				int x = scan.nextInt();
				System.out.println("[P2] Y축 입력[0~4]");
				int y = scan.nextInt();
				//p2의 체크할 값을 입력받음.
				for(int i=0;i<Max;i++) {
					for(int j=0; j<Max; j++) {
						if(p2_bingo[y][x] == p1_bingo[i][j]) {
							p1_bingo[i][j] = 0;
						}
					}
				}
				// 만약에 p2에서 체크한 값들이 p1의 값에도 있다면 해당 인덱스에 있는 값을 0으로 바꿔줌
				
				p2_bingo[y][x] = 0;
				// p2에 나온 bingo 값들을 0으로 바꿈
				turn +=1;
			}
			
			for (int i=0; i<Max; i++) {
				int p1_garo = 0;
				int p1_sero = 0;
				int p2_garo = 0;
				int p2_sero = 0;
				for(int j=0; j<Max; j++) {
					if(p1_bingo[i][j] ==0) {
						p1_garo+=1;
						if(p1_garo == 5) {
							win = 1;
						}
					}
					if(p1_bingo[j][i] ==0) {
						p1_sero+=1;
						if(p1_sero ==5) {
							win = 1;
						}
					}
					if(p2_bingo[i][j] ==0) {
						p2_garo+=1;
						if(p2_garo ==5) {
							win = 2;
						}
					}
					if(p2_bingo[j][i] ==0) {
						p2_sero +=1;
						if(p2_sero ==5) {
							win = 2;
						}
					}
				}
			}
			// 각각 p1,p2의 가로 세로 검사.
			
			//이제 대각선 검사.
			int p1_cross = 0;
			int p2_cross = 0;
			for(int i=0; i<Max;i++) {
				if(p1_bingo[i][i] ==0) {
					p1_cross+=1;
					if(p1_cross ==5) {
						win = 1;
					}
				}
				if(p2_bingo[i][i] ==0) {
					p2_cross+=1;
					if(p2_cross==5) {
						win = 2;
					}
				}
			}
			
			//역대각선 검사
			
			int p1_rcross = 0;
			int p2_rcross = 0;
			for(int i=0; i<Max;i++) {
				for(int j=0; j<Max; j++) {
					if(i+j ==4 && p1_bingo[i][j]==0) {
						p1_rcross+=1;
						if(p1_rcross ==5) {
							win = 1;
						}
					}
					if(i+j ==4 && p2_bingo[i][j] ==0) {
						p2_rcross +=1;
						if(p2_rcross ==5) {
							win = 2;
						}
					}
				}
			}
			
			
			if(win ==2) {
				System.out.println("[P2]승리");
				break;
			}else if(win ==1) {
				System.out.println("[P1]승리");
				break;
			}
			
			
			
			
			
			
			
		}
	}
}
