package ex01;

import java.util.Scanner;

/*
 * # �ݺ��� ����(-100)
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */


public class Repeat_Ex24_infinite_loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �Է�[EXIT->-100]:");
			int num1 = scan.nextInt();
			if(num1 == -100) {
				break;
			}
		}
		
	}
}
