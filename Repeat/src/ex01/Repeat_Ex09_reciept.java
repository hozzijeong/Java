package ex01;
/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
 */

import java.util.Scanner;

public class Repeat_Ex09_reciept {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.println("�޴� �Է�: ");
		int menu = scan.nextInt();
		System.out.println("���� �Է�:");
		int cash = scan.nextInt();
		
		int charge = 0;
		
		if(menu ==1) {
			charge = cash = price1;
		}
		if(menu ==2) {
			charge = cash = price2;
		}
		if(menu ==3) {
			charge = cash = price2;
		}
		
		if(charge>=0) {
			System.out.println("�Ž������� "+charge+"���Դϴ�.");
		}
		if(charge<0) {
			System.out.println("������ �����մϴ�.");
		}
		
	}
}
