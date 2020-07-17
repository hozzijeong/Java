package ex;
/*
 * # EXIT 게임
 * 1. game배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1증가한다.
 * 3. exit변수의 값이 16이되면 게임은 종료된다.
 */

import java.util.Scanner;

public class Day08_Ex04_EXITGAME {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int exit = 10;
		
		int[] game = {11, 15, 10, 14, 12, 13};
		
		while(exit<16) {
			System.out.println("EXIT:"+exit);
			
			for(int i=0; i<6; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
//			int answer = 0;
//			for(int i=0; i<6; i++){
//				if(game[i] == exit){
//					 answer = i;
//				}
//			}
//			
			
			System.out.println("숫자 입력:");
			int num = scan.nextInt();
			
//			if(answer == num) {
//				exit+=1;
//			}
//			
			
			for(int i=0; i<6; i++) {
				if(game[i] == exit) {
					if(num == i) {
						exit+=1;
					}
				}
			}
		}
		
		
		

	}
}
