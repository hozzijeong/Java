package ex;
/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 * 2. �Ʒ� 3������ ������ ��÷���θ� ����Ѵ�.
 */

import java.util.Scanner;

public class Day04_Ex10_array_imm_lotto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {
			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");
			int cnt = 0; 
			int check = 0;
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			if(sel==1) {
				for( int i = 0; i<7; i++) {
					if(lotto1[i] ==7) {
						cnt +=1;
						if(cnt==3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}
				if(check ==1) {
					System.out.println("��÷");
					
				}else {
					System.out.println("��...");
				}
			}
			if(sel==2) {
				for( int i = 0; i<7; i++) {
					if(lotto2[i] ==7) {
						cnt +=1;
						if(cnt==3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}
				if(check ==1) {
					System.out.println("��÷");
					
				}else {
					System.out.println("��...");
				}
				
			}
			if(sel==3) {
				for( int i = 0; i<7; i++) {
					if(lotto3[i] ==7) {
						cnt +=1;
						if(cnt==3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}
				if(check ==1) {
					System.out.println("��÷");
				
				}else {
					System.out.println("��...");
				}
			}
		}


	}
}

//	boolean run = true;
//	while(run) {
//		
//		System.out.println("[1]������ ���Ȯ��");
//		System.out.println("[2]������ ���Ȯ��");
//		System.out.println("[3]������ ���Ȯ��");
//		int check = -1;
//		System.out.print("�޴� ���� : ");
//		int sel = scan.nextInt();
//		
//		if(sel == 1) {
//			for(int i =0;i<8;i++) {
//				if(lotto1[i]==7 && lotto1[i-1] == lotto1[i] && lotto1[i] == lotto1[i+1]) {
//					check = i;
//				}	
//			}
//			if (check == -1) {
//				System.out.println("��...");
//			}else {
//				System.out.println("��÷");
//			}
//		}
//		else if(sel == 2) {
//			for(int i =0;i<8;i++) {
//				if(1 <= i && i < 7) {
//					if(lotto2[i]==7 && lotto2[i-1] == lotto2[i] && lotto2[i] == lotto2[i+1]) {
//						check = i;
//					}	
//				}
//			}
//			System.out.println("check = " + check);
//			if (check == -1) {
//				System.out.println("��...");
//			}else {
//				System.out.println("��÷");
//			}
//		}
//		else if(sel == 3) {
//			for(int i =0;i<8;i++) {
//				if(lotto3[i]==7 && lotto3[i-1] == lotto3[i] && lotto3[i] == lotto3[i+1]) {
//					check = i;
//				}
//			}
//			if (check == -1) {
//				System.out.println("��...");
//			}else {
//				System.out.println("��÷");
//			}
//			
//		}
//		