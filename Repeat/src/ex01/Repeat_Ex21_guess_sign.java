package ex01;
/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 2��
 */

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex21_guess_sign {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int sign = ran.nextInt(4)+1;
		
		if(sign ==1) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1+num2);
		}else if(sign ==2) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1-num2);
			
		}else if(sign ==3) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1*num2);
			
		}else if (sign ==4) {
			System.out.printf("%d ? %d = %d\n",num1,num2,num1/num2);	
		}
		System.out.println("1)+ 2)- 3)x 4) /");
		int answer = scan.nextInt();
		if(answer == sign) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		
	}
}
