package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_array03_manage_student_grage_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ε���            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1	���� : 11��
		System.out.println("�ε��� �Է�:");
		int idx = scan.nextInt();
		System.out.println("����:" +arr[idx]);
		
		System.out.println("==========");
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		System.out.println("���� �Է�:");
		int score = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(score ==arr[i]) {
				System.out.println("�ε���:" + i);
			}
		}
		
		System.out.println("==========");
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003	���� : 45��
		
		System.out.println("�й� �Է�:");
		int num1 = scan.nextInt();
		
		int check = -1;
		for(int i=0; i<5;i++) {
			if(num1 == hakbuns[i]) {
				check = i;
			}
		}
		if(check ==-1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("����:" + scores[check]);			
		}
		System.out.println("==========");
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.


		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		int max = 0;
		int maxnum =0;
		for(int i=0; i<5; i++) {
			if(scores[i]>maxnum) {
				maxnum = scores[i];
				max = hakbuns[i];
			}
		}
		System.out.printf("%d��(%d��)",max,maxnum);

	}
}
