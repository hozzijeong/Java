package ex;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

public class Day08_Ex07_1_to_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		for(int i=0; i<9;i++) {
			front[i] = i+1;
			back[i] = i+10;
		}
		// 숫자 셔플
		
		for(int i=0; i<1000;i++) {
			int rNum1 = ran.nextInt(9)+1;
			
			int temp1 = front[0];
			front[0] = front[rNum1-1];
			front[rNum1-1] = temp1;
			
			int temp2 = back[0];
			back[0] = back[rNum1-1];
			back[rNum1-1] = temp2;
		}
		
		int num = 1;
		
		while(true) {
			
			System.out.println("[front] ");
			for(int i=0; i<9;i++) {
				System.out.print(front[i] +" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			
			System.out.println("[back]");
			for(int i=0; i<9;i++) {
				System.out.print(back[i] +" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			System.out.println(" ");
			
			System.out.println("입력:");
			int data = scan.nextInt();
			
			if(num<=9) {
				if(front[data] == num) {
					front[data] = 0;
					num+=1;
				}
			}else {
				if(data == num) {
					back[data-10] = 0;
					num+=1;
				}
			}
			if(num == 18) {
				break;
			}
			
		}
		
		
	}
}
