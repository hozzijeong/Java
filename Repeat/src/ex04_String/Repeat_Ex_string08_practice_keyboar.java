package ex04_String;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��)
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : jsp
 */

public class Repeat_Ex_string08_practice_keyboar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i<50; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		for(int i=0; i<words.length;i++) {
			System.out.print("����:");
			System.out.println(words[i]);
			System.out.print("�Է�:");
			String word = scan.next();
			if(!words[i].equals(word)) {
				System.out.println("��");
				i-=1;
			}
		}

	}
}
