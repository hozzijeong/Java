package ex;
/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 *    
 *    ������ �غ���....
 *    
 */

import java.util.Scanner;

public class Day14_Ex10_check_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String text = scan.next();
		int count = 0;
		char[] charNum = {'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0; i<charNum.length;i++) {
			for(int j=0; j<text.length();j++) {
				if(charNum[i] == text.charAt(j)) {
					count+=1;
				}
			}
		}
		
		if(count == text.length()) {
			System.out.println("���ڸ� �ִ�");
		}else if(count ==0) {
			System.out.println("���ڸ� �ִ�.");
		}else {
			System.out.println("���ڿ� ���ڰ� �����ִ�.");
			
		}
		
	}
}
