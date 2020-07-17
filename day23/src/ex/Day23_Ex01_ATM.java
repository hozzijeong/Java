package ex;

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

class Ex11{
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555"};
	String[] arPw  = {"1234", "2345", "3456", "4567", "5678"};
	int[] arMoney  = {87000, 34000, 17500, 98000, 12500};
	
	int count = 5;
	
	// 3333 �α��� ��
	int loginCheck = 2;
}


public class Day23_Ex01_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		while(true) {
			if(e.loginCheck != -1) {
				System.out.println(e.arAcc[e.loginCheck]+"�α��� �� ");
				System.out.println();
			}else {
				for(int i=0; i<e.count; i++) {
					System.out.println(e.arAcc[i]+":"+e.arPw[i] + "->" + e.arMoney[i]);
				}
				System.out.println();
			}
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա��ϱ�");
			System.out.println("[6]��ü�ϱ�");
			System.out.println("[7]�ܾ���ȸ");
			System.out.println("[0]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(e.loginCheck == -1) {
					if(e.count >=5) {
						System.out.println("[�޼���] ���̻� ������ �� �����ϴ�.");
						continue;
					}
					System.out.println("[ȸ������] ���̵� �Է��ϼ���");
					String id = scan.next();
					int  check = -1;
					
					for(int i=0; i<e.arAcc.length;i++) {
						if(id.equals(e.arAcc[i])) {
							check = i;
						}
					}
					if(check != -1) {
						System.out.println("[�޼���] �̹� ���Ե� ���̵��Դϴ�.");
						continue;
					}
					
					System.out.println("[ȸ������] ��й�ȣ�� �Է��ϼ���");
					String pw = scan.next();
					
					e.arAcc[e.count] = id;
					e.arPw[e.count] = pw;
					e.arMoney[e.count] += 1000;
					e.count +=1;
				}else {
					System.out.println("[�޼���] �α׾ƿ� �� �̿����ּ���");
				}
			}
			else if(sel == 2) {
				if(e.loginCheck != -1) {
					
					if(e.count == 1) {
						e.arAcc =  null;
						e.arPw = null;
						e.arMoney = null;
						e.count = -1;
						e.loginCheck = -1;
						continue;
					}
					
					String [] temp_a = e.arAcc;
					String [] temp_p = e.arPw;
					int [] temp_m = e.arMoney;
					e.arAcc = new String [e.count-1];
					e.arPw = new String [e.count-1];
					e.arMoney = new int [e.count-1];
					
					for(int i=0; i<e.arAcc.length;i++) {
						if(i != e.loginCheck) {
							e.arAcc[i] = temp_a[i];
							e.arMoney[i] = temp_m[i];
							e.arPw[i] = temp_p[i];
						}
					}
					
					e.count-=1;
					e.loginCheck = -1;
				}else {
					System.out.println("[�޼���] �α��� �� �̿� �����մϴ�.");
				}
			}
			else if(sel == 3) {
				if(e.loginCheck == -1) {
					System.out.println("[�α���] ���̵� �Է�:");
					String id = scan.next();
					System.out.println("[�α���] ��й�ȣ �Է�:");
					String pw = scan.next();
					
					
					for(int i=0; i<e.count;i++) {
						if(id.equals(e.arAcc[i])&& pw.equals(e.arPw)) {
							e.loginCheck = i;
						}
					}
					if(e.loginCheck == -1) {
						System.out.println("[�޼���] ���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
						continue;
					}
					
					System.out.println("[�޼���]"+e.arAcc[e.loginCheck]+"�� ȯ���մϴ�.");
				}else {
					System.out.println("[�޼���] �α׾ƿ� �� �̿����ּ���");
				}
			}
			else if(sel == 4) {
				if(e.loginCheck != -1) {
					e.loginCheck = -1;
					System.out.println("[�޼���] �α׾ƿ� �Ϸ�");
				}else {
					System.out.println("[�޼���] �α��� �� �̿����ּ���.");
				}
			}
			else if(sel == 5) {
				if(e.loginCheck != -1) {
					System.out.println("[�Ա�] �Ա� �ݾ��� �Է��ϼ���");
					int deposit = scan.nextInt();
					
					e.arMoney[e.loginCheck] += deposit;
					
					System.out.println("[�޼���] �Ա� �Ϸ�");
				}else {
					System.out.println("[�޽���] �α��� �� �̿����ּ���");
				}
			}
			else if(sel == 6) {
				if(e.loginCheck != -1) {
					System.out.println("[��ü] ��ü ���¹�ȣ�� �Է��ϼ���");
					String acc = scan.next();
					int check = -1;
					for(int i=0; i<e.count; i++) {
						if(acc.equals(e.arAcc[i])) {
							check = i;
						}
					}
					if(check ==-1) {
						System.out.println("[�޼���] ��ü ���¹�ȣ�� Ȯ�����ּ���");
						continue;
					}
					
					System.out.println("[��ü] ��ü �ݾ��� �Է��ϼ���.");
					int transfer = scan.nextInt();
					
					System.out.println("[��ü] ��й�ȣ�� �Է��ϼ���.");
					String pw = scan.next();
					
					if(!pw.equals(e.arPw[e.loginCheck])) {
						System.out.println("[�޼���] ��й�ȣ�� Ȯ���ϼ���.");
						continue;
					}
					
					if(e.arMoney[e.loginCheck] - transfer >=0) {
						System.out.println("[�޼���]"+e.arAcc[check]+"�Բ� ��ü �Ϸ�");
					}else {
						System.out.println("[�޼���] ��ü �ݾ� ����");
						continue;
					}
				}
			}
			else if(sel == 7) {
				if(e.loginCheck != -1) {
					System.out.println("[�ܾ���ȸ]"+e.arMoney[e.loginCheck]+"��");
				}else {
					System.out.println("[�޼���] �α��� �� �̿����ּ���");
				}
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}		


	}

}
