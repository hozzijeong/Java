package ex;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1206~1230(24��)
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 * 3. �Ա�
 * . �α��� �� �̿밡��
 * 4. ���
 * . �α��� �� �̿밡��
 * 5. ��ü
 * . �α��� �� �̿밡��
 * 6. ��ȸ
 * . �α��� �� �̿밡��
 * 7. ����
 */


public class Day03_Ex03_ATM_total {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log == -1) {
					System.out.println("���¹�ȣ �Է�:");
					int myAcc = scan.nextInt();
					
					System.out.println("��й�ȣ �Է�:");
					int myPw = scan.nextInt();
					
					if(myAcc == dbAcc1 && myPw == dbPw1) {
						System.out.println("Acc1 �α��� �Ϸ�");
						log = 1;
					}else if(myAcc == dbAcc2 && myPw == dbPw2) {
						System.out.println("Acc2 �α��� �Ϸ�");
						log = 2;
					}else {
						System.out.println("���¿� ��й�ȣ�� Ȯ�����ּ���");
					}
				}
				else {
					if(log ==1) {
						System.out.println("Acc1�α�����...");
					}else if (log ==2) {
						System.out.println("Acc2�α�����...");
					}
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�!");
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 3) {
				if (log == 1) {
					System.out.println("Acc1�� �Ա��� �ݾ� �Է�:");
					int money = scan.nextInt();
					dbMoney1 = dbMoney1 + money;
					System.out.println("Acc1 �Ա� �Ϸ�");
				}else if(log == 2) {
					System.out.println("Acc2�� �Ա��� �ݾ� �Է�:");
					int money = scan.nextInt();
					dbMoney2 = dbMoney2 + money;
					System.out.println("Acc2 �Ա� �Ϸ�");
					
				}else {
					System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
				}
			}
			else if(sel == 4) {
				if (log == 1) {
					System.out.println("Acc1�� ����� �ݾ� �Է�:");
					int money = scan.nextInt();
					if(dbMoney1 - money >=0) {
						dbMoney1 = dbMoney1 - money;
						System.out.println("Acc1 ��� �Ϸ�");
					}else {
						System.out.println("Acc1 �ܾ��� �����մϴ�.");
					}
				}else if(log == 2) {
					System.out.println("Acc2�� ����� �ݾ� �Է�:");
					int money = scan.nextInt();
					if(dbMoney2-money >=0) {
						dbMoney2 = dbMoney2 - money;
						System.out.println("Acc2 ��� �Ϸ�");
					}else {
						System.out.println("Acc2 �ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
				}

			}
			else if(sel == 5) {
				if(log == 1) {
					System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���:");
					int yourAcc = scan.nextInt();
					if(yourAcc == dbAcc2) {
						System.out.println("��ü�� �ݾ��� �Է��ϼ���:");
						int money = scan.nextInt();
						
						if (dbMoney1 - money >=0) {
							dbMoney1 = dbMoney1-money;
							dbMoney2 = dbMoney2+money;
							System.out.println("Acc2�� ��ü �Ϸ�!");
						}else {
							System.out.println("���� �ܾ� ����");
						}
					}else {
						System.out.println("���¹�ȣ�� Ȯ�����ּ���");
					}
				}else if (log == 2) {
					System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���:");
					int yourAcc = scan.nextInt();
					if(yourAcc == dbAcc1) {
						System.out.println("��ü�� �ݾ��� �Է��ϼ���:");
						int money = scan.nextInt();
						if (dbMoney2 - money >=0) {
							dbMoney2 = dbMoney2-money;
							dbMoney1 = dbMoney1+money;
							System.out.println("Acc1�� ��ü �Ϸ�!");
						}else {
							System.out.println("���� �ܾ� ����");
						}
					}else {
						System.out.println("���¹�ȣ�� Ȯ�����ּ���");
					}	
				}
			}
			else if(sel == 6) {
				if (log == 1) {
					System.out.printf("Acc1�� �ܾ�:%d\n",dbMoney1);
				}else if(log==2) {
					System.out.printf("Acc2�� �ܾ�:%d\n",dbMoney2);	
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}


	}
}
