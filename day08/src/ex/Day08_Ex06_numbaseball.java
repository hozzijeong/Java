package ex;

import java.awt.Color;
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


public class Day08_Ex06_numbaseball {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] me = new int[3];
		int[] com = {1, 7, 3};
		
		int cnt = 1;

		
		while(true) {
			
			System.out.printf("=====%dȸ��=====",cnt);
			System.out.println();
			
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<3;i++) {
				System.out.println("["+(i+1)+"] 1~9�Է�");
				int num = scan.nextInt();
				int check = 1;
				for(int j = 0; j<i; j++) {
					if(num == me[j]) {
						check = -1;
					}
				}
				if(check == -1) {
					i-=1;
				}else {
						me[i] = num;
				}
			}
		
			System.out.print("me = [ ");
			for(int i=0; i<3; i++) {
				System.out.print(me[i] +" ");
			}
			System.out.println("]");
			
			
			
			for(int i=0; i<3; i++) {
				if(com[i] == me[i]) {
					strike +=1;
				}
				else {
					for(int j=0; j<3; j++) { 
							if(com[i] == me[j]) {
								ball+=1;
							}
					}
				}
			}
			
			System.out.printf("%d ball %d strike",ball,strike);
			System.out.println();
			cnt+=1;
	
			
			
			if(strike ==3) {
				System.out.print("����: ");
				for(int i=0; i<3; i++) {
					System.out.print(com[i] +" ");
				}
				break;
			}
			
			
			
			
		}

		
	}
}
