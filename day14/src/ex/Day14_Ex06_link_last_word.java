package ex;
/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 * 
 * ������...�غ���...
 */

import java.util.Scanner;

public class Day14_Ex06_link_last_word {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = "������";
		while(true) {
			int size = start.length();
			System.out.println("���þ� : " + start);
			
			System.out.print("�Է�:");
			String word = scan.next();
			
			if(word.substring(0, 1).equals(start.substring(size-1)) ) {
				start = word;
			}else {
				break;
			}
		}
		
		
		
	}
}
