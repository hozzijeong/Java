package ex04_String;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ÿ�ڿ��� ����[2�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
 * ��)
 * ���� : mys*l
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : *sp
 * �Է� : jsp
 * 
 *  --> �ݺ����� ������ ������ ���ڰ� �������� ���� *�θ� ǥ���� �ָ� ��
 *  	--> ���ڿ��� ���, �� ������ �ִٴ� ���� ����� ��!
 *
 * ...
 */
public class Repeat_Ex_string09_practice_keyboard_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		final int size = words.length;
		for(int i=0; i<50; i++) {
			int r = ran.nextInt(size);
			
			String temp = words[0];
			words[0] = words[r]	;
			words[r] = temp;
		}
		int cnt = 0;
		while(cnt<size) {
		
			int wsize = words[cnt].length();
			int r = ran.nextInt(wsize);
			System.out.print("����:");
			for(int i=0; i<wsize;i++) {
				if(i ==r) {
					System.out.print("*");
				}else {
					System.out.print(words[cnt].charAt(i));
				}
			}
			System.out.println();
			System.out.print("�Է�:");
			String word = scan.next();
			
			if(word.equals(words[cnt])) {
				cnt+=1;
			}
		
		}


	}
}
