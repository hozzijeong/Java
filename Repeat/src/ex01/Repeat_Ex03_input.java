package ex01;

import java.util.Scanner;

public class Repeat_Ex03_input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.println("���� �Է�:");	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("�� ���� ��:"+(num1+num2));
		
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("���� �Է�:");
		int num3 = scan.nextInt();
		System.out.println(num3%2==1);
		
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("���� �Է�:");
		int score = scan.nextInt();
		System.out.println(score>=60 && score <=100);

	}
}
