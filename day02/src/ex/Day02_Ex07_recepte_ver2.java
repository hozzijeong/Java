package ex;

import java.util.Scanner;

/*
 * # ������ ���[2�ܰ�]
 * 2146~2159(13��)
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

public class Day02_Ex07_recepte_ver2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		int i = 1;
		int sum = 0;
		int bul = 0;
		int shr = 0;
		int coke = 0;
		while (i <=5) {
			System.out.println("�޴� ����:");
			int menu = scan.nextInt();
			if (menu == 1) {
				sum = sum+price1;
				bul = bul+1;
			}
			if (menu == 2) {
				sum = sum+price2;
				shr = shr+1;
			}
			if (menu == 3) {
				sum = sum+price3;
				coke = coke+1;
			}
			i = i+1;
		}
		System.out.printf("�� �ݾ�:%d\n",sum);
		System.out.println("���� �Է�:");
		int cash = scan.nextInt();
		if(cash >=sum) {			
			
			System.out.println("===�Ե����� ������===");
			System.out.println("1.�Ұ�� ���� : " + bul + "��");
			System.out.println("2.����    ���� : " + shr + "��");
			System.out.println("3.��         �� : " + coke + "��");
			System.out.println("4.��   ��   �� : "+ sum);
			System.out.println("5.��         ��:"+(cash - sum));
		}else {
			System.out.println("���� ����");
		}

	}
}
