package ex;

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
public class Day14_Ex07_String_parctice {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for (int i=0; i<50; i++) {
			int r = ran.nextInt(4);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		for(int i=0; i<words.length;i++) {
			System.out.println("����:"+words[i]	);
			System.out.print("�Է�:");
			String word = scan.next();
			
			if(!word.equals(words[i])) {
				i--;
			}
		}

	}
}
