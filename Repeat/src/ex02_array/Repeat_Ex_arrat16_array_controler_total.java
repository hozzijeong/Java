package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_arrat16_array_controler_total {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[1]�߰�");
			System.out.println("[2]����");
			System.out.println("[3]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(cnt ==5) {
					System.out.println("���̻� ���� �߰��� �� �����ϴ�.");
					continue;
				}
				System.out.print("�߰��� �� �Է� : ");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt+=1;
				
			}
			else if(sel == 2) {
				int delIdx = -1;
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				for(int i=0; i<cnt;i++) {
					if(arr[i] == data) {
						delIdx = i;
					}
				}
				if(delIdx == -1) {
					System.out.println("�����Ϸ��� ���� �������� �ʽ��ϴ�.");
					continue;
				}
				for(int i=delIdx; i<cnt-1;i++) {
					arr[i] = arr[i+1];
				}
				cnt-=1;
				
			}
			else if(sel == 3) {
				if(cnt ==5) {
					System.out.println("���̻� ���� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.print("������ ��ġ �Է� : ");
				int idx = scan.nextInt();
				if(idx>cnt || idx<0) {
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
					continue;
				}
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				for(int i = cnt; i>idx; i--) {
					arr[i] = arr[i-1];
				}
				arr[idx] = data;
				cnt+=1;
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}
		


	}
}
