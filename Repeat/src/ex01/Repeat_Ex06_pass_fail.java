package ex01;
/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�.
 */

import java.util.Scanner;

public class Repeat_Ex06_pass_fail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int score = scan.nextInt();
		
		if(score>=60 && score<=100) {
			System.out.println("�հ�");
		}
		if(score<60 && score>=0) {
			System.out.println("���հ�");
		}
		if(score>100 || score <0) {
			System.out.println("������ �߸� �Է��ؼ̽��ϴ�.");
		}
	}
}
