package ex03_array_hard;

import java.util.Scanner;

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

public class Repeat_Ex_array_hard10_1_array_adress {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			System.out.println("score = ");
			for(int i=0; i<count;i++) {
				System.out.print(score[i]+" ");
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
				if(count == 0) {
					score = new int[count+1];
				}else {
					int[] temp = score;
					score = new int[count+1];
					for(int i=0; i<count;i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
					
				System.out.println("�߰��� �� �Է�:");
				int data = scan.nextInt();
				
				score[count] = data;
				
				count+=1;
			}
			else if(sel == 2) {
				System.out.println("������ �ε��� �Է�:");
				int idx = scan.nextInt();
				
				if(idx>count-1 || idx<0) {
					System.out.println("�ش� ��ġ�� ���� �������� �ʽ��ϴ�.");
					continue;
				}
				if(count ==1) {
					score = null;
				}else if(count>1) {
					int [] temp = score;
					score = new int[count-1];
					for(int i=idx; i<count-1;i++) {
						score[i] = temp[i+1];
					}
					for(int i=0; i<idx;i++) {
						score[i] = temp[i];
					}
					
					temp = null;
				}
				count-=1;
				
				
			}
			else if(sel == 3) {
				System.out.println("������ �� �Է�:");
				int data = scan.nextInt();
				int delIdx = -1;
				for(int i=0;i<count;i++) {
					if(data == score[i]) {
						delIdx = i;
					}
				}
				if(delIdx ==-1) {
					System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
					continue;
				}
				if(count ==1) {
					score = null;
				}else if(count>1){
					int[] temp = score;
					score = new int[count-1];
					
					for(int i=delIdx; i<count-1;i++) {
						score[i] = temp[i+1];
					}
					for(int i=0; i<delIdx;i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
				count-=1;
				
				
				
			}
			else if(sel == 4) {
				System.out.println("�ε����� �Է��ϼ���:");
				int idx = scan.nextInt();
				if(idx>count || idx<0) {
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
					continue;	
				}
				System.out.println("�� �Է�:");
				int data = scan.nextInt();
				if(count ==0) {
					score = new int[count+1];
				}else if (count>1) {
					int[] temp = score;
					score = new int[count+1];
					
					for(int i=0; i<count;i++) {
						score[i] = temp[i];
					}	
					
					for(int i=count; i>idx;i--) {
						score[i] = score[i-1];
					}
					temp = null;
				}
				score[idx] = data;
				count+=1;
			}
			else if(sel == 0) {
				break;
			}
		}




	}
}
