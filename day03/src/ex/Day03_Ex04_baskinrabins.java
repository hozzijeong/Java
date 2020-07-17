package ex;
/*
 * # 베스킨라빈스31
 * 1232~1256(24분)
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

public class Day03_Ex04_baskinrabins {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
//		while (br<=31) {						
//			System.out.println("p1 숫자 입력(1~3)");
//			turn = turn +1;
//			p1 = scan.nextInt();
//			br = br+p1;
//			System.out.printf("%d턴: p1(%d) br(%d)\n",turn,p1,br);
//			if (br>=32) {
//				System.out.println("승리자:p2");
//				System.out.println("게임 종료");
//			}
//			System.out.println("p2 숫자 입력(1~3)");
//			turn = turn +1;
//			p2 = scan.nextInt();
//			br = br+p2;
//			System.out.printf("%d턴: p2(%d) br(%d)\n",turn,p2,br);
//			if (br>=32) {
//				System.out.println("승리자:p1");
//				System.out.println("게임 종료");
//			}
//			
//		}
		boolean run = true;
		
		while(run) {
			
			if (turn %2 == 0) {
				System.out.println("[p1]차례 1~3입력:");
				p1 = scan.nextInt();
				br +=p1;
				turn +=1;
			}else if(turn %2 == 1) {
				System.out.println("[p2]차례 1~3입력:");
				p2 = scan.nextInt();
				br +=p2;
				turn +=1;
			}
			System.out.println("br:"+br);

			if(br>=32) {
				if(turn%2 == 0) {
					System.out.println("[p1]승리");
				}else if (turn%2 ==1) {
					System.out.println("[p2]승리");
				}
				run = false;
				System.out.println("게임 종료");
			}
		}
	}
}
