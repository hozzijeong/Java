package ex;

/*
 * # �ݺ��� ����(-100)
 * 2200~2203
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */


import java.util.Scanner;

public class Day02_Ex08_closeloop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i == 1) {
			System.out.println("�����Է�(-100�� ����)");
			int input = scan.nextInt();
			if (input == -100) {
				i = input;
				System.out.println("�����մϴ�");
			}
		}
	}
}
