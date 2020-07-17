package ex01;
/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

import java.util.Random;

public class Repeat_Ex19_369games {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int cnt = 0;
		
		int rnum = ran.nextInt(50)+1;
		
		System.out.println(rnum);
		if((rnum/10)%3==0 && rnum>10) {
			cnt +=1;
		}
		
		if((rnum%10)%3 == 0 && rnum%10 != 0) {
			cnt +=1;
		}
		
		
		if((rnum%10)%3 != 0) {
			cnt += 0;
		}
		
		if(cnt ==2) {
			System.out.println("짝짝");
		}
		if(cnt ==1) {
			System.out.println("짝");
		}
		if(cnt==0) {
			System.out.println(rnum);
		}
	}
}
