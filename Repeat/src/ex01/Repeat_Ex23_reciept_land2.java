package ex01;

import java.util.Scanner;

/*
 * # ������ ���[2�ܰ�]
 * 1. 5�� �ֹ��� �޴´�.
 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
 * 
 * ��)
 * �޴� ���� : 1
 * �޴� ���� : 1
 * �޴� ���� : 2
 * �޴� ���� : 2
 * �޴� ���� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� : 32000
 * === �Ե����� ������ ===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��         �� : 1��
 * 4. ��   ��   �� : 31300��
 * 5. ��         �� : 700��
 */


public class Repeat_Ex23_reciept_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		int i = 0;
		int total = 0;
		int bul = 0;
		int shi = 0;
		int coke = 0;
		while(i<5)	{
			System.out.println("�޴� ����");
			int menu = scan.nextInt();
			if(menu == 1) {
				bul+=1;
				total+=price1;
			}else if(menu ==2) {
				shi +=1;
				total +=price2;
			}else if(menu ==3) {
				coke +=1;
				total +=price3;
			}			
			i+=1;
		}
		System.out.println("�� �ݾ�:"+total);
		System.out.println("���� �Է�:");
		int cash = scan.nextInt();
		if(cash >=total ) {
			System.out.println("===�Ե����� ������===");
			System.out.println("1. �Ұ�� ����:" +bul+"��");
			System.out.println("2. ���� ����:" +shi+"��");
			System.out.println("3. �ݶ�:" +coke+"��");
			System.out.println("�� �ݾ�" +total);
			System.out.println("�ܵ�" +(cash - total));
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
}
