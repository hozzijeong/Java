package ex;
/*
 * # nextLine()�� next()�� ����
 * 1. nextLine() : ���� �Ѷ��� ��ü�� �Է¹޴´�. 
 * 2. next() : ������ �������� �Ѵܾ �Է¹޴´�.
 */

import java.util.Scanner;

public class Day14_Ex11_nextline_vs_next {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 *  hello java �Է½�,
		 *  nextLine() �޼���� hellojava ��� ��µ�����,
		 *  next()�޼���� hello �� ����Ѵ�.
		 */
		
		
		System.out.println("�̸��Է�:");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println("�̸� �Է�:");
		name = scan.next();
		System.out.println(name);
	}
}
