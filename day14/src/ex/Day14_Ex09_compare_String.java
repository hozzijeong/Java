package ex;

import java.util.Scanner;

/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */

public class Day14_Ex09_compare_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		System.out.println("���� �̸��� �Է��ϼ���:");
		String myName = scan.next();
		
		int size = name.length();
		int j=0;
		int check = -1;
		
		for(int i=0; i<size;i++) {
			if(name.charAt(i) == myName.charAt(j)) {
				j+=1;
				if(j == size-1) {
					check = 1;
				}
			}
		}
		
		if(check ==-1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
	}
}
