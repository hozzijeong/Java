package ex04_String;

import java.util.Scanner;

/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */

public class Repeat_Ex_string12_search_word {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();

		char[] arr = new char[text.length()];
		
		for(int i=0; i<text.length();i++) {
			arr[i] = text.charAt(i);
		}
		// arr�� text�� �ִ� ��� ���ڵ��� ����
		
		int size = word.length();
		
		int check = -1;
		for(int i=0; i<text.length()-size +1; i++) {
			// text.length - size +1 : text�� ���̿��� word�� ���̸�ŭ �� ������
			// size ��ŭ ���� ���� �� �̻��� ���̱� ����! +1�� �� ���� ���ڰ� �� �¾� ���ǽ��� "<"�̾!
			int count = 0;
			
			for(int j=0; j<size;j++) {
				if(arr[i+j] == word.charAt(j)) {
					// arr[i +j]�� �� ������, i�� ������ ����, j �� size��ŭ �����Ҷ�, size ���� ��ŭ count �� �þ�� �� Ȯ���ϱ� ���ؼ�
					// i�� ó�� ������ ������ ��� ��, j�� �׿� ���� �����ϴ� ���� �ǹ�.
					count+=1;
				}
			}
			if(count == size) {
				check = 1;
			}
		}
		
		
		
		if(check ==1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}
}
