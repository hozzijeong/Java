package ex;

import java.util.Scanner;

/*
 * # ���θ� [��ٱ���]
 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
 * 	1) ���
 *  2) �ٳ���
 *  3) ����
 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
 * ��)
 * {
 * 		{0, 1},				qwerȸ�� 			> �������
 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
 * 		{2, 1},				abcdȸ��			> �������
 * 		{0, 3},				qwerȸ��			> ���ⱸ��
 * 		...
 * }
 * ������ �ٽ� �غ�
 * 
 */

public class Day11_Ex02_shoppingmall_basket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("ID �Է�:");
				String id = scan.next();
				System.out.println("PW �Է�:");
				String pw = scan.next();
				for(int i=0; i<ids.length;i++) {
					if(id.equals(ids[i])&& pw.equals(pws[i])) {
						System.out.println("["+ids[i]+"]�� ȯ���մϴ�.");
						log = i;
					}
				}
				if(log==-1) {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("["+ids[log]+"]�� �α׾ƿ� �Ǿ����ϴ�. ");
					log = -1;
				}else {
					System.out.println("�α��� �� �̿� �����մϴ�. ");
				}
			}
			else if(sel == 3) {
				
				
				while(true) {
					System.out.println("[��ǰ ���]");
					for(int i=0; i<items.length;i++) {
						System.out.println((i+1)+")"+items[i]);
					}
					System.out.println("[4]�ڷΰ���");
					
					System.out.println("��ȣ ����:");
					int choice = scan.nextInt();
					if(choice ==4) {
						break;
					}
				
					jang[count][0] = log;
					jang[count][1] = choice;
					
					count+=1;
				}
			}
			else if(sel == 4) {
				int apple = 0;
				int banana = 0;
				int berry = 0;
				for(int i=0; i<count;i++) {
					if(jang[i][0] == log) {
						if(jang[i][1] ==1) {
							apple+=1;
						}else if(jang[i][1] ==2) {
							banana+=1;
						}else if(jang[i][1] ==3) {
							berry+=1;
						}
					}
				}
				
				System.out.println(items[0]+":"+apple+"��");
				System.out.println(items[1]+":"+banana+"��");
				System.out.println(items[2]+":"+berry+"��");
				
			}
			
			
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}


	}
}
