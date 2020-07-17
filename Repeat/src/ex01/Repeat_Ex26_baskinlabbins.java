package ex01;
/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

import java.util.Scanner;

public class Repeat_Ex26_baskinlabbins {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int br = 0;
		int turn = 0;
		int cnt = 1;
		boolean run = true;
		
		while(run) {
			System.out.printf("===%d턴=== \n",cnt);
			if(turn%2 ==0) {
				System.out.println("[p1]입력:");
				int p1 = scan.nextInt();
				br +=p1;
				System.out.printf("p1(%d)  br(%d)\n",p1,br);
				turn +=1;
			}else if(turn%2 ==1) {
				System.out.println("[p2]입력");
				int p2 = scan.nextInt();
				br+=p2;
				System.out.printf("p2(%d)  br(%d)\n",p2,br);
				turn+=1;
			}
			if(br>=32) {
				run = false;
			}
			cnt+=1;
		}
		if(turn%2 ==0 && br>=32) {
			System.out.println("[p1]승리");
		}else if(turn%2 ==0 && br>=32) {
			System.out.println("[p2]승리");
		}
	}
}
