package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */


public class Repeat_Ex22_while {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int cnt = 0;
		while(i<5) {
			int rnum1 = ran.nextInt(8)+2;
			int rnum2 = ran.nextInt(9)+1;
			System.out.printf("%d X %d = ",rnum1,rnum2);
			int answer = scan.nextInt();
			if(answer == rnum1*rnum2) {
				System.out.println("정답");
				cnt+=1;
			}else {
				System.out.println("오답");
			}
			i+=1;
		}
		System.out.println("성적: "+(cnt*20));
		
		
	}
}
