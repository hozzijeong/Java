package ex;
/*
 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
 * 1. �߰�
 * . ���� �Է¹޾� ���������� �߰�
 * 2. ����(�ε���)
 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
 * 3. ����(��)
 * . ���� �Է¹޾� ����
 * . ���� �� �Է� �� ����ó��
 * 4. ����
 * . �ε����� ���� �Է¹޾� ����
 */

import java.util.Scanner;

public class Day09_Ex04_array_memory_structure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		int num = 0;
		
		while(true) {
			
			for(int i=0; i<count;i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰�");
			System.out.println("[2]����(�ε���)");
			System.out.println("[3]����(��)");
			System.out.println("[4]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count ==0) {
				
					System.out.println("�߰��� �� �Է�:");
					int data = scan.nextInt();
					
					score = new int[count+1];
					score[count] = data;
					count+=1;

				}else if(count>0) {
					int[] temp = score;
					
					System.out.println("�߰��� �� �Է�:");
					int data = scan.nextInt();
					
					score = new int[count+1];
					score[count] = data;
					
					for(int i=0; i<count;i++) {
						score[i] = temp[i];
					}
					temp  = null;
					count+=1;

				}
				
			}
			else if(sel == 2) {
				if(count ==1) {
					score = null;
				}
				else if(count > 1) {
						int [] temp = score;
						System.out.println("������ �ε��� �Է�:");
						int idx = scan.nextInt();
						
						if(idx<count && idx >=0) {
							score = new int [count-1];
							
							for(int i=0; i<count-1; i++) {
								if(i<idx) {
									score[i] = temp[i];
								}else if(i>=idx && i<count-1) {
									score[i] = temp[i+1];
								}
							}
							temp = null;
							count-=1;
					}else {
						System.out.println("�ش� �ε������� ���� �������� �ʽ��ϴ�. ");
					}
					
				}else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}
			else if(sel == 3) {
				if(count>0) {
					int[] temp = score;
					int check = -1;
					System.out.println("������ �� �Է�:");
					int data = scan.nextInt();
					
					for(int i=0; i<count;i++) {
						if(data == score[i]) {
							check = i;
						}
					}
					if(check ==-1) {
						System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
						continue;
					}
					if(count ==1) {
						score = null;
					}else if(count >1){
						for(int i = check; i<count-1; i++) {
							score[i] = score[i+1];
						}
						score = new int[count-1];
						for(int i=0; i<count-1;i++) {
							score[i] = temp[i];
						}
						temp = null;
						count-=1;
					}			
				}else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}
			else if(sel == 4) {
				int[] temp = score;
				System.out.println("������ ��ġ �Է�:");
				int idx = scan.nextInt();
				
				if(idx>count || idx<0) {
					System.out.println("�ش� ��ġ���� ���� ���� �� �����ϴ�.");
					continue;
				}
				System.out.println("������ �� �Է�:");
				int data = scan.nextInt();
				if(count ==0) {
					score = new int[count+1];
				}
				else if (count>0) {
					score = new int[count+1];
					
					for(int i= count; i>idx; i--) {
							score[i] = temp[i-1];
					}
					for(int i = 0; i<idx; i++) {
						score[i] = temp[i];
					}
					
					score[idx] = data;
					temp = null;
					count +=1;
				}
			}
			else if(sel == 0) {
				break;
			}
		}


	}
	
}
