package ex01;
/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex13_odd_even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int r = ran.nextInt(100)+1;
		
		
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");
		
		System.out.println("��ȣ�� �����ϼ���:");
		int choice = scan.nextInt();
		
		if(choice ==1) {
			if(r%2==0) {
				System.out.println("��");
			}
			if(r%2 ==1) {
				System.out.println("����");
			}
		}
		if(choice==2) {
			if(r%2==0) {
				System.out.println("����");
			}
			if(r%2==1) {
				System.out.println("��");
			}
		}
	}
}
