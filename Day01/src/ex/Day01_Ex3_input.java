package ex;

import java.util.Scanner;

/*
 * input ��, �Է��Լ� �ޱ�
 * 1) pakage�� class ���� ��, �� �κп� 
 * import java.util.Scanner�� �Է�
 * 2) main�Լ� �ȿ�
 * Scanner ������(a) = new Scanner(System.in);�� �Է�
 * 3) main�Լ� �ȿ��� ����� 
 * �ڷ��� ������ = a.nextInt() => �ڷ����� ������ ���
 * ó�� ����� �� �ִ�.
 * �����ϰ� �ۼ��ϴ� ���� 
 * main �Լ� �ȿ� Scanner + ctrl + spacebar�� �ϸ� 1)���� �ڵ����� �ϼ��ȴ�. 
 */
public class Day01_Ex3_input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int age = scan.nextInt();
		System.out.println("�� ����� ���̴� "+age+"�� �̱���!");
	}
}
