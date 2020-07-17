package ex03_array_hard;

import java.util.Scanner;

/*
 * # EXIT 게임
 * 1. game배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1증가한다.
 * 3. exit변수의 값이 16이되면 게임은 종료된다.
 */

public class Repeat_Ex_array_hard04_EXIT_GAME {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int exit = 10;
		
		int[] game = {11,15,10,14,12,13};
		
		while(exit<16) {
			System.out.println("EXIT:"+exit);
			for(int i=0; i<game.length;i++) {
				System.out.print(game[i] +" ");
			}
			System.out.println();
			System.out.println("위치 입력[1~6]:");
			int idx = scan.nextInt();
			
			int eidx = 0;
			for(int i=0; i<game.length;i++) {
				if(game[i] ==exit) {
					eidx = i;
				}
			}
			if((idx-1) == eidx) {
				exit+=1;
			}
		}
		
		
	}
}
