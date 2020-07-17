package ex04_String;

import java.util.Scanner;

/*
 * # �ܾ� ��ü�ϱ�(replace)
 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
 * 2. ��ü���ִ� ����� �����Ѵ�.
 * ��)
 * 		Life is too short.
 * 		�����ϰ� ���� �ܾ��Է� : Life
 * 		�ٲ� �ܾ��Է� : Time
 * 
 * 		Time is too short.
 */

public class Repeat_Ex_string13_change_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		String ctext = "";
		
		while(true) {
			
			System.out.println(ctext);
			
			System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
			String word = scan.nextLine();
			System.out.println();
			// 1. �켱 �ܾ� �˻� ����!
			char[] temp = new char[text.length()];
			
			for(int i=0; i<text.length();i++) {
				temp[i] = text.charAt(i);
			}
			
			int size = word.length();
			int check = -1;
			
			int start = 0;
			// �ش� �ܾ �����ϴ� �ε��� ��ȣ�� ������ ����. 
			
			for(int i=0; i<temp.length - size+1;i++) {
				int cnt = 0;
				for(int j=0; j<size;j++) {
					if(temp[i+j] == word.charAt(j)) {
						cnt+=1;
					}
				}
				if(cnt ==size) {
					check = 1;
					start = i;
				}
			}
			
			if(check == -1) {
				System.out.printf("%s(��)�� �������� �ʽ��ϴ�.");
				continue;
			}
			
			
			System.out.println("�ٲ� �ܾ� �Է�:");
			String cword = scan.next();
			// start ~ start + size -> �̰��� word�� ��������, ��ġ.
			int csize = cword.length();
			
			int ss = start+size;
			
			char[] ctemp = new char[text.length() - size + csize];
			
			for(int i=0; i<start;i++) {
				ctemp[i] = temp[i];
			}
			for(int i = csize;i<ctemp.length;i++) {
				ctemp[i] = temp[start+size];
				ss +=1;
			}
			
			
			for(int i= start; i<csize; i++) {
				ctemp[i] = cword.charAt(i);
			}
			
			for(int i=0; i<ctemp.length;i++) {
				ctext +=ctemp[i];
			}
			
		
		}
			
		
		


	}
}
