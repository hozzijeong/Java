package ex04_String;
/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 * 
 * ���ڿ��� �迭�̴�.
 * �ϳ��ϳ� ���ϸ� �ȴ�.
 */

import java.util.Scanner;

public class Repeat_Ex_string10_compare_String {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		System.out.println("���� �̸��� �Է��ϼ���: ");
		String myname = scan.next();
		int check = -1;
		int cnt = 0;
		if(name.length() == myname.length()) {
			for(int i=0; i<name.length();i++) {
				if(name.charAt(i) == myname.charAt(i)) {
					cnt+=1;
					if(cnt == name.length()) {
						check = 1;
					}
				}
			}
		}
		
		if(check == -1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
	}
}
