package ex;
/*
 * # �������
 * 1. break
 * . �ݺ��� 1���� ��� ����
 * 2. continue
 * . �ݺ����� ���ǽ����� �ٷ� �̵�
 * . �Ʒ����� �����Ű�� ���� ���� �� ���
 */

import java.util.Scanner;

public class Day04_Ex01_break_continue {
	public static void main(String[] args) {
		for (int i = 0; i<15; i++) {
			if(i>3) {
				break;
			}
			System.out.println(i);
		}
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");
			
			int sel = scan.nextInt();
			
			if(sel != 1 && sel != 2 && sel != 3) {
				continue;
			}
			System.out.println(";;");
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {}

		}
	}
}

		 
