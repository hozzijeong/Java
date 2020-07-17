package ex;
/*
 * # ATM[4�ܰ�] : ��ü ��ɱ���
 * 1. ȸ������
 * . id�� pw�� �Է¹޾� ����
 * . ���� �� �� 1000�� �ο�
 * . id �ߺ�üũ
 * 
 * 2. ȸ��Ż��
 * . �α��νÿ��� �̿밡��
 * 
 * 3. �α���
 * . id�� pw�� �Է¹޾� �α���
 * . �α׾ƿ� ���¿����� �̿밡��
 * 
 * 4. �α׾ƿ�
 * . �α��νÿ��� �̿밡��
 * 
 * 5. �Ա�
 * . �α��νÿ��� �̿밡��
 * 6. ��ü
 * . �α��νÿ��� �̿밡��
 * 
 * 7. �ܾ���ȸ
 * . �α��νÿ��� �̿밡��
 */

import java.util.Scanner;

public class Day09_Ex01_ATM_land4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1; // �α׾ƿ� ����. �α����� ��� 1�� ����
		int id = 0;
		
		String menu = "=== �ް�IT ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";
		
		while(true) {
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log==-1) {
					if(count==5) {
						System.out.println("���̻� ���� �� �� �����ϴ�.");
						continue;
					}
					int check = -1;
					System.out.println("[ȸ������] ID�Է�:");
					int myAcc = scan.nextInt();
					
					for(int i=0; i<MAX;i++) {
						if(arId[i] == myAcc) {
							check =1;
						}
					}
					if(check == 1) {
						System.out.println("�̹� �����ϴ� ID�Դϴ�.");
					}else {
						System.out.println("[ȸ������] PW�Է�:");
						int myPw = scan.nextInt();
						arId[count] = myAcc;
						arPw[count] = myPw;
						arMoney[count] = 1000;
						count+=1;
						System.out.println("[ȸ������] �Ϸ�! ȯ���մϴ�. ");
					}
				}else {
					System.out.println("�α׾ƿ� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 2) {
				if(log ==1) {
					int delId = -1;
					
					System.out.println("[ȸ��Ż��] ID�� �Է����ּ���.");
					int myAcc = scan.nextInt();
					
					for(int i=0; i<MAX;i++) {
						if(arId[i] == myAcc) {
							delId = i;
						}
					}
					if(delId == -1) {
						System.out.println("ID�� Ȯ�����ּ���.");
					}else {
						for(int i=delId; i<=count-1;i++) {
							arId[i] = arId[i+1];
							arPw[i] = arPw[i+1];
						}
						count-=1;
						System.out.println("ȸ�� Ż�� �Ϸ�");
						log = -1;
						id = 0;
					}
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 3) {
				if(log ==-1) {
					int check = -1;
					System.out.println("[�α���]ID�� �Է����ּ���.");
					int myAcc = scan.nextInt();
					System.out.println("[�α���]PW�� �Է����ּ���.");
					int myPw = scan.nextInt();
					
					for(int i=0; i<MAX; i++) {
						if(arId[i] == myAcc && arPw[i] == myPw) {
							check = 1;
							id = i+1;
						}
					}
					if(check ==1) {
						System.out.printf("[�α��οϷ�] %d��° ���� ȯ���մϴ�.",id);
						System.out.println();
						log = 1;
					}else {
						System.out.println("ID �Ǵ� PW�� Ȯ�����ּ���");
					}
				}else {
					System.out.println("�α׾ƿ� �� �̿� �����մϴ�. ");
				}
				
			}
			else if(sel == 4) {
				if(log ==1 ) {
					System.out.println("������ �α׾ƿ� �Ͻðڽ��ϱ�?[1]�� [2]�ƴϿ�	");
					int ask = scan.nextInt();
					if(ask ==1) {
						log = -1;
						id = 0;
						System.out.println("�α׾ƿ� �Ϸ�!");
					}else {
						continue;
					}
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 5) {
				if(log ==1) {
					System.out.printf("%d��° ����,�Ա��� �ݾ��� �Է��ϼ���",id);
					System.out.println();
					int deposit = scan.nextInt();
					
					arMoney[id-1] += deposit;
					
					System.out.println("�Ա� �Ϸ�.");
					System.out.println(arMoney[id-1]);
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 6) {
				if(log ==1) {
					int check = -1;
					int acc = 0;
					System.out.println("�Ա��� ���¸� �Է��ϼ���");
					int yourAcc = scan.nextInt();
					for(int i=0; i<MAX; i++) {
						if(yourAcc == arId[i]) {
							check = 1;
							acc = i;
						}
					}
					if(check ==1) {
						System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
						int transfer = scan.nextInt();
						if(arMoney[id-1]-transfer>=0) {
							arMoney[id-1] -=transfer;
							arMoney[acc] += transfer;
							System.out.println("��ü �Ϸ�.");
						}else {
							System.out.println("��ü �ݾ��� �����մϴ�.");
						}
					}else {
						System.out.println("���¸� Ȯ�����ּ���.");
					}
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�. ");
				}
				
			}
			else if(sel == 7) {
				if(log==1) {
					System.out.printf("%d��° ������ �ܾ���: %d",id,arMoney[id-1]);
					System.out.println();
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 0) {
				break;
			}
		}


		
	}
}
