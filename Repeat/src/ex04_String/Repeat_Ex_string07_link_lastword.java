package ex04_String;
/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */

import java.util.Scanner;

public class Repeat_Ex_string07_link_lastword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "������";

		while(true) {
			System.out.println("���þ� : " + start);
			System.out.print("�Է�:");
			String word = scan.next();
			
			if(start.charAt(start.length()-1) == word.charAt(0)) {
				start = word;
			}else {
				System.out.println("��!");
				break;
			}
			
			
			
		}
		

	}
}
