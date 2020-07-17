package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 2139~2144(5분)
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */

public class Day02_Ex06_gugu_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int i = 1;
		int score = 0;
		while(i<=5) {
			int num1 = ran.nextInt(9)+2;
			int num2 = ran.nextInt(9)+1;
			int result = num1*num2;
		
			System.out.printf("%d x %d = ",num1,num2);
			int answer = scan.nextInt();
			
			if (answer == result) {
				score = score+20;
			}
			i = i+1;
			
			
		}
		System.out.printf("점수:%d",score);
	}
}
