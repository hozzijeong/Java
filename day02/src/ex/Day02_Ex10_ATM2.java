package ex;
/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 *
 *
 */

import java.util.Scanner;

public class Day02_Ex10_ATM2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("ID:");
				int usId = scan.nextInt();
				if (usId == dbAcc1 || usId == dbAcc2) {
					System.out.println("Pw:");
					int usPw = scan.nextInt();
					if(usId == dbAcc1 && usPw == dbPw1) {
						System.out.println("Acc1�α��� ����");
					}else if (usId == dbAcc2 && usPw == dbPw2) {
						System.out.println("Acc2�α��� ����");
					}else {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. ");
					}
				}
				else {
					System.out.println("�߸��� ID.");
				}
			}
			else if(sel == 2) {
				
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}

		}
	}
}
