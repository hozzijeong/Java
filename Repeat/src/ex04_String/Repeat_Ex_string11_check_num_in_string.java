package ex04_String;
/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 */

import java.util.Scanner;

public class Repeat_Ex_string11_check_num_in_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�:");
		String text = scan.next();
		
		int size = text.length();
		
		char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		
		int cnt = 0;
		for(int i=0; i<size; i++) {
			for(int j=0; j<num.length;j++) {
				if(text.charAt(i) == num[j]) {
					cnt+=1;
				}
			}
		}
		
		if(cnt ==0) {
			System.out.println("���ڸ� �ִ�");
		}else if(cnt == size) {
			System.out.println("���ڸ� �ִ�");
		}else {
			System.out.println("���ڿ� ���ڰ� �����ִ�.");
		}
	}
}
