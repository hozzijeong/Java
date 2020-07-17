package ex;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */
class Ex08{
	int [] game = {0,0,1,0,2,0,0,1,0,};
}

public class Day22_Ex09_movenum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex08 e = new Ex08();
		
		final int PLAYER = 2;
		final int WALL = 1;
		int pX = 0;
		
		for(int i=0; i<e.game.length;i++) {
			if(e.game[i] == PLAYER) {
				pX = i;
			}
		}
		
		
		while(true) {
			for(int i=0; i<e.game.length;i++) {
				if(e.game[i] == PLAYER) {
					System.out.print("읏");
				}else if(e.game[i] ==WALL) {
					System.out.print("┃");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
			
			System.out.println("[1]왼쪽 [2]오른쪽");
			int move = scan.nextInt();
			
			int xx = pX;
			
			if(move ==1) {
				xx -=1;
			}else if(move ==2) {
				xx +=1;
			}
			if(xx<0 || xx+1>e.game.length) continue;
			
			if( e.game[xx] ==WALL) {
				System.out.println("[3]격파");
				int des = scan.nextInt();
				if(des == 3) {
					e.game[xx] = 0;
				}else {
					continue;
				}
			}
			
			e.game[pX] =0;
			pX = xx;
			e.game[pX] = PLAYER;
			
			
			
		}
		
		
		
	}
}
