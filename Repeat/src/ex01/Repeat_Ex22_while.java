package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
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
				System.out.println("����");
				cnt+=1;
			}else {
				System.out.println("����");
			}
			i+=1;
		}
		System.out.println("����: "+(cnt*20));
		
		
	}
}
