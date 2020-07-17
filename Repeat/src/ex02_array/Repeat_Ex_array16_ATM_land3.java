package ex02_array;

import java.util.Scanner;

/*
 * # ATM[3�ܰ�]
 * 1. ����
 * . ���¹�ȣ�� ��й�ȣ�� �Է¹޾� ����
 * . ���¹�ȣ �ߺ��˻�
 * 2. Ż��
 * . ���¹�ȣ�� �Է¹޾� Ż��
 */


public class Repeat_Ex_array16_ATM_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(accs[i] +" ");
			}
			System.out.println();
			for(int i = 0; i<cnt; i++) {
				System.out.print(pws[i]+" ");
			}
			System.out.println();
			System.out.println("1.����"); // �߰�
			System.out.println("2.Ż��"); // ����
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				int check = -1;
				if(cnt ==5) {
					System.out.println("���̻� ���¸� ���� �� �����ϴ�.");
					continue;
				}
				System.out.println("���¹�ȣ �Է�:");
				int myAcc = scan.nextInt();
				for(int i = 0; i<cnt; i++) {
					if(accs[i] == myAcc) {
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("�̹� �����ϴ� ���¹�ȣ �Դϴ�.");
					continue;	
				}
				System.out.println("��й�ȣ �Է�:");
				int myPw = scan.nextInt();
				
				accs[cnt] = myAcc;
				pws[cnt] = myPw;
				cnt+=1;
				
			}
			else if(sel == 2) {
				int check = -1;
				
				System.out.println("���¹�ȣ �Է�:");
				int myAcc = scan.nextInt();
				
				for(int i=0;i<cnt;i++) {
					if(accs[i] == myAcc) {
						check = i;
					}
				}
				if(check == -1) {
					System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
					continue;
				}
				for(int i = check; i<cnt-1; i++) {
					accs[i] = accs[i+1];
					pws[i] = pws[i+1];
				}
				cnt-=1;
			}
			
		}
		


	}
}