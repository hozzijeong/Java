package ex;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1156~1205(9��)
 * 1. �Ա�
 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
 * 2. ���
 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3. ��ü
 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
 * . ��ü �� yourMoney �ܾ� ����
 * 4. ��ȸ
 * . myMoney�� yourMoney �ܾ� ��� ���
 */


public class Day03_Ex02_ATM2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("�Ա��� �ݾ� �Է�:");
				int income = scan.nextInt();
				myMoney = myMoney+income;
			}
			else if(sel == 2) {
				System.out.println("����� �ݾ� �Է�:");
				int outcome = scan.nextInt();
				
				myMoney = myMoney-outcome;
				if(myMoney<0) {
					System.out.println("�ܾ��� �����մϴ�...");
					myMoney = myMoney+outcome;
				}
			}
			else if(sel == 3) {
				System.out.println("���¹�ȣ �Է�:");
				int Acc = scan.nextInt();
				
				if (Acc == yourAcc) {
					System.out.println("��ü �ݾ� �Է�:");
					int income = scan.nextInt();
					
					if(myMoney-income>=0) {
					myMoney = myMoney-income;
					yourMoney = yourMoney+income;
					}else {
						System.out.println("�� ���忡 �ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
				}
			}
			else if(sel == 4) {
				System.out.printf("�� ���� �ܾ��� %d���Դϴ�.\n",myMoney);
				System.out.printf("�� ���� �ܾ��� %d���Դϴ�.\n",yourMoney);
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}


	}
}
