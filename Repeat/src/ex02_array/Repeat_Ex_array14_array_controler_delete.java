package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_array14_array_controler_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				int delIdx = -1;
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
				for(int i=0; i<cnt; i++) {
					if(arr[i] == data) {
						delIdx = i;
					}
				}
				if(delIdx ==-1) {
					System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
					continue;
				}
				for(int i=delIdx; i<cnt-1; i++) {
					arr[i] = arr[i+1];
				}
				cnt-=1;
				
				
			}
			
		}


	}
}
