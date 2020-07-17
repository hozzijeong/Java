package ex;
/*
 * # Up & Down 게임[2단계]
 * 222204~2211
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

import java.util.Random;
import java.util.Scanner;

public class Day02_Ex09_up_down_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cor = ran.nextInt(100)+1;
		int score = 100;
		int answer = -1;
		int cnt = 0;
		while (answer != cor) {
			System.out.println("숫자 입력:");
			answer = scan.nextInt();
			
			if (answer >cor) {
				System.out.println("Down!");
				score = score -5;
			}else if(answer<cor) {
				System.out.println("UP!");
				score = score -5;
			}else {
				System.out.println("정답!");
			}
			if (score == 0) {
				System.out.println("0점입니다");
				answer = cor;
			}
			cnt = cnt+1;
		}
		System.out.printf("게임 종료.\n 점수:%d\n 총 시도 횟수:%d\n",score,cnt);
	}
}
