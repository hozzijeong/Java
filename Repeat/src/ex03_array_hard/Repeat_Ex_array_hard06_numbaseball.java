package ex03_array_hard;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� �߱� ����
 * 1. me�� 1~9 ������ ���� 3���� ����
 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
 * ��)
 * ���� : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */


public class Repeat_Ex_array_hard06_numbaseball {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];

		
		while(true) {
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<me.length;i++) {
				System.out.println("���� �Է�[1~9]:");
				int num = scan.nextInt();
				int check =1;

				for(int j=0; j<i;j++) {
					if(me[j] == num) {
						check = -1;
					}
				}
				if(check == -1) {
					i -=1;
				}else {
					me[i] = num;
				}

			}
			System.out.print("[ ");
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " " );
			}
			System.out.print("] : ");
			
			for(int i=0; i<3;i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i==j) {
							strike+=1;
						}else if(i!=j) {
							ball+=1;
						}
					}
				}
			}
			
			System.out.printf("%d s %d b",strike,ball);
			System.out.println();
			
			if(strike ==3) {
				break;
			}
			
		}


	}
}
