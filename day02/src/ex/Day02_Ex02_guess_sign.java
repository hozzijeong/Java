package ex;
/*
 * # ������ ��ȣ ���߱� ����
 * 2027~2037(10��)
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

class Day02_Ex02_guess_sign {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int result = 0;
		int calc = ran.nextInt(4)+1;
		
		if (calc == 1) {
			result = num1+num2;
		}else if (calc ==2) {
			result = num1 - num2;
		}else if (calc == 3) {
			result = num1*num2;
		}else {
			result = num1%num2;
		}
		System.out.println(num1+" ? "+num2+"="+result);			
		System.out.println("1) + 2) - 3) x 4) %");
		System.out.println("����:");
		int myAnswer = scan.nextInt();
		if (calc == myAnswer) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}
}
