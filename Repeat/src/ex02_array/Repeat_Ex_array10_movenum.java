package ex02_array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */


public class Repeat_Ex_array10_movenum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		
		boolean run = true;
		
		while(run) {
			for(int i=0; i<7; i++) {
				if(game[i] == 2) {
					player = i;
					System.out.print("옷 ");
				}else {
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			System.out.println("숫자 입력 [1]은 왼쪽, [2]는 오른쪽 이동");
			int num = scan.nextInt();
			
			if(player-1 >=0) {
				if(num ==1) {
				game[player-1] = game[player];
				game[player] = 0;
				}
			}
			if(player+1<=6) {
				if(num ==2) {
					game[player +1] = game[player];
					game[player] = 0;
				}
			}
		}


	}
}
