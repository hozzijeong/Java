package ex01;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[2�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */


public class Repeat_Ex14_gugudan_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int r1 = ran.nextInt(7)+2;
		int r2 = ran.nextInt(8)+1;
		
		System.out.println(r1+"X"+r2+"=");
		int my = scan.nextInt();
		
		if(my == r1*r2) {
			System.out.println("����");
		}
		if(my != r1*r2) {
			System.out.println("��");
		}
	}
	

}
