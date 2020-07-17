package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */


public class Repeat_Ex25_upanddown_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rnum = ran.nextInt(100)+1;
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("숫자를 입력하세요:");
			int answer = scan.nextInt();
			
			if(answer == rnum) {
				System.out.println("정답!");
				run = false;
			}else if(answer >rnum) {
				System.out.println("Down");
				cnt+=1;
			}else if(answer<rnum) {
				System.out.println("Up");
				cnt+=1;
			}
		}
		System.out.println("점수: "+(100 - cnt*5));
		
	}
}
