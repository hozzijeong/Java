package ex;
/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */

import java.util.Scanner;

public class Day14_Ex12_search_word {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.println("�˻��� �ܾ �Է��ϼ���:");
		String word = scan.next();
		int check = -1;
		int idx = 0;
		int cnt = 0;
		for(int i=0; i<word.length();i++) {
			for(int j=idx; j<text.length();j++) {
				if(word.charAt(i) == text.charAt(j)) {
					idx = j;
					cnt+=1;
					if(cnt == word.length()) {
						check = 1;
					}
				}
			}
		}
		
		
		if(check ==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
