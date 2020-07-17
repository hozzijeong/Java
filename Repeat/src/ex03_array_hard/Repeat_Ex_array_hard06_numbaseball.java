package ex03_array_hard;

import java.util.Random;
import java.util.Scanner;

/*
 * # 숫자 야구 게임
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */


public class Repeat_Ex_array_hard06_numbaseball {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];

		
		while(true) {
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<me.length;i++) {
				System.out.println("숫자 입력[1~9]:");
				int num = scan.nextInt();
				int check =1;

				for(int j=0; j<i;j++) {
					if(me[j] == num) {
						check = -1;
					}
				}
				if(check == -1) {
					i -=1;
				}else {
					me[i] = num;
				}

			}
			System.out.print("[ ");
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " " );
			}
			System.out.print("] : ");
			
			for(int i=0; i<3;i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i==j) {
							strike+=1;
						}else if(i!=j) {
							ball+=1;
						}
					}
				}
			}
			
			System.out.printf("%d s %d b",strike,ball);
			System.out.println();
			
			if(strike ==3) {
				break;
			}
			
		}


	}
}
