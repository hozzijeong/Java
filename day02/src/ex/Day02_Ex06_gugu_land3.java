package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[3�ܰ�]
 * 2139~2144(5��)
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
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
		System.out.printf("����:%d",score);
	}
}
