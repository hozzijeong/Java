package ex01;

import java.util.Scanner;

public class Repeat_Ex17_ATM_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cash = 20000;
		int balance = 30000;
		int account = 1111;
		int password = 1234;
		
		System.out.println("==MEGA ATM==");
		System.out.println("1.�α��� 2.����");
		int sell = scan.nextInt();
		if(sell == 1) {
			System.out.println("���¿� ��й�ȣ �Է�");
			int myAcc = scan.nextInt();
			int myPw = scan.nextInt();
			if(myAcc == account && myPw == password) {
				System.out.println("�α����� ȯ���մϴ�.");
				System.out.println("1.�Ա� 2. ��� 3.��ȸ");
				int sel1 = scan.nextInt();
				if(sel1 ==1	) {
					System.out.println("�Ա��� �ݾ� �Է�:");
					int deposit = scan.nextInt();
					if(cash - deposit>=0) {
					cash -=deposit;
					balance += deposit;
					}else {
						System.out.println("������ �����մϴ�. ");
					}
				}else if(sel1 ==2) {
					System.out.println("����� �ݾ� �Է�:");
					int withdraw = scan.nextInt();
					if(balance - withdraw >=0) {
						cash += withdraw;
						balance -=withdraw;
					}else {
						System.out.println("��� �ݾ��� �����մϴ�.");
					}
				}else if(sel1 ==3) {
					System.out.println("��ȸ: "+balance+"��");
				}
			}else {
				System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
			}
		}else if(sell ==2) {
			System.out.println("����");
		}
	}
}
