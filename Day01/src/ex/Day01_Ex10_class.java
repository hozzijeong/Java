package ex;
/*
 * # ���� ��ȿ�� �˻�
 * 0000~0003
 * 1. ������ �Է¹޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�.
 */

import java.util.Scanner;

public class Day01_Ex10_class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("���� �Է�:");
		int score = scan.nextInt();
		if(score >= 60 && score <=100) {
			System.out.println("�հ�");
		}
		if(score < 60 && score >=0) {
			System.out.println("���հ�");
		}
		if(score <0 || score >100) {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
}
