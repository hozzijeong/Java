package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */


public class Repeat_Ex25_upanddown_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rnum = ran.nextInt(100)+1;
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("���ڸ� �Է��ϼ���:");
			int answer = scan.nextInt();
			
			if(answer == rnum) {
				System.out.println("����!");
				run = false;
			}else if(answer >rnum) {
				System.out.println("Down");
				cnt+=1;
			}else if(answer<rnum) {
				System.out.println("Up");
				cnt+=1;
			}
		}
		System.out.println("����: "+(100 - cnt*5));
		
	}
}
