package ex;
/*
 * # ATM[2�ܰ�]
 * 1132~1153(21��)
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 */

import java.util.Scanner;

public class Day03_Ex01_ATM2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		int myAcc;
		int myPw;
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log == -1) {
					System.out.println("ID:");
					myAcc = scan.nextInt();
					
					if (myAcc == dbAcc1) {
						System.out.println("PW:");
						myPw = scan.nextInt();
						if(myPw == dbPw1) {
							System.out.println("Acc1 �α��� �Ϸ�");
							log = 1;
						}else {
							System.out.println("��й�ȣ ����");
						}
					}else if (myAcc == dbAcc2) {
						System.out.println("PW:");
						myPw = scan.nextInt();
						if(myPw == dbPw2) {
							System.out.println("Acc2 �α��� �Ϸ�");
							log = 2;
							}
						else {
							System.out.println("��й�ȣ ����");
						}
					}else {
						System.out.println("ID�� Ȯ�����ּ���.");
					}
				
				}else {
					System.out.println("�α׾ƿ� �� �̿����ּ���.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�. ");
				}else {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
				}
			}
				
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}


	}
}
