package ex01;
/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */

import java.util.Scanner;

public class Repeat_Ex10_get_max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է�:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int max = num1;
		
		if(max <num2 || max<num3) {	
			max = num2;
			if(max<num3) {
				max = num3;
			}
		}
		
		
		
		System.out.println(max);
	}
}
