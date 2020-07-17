package ex03_array_hard;

import java.util.Scanner;
/*
 * # ATM[4�ܰ�] : ��ü ��ɱ���
 * 1. ȸ������
 * . id�� pw�� �Է¹޾� ����
 * . ���� �� �� 1000�� �ο�
 * . id �ߺ�üũ
 * 2. ȸ��Ż��
 * . �α��νÿ��� �̿밡��
 * 3. �α���
 * . id�� pw�� �Է¹޾� �α���
 * . �α׾ƿ� ���¿����� �̿밡��
 * 4. �α׾ƿ�
 * . �α��νÿ��� �̿밡��
 * 5. �Ա�
 * . �α��νÿ��� �̿밡��
 * 6. ��ü
 * . �α��νÿ��� �̿밡��
 * 7. �ܾ���ȸ
 * . �α��νÿ��� �̿밡��
 */


public class Repeat_Ex_array_hard08_ATM_land4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		String menu = "=== �ް�IT ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";
		
		while(true) {
			
			if(log != -1) {
				System.out.println("����"+arId[log]+"�α��� ��...");
			}
			
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("[ȸ������]ID�Է�:");
				int id = scan.nextInt();
				System.out.println("[ȸ������]PW�Է�:");
				int pw = scan.nextInt();
				for(int i=0; i<MAX;i++) {
					if(arId[i] == id ) {
						System.out.println("�̹� ���Ե� ���̵� �Դϴ�");
					}
				}
				arId[count] = id;
				arPw[count] = pw;
				arMoney[count]+=1000;
				System.out.println(arId[count]+"�� ȸ�������� �����մϴ�!");
				
				count+=1;
				
			}
			else if(sel == 2) {
				if(log !=-1) {
					arId[log] = 0;
					arPw[log] = 0;
					arMoney[log] = 0;
					System.out.println(arId[log]+"�� ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
					log = -1;
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�. ");
				}
			}
			else if(sel == 3) {
				if(log==-1) {
					System.out.println("[�α���]ID�Է�:");
					int id = scan.nextInt();
					System.out.println("[�α���]PW�Է�:");
					int pw = scan.nextInt();
					int check = -1;
					for(int i=0; i<MAX;i++) {
						if(arId[i] == id && arPw[i] == pw) {
							check = i;
							log = i;
						}
					}
					if(check == -1) {
						System.out.println("ID �Ǵ� PW�� Ȯ�����ּ���");
					}else {
						System.out.println(arId[log]+"�� ȯ���մϴ�.");
					}
				}else {
					System.out.println(arId[log]+"���� ���� �α��� ���Դϴ�.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 5) {
				if(log!=-1) {
					System.out.println("[�Ա�] �Ա��� �ݾ��� �Է��ϼ���");
					int money = scan.nextInt();
					
					arMoney[log]+=money;
					
					System.out.println(arId[log]+"��,"+money+"�� �Ա� �Ϸ�");
				}else {
					System.out.println("�α��� �� �̿��� �� �ֽ��ϴ�.");
				}
			}
			else if(sel == 6) {
				if(log!=-1) {
					int check = -1;
					System.out.println("[��ü] ��ü�� ���¹�ȣ�� �Է����ּ���");
					int youracc = scan.nextInt();
					for(int i=0; i<MAX;i++) {
						if(youracc == arId[i]) {
							check = i;
						}
					}
					if(check ==-1) {
						System.out.println("���¹�ȣ�� Ȯ�����ּ���");
						continue;
					}
					System.out.println("[��ü] ��ü�� �ݾ��� �Է����ּ���");
					int transfer = scan.nextInt();
					
					if(arMoney[log] - transfer <0) {
						System.out.println(arId[log]+"�� �ܾ��� �����մϴ�.");
					}else {
						arMoney[log] -= transfer;
						arMoney[check] += transfer;
						System.out.println(arId[log]+"��"+arId[check]+"�Կ���"+transfer+"�� ��ü �Ϸ�");
					}
				}
			}
			else if(sel == 7) {
				if(log!=-1) {
					System.out.println(arId[log]+"���� �ܾ���"+arMoney[log]+"�� �Դϴ�.");
				}
			}
			else if(sel == 0) {
				break;
			}
		}
		


	}
}
