package ex;

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
 * ...
 */

public class Day14_Ex08_String_parctice_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};

		
		for(int i=0; i<50;i++) {
			int r = ran.nextInt(4);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i=0;
		while(i<words.length) {
			int size = words[i].length();
			int r = ran.nextInt(size); // �ܾ��� ���� ��ŭ�ȿ����� ������ ���� r ����
			
			System.out.println("����"+"["+(i+1)+"]");
			for(int j=0; j<size;j++) {
				if(j ==r) {
					System.out.print("*");
					// random �� ���ڿ� j �� ���ٸ� �� �ڸ��� *�� ���
				}else {
					System.out.print(words[i].charAt(j));
					// �װ� ���� �ʴٸ� �ٸ� ������ ���� �ε����� �ؼ� �� ���� ���
				}
			}
			System.out.println();
			
			System.out.print("�Է�:"	);
			String word = scan.next();
			
			if(word.equals(words[i])) {
				i+=1;
			}
		}
		
		
		
	}
}
