package ex01;
/*
 * # ��� ���� ���߱� ����
 * 1. 150~250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 * ��)
 * 		249		: 4
 */

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex18_guess_midnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rnum = ran.nextInt(101)+150;
		System.out.println("���� = " + rnum);
		
		System.out.println("���� �Է�:");
		int answer = scan.nextInt();
		
		int realanswer = (rnum%100)/10;
		if(answer == realanswer) {
			System.out.println("����" + rnum +" "+ realanswer);
		}else {
			System.out.println("����" + rnum+" " + realanswer);
		}
	}
}
