package ex01;
/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������
 * 	1) 2���̸�, ¦¦�� ���
 *  2) 1���̸�, ¦�� ���
 *  3) 0���̸�, �ش� ���ڸ� ���
 * ��)
 * 		33	 : ¦¦
 * 		16	 : ¦
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
			System.out.println("¦¦");
		}
		if(cnt ==1) {
			System.out.println("¦");
		}
		if(cnt==0) {
			System.out.println(rnum);
		}
	}
}
