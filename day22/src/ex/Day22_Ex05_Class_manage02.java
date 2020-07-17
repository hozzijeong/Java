package ex;

import java.util.Random;
import java.util.Scanner;

class Ex04{
	int [] hakbuns = {1001,1002,1003,1004,1005};
	int [] scores = new int [5];
}
public class Day22_Ex05_Class_manage02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		System.out.println("==========");
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length;i++	) {
			int r = ran.nextInt(100)+1;
			e.scores[i] = r;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int sum = 0;
		for(int i=0; i<e.scores.length;i++) {
			sum+= e.scores[i];
		}
		
		float avg = sum/e.scores.length;
		
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		
		
		System.out.println("==========");
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		int cnt = 0;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] >= 60) {
				cnt+=1;
			}
		}
		System.out.println("�հ����: "+cnt);
		
		
		
		System.out.println("==========");
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1	���� : 11��
		System.out.println("[1~5]�ε��� �Է�:");
		int idx = scan.nextInt();
		idx-=1;
		if(idx < 0 || idx > e.scores.length-1) {
			System.out.println("[�޼���] �ش� �ε������� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("����: "+e.scores[idx]);
		}
		
		
		System.out.println("==========");
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11		�ε��� : 1
		System.out.println("���� �Է�:");
		int score = scan.nextInt();
		idx = -1;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] == score) {
				idx = i; 
			}
		}
		
		
		if(idx == -1) {
			System.out.println("[�޼���] �ش� ������ �������� �ʽ��ϴ�.");
		}else {
			idx +=1;
			System.out.println("�ε���:" + idx);
		}
		
		System.out.println("==========");
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003	���� : 45��
		System.out.println("�й� �Է�:");
		int hak = scan.nextInt();
		idx = -1;
		
		for(int i=0; i<e.hakbuns.length;i++	) {
			if(hak == e.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("����: "+ e.scores[idx]);
		}
		
		
		
		System.out.println("==========");
		// ����7) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й� �Է�:");
		hak = scan.nextInt();
		idx = -1;
		
		for(int i=0; i<e.hakbuns.length;i++	) {
			if(hak == e.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("����: "+ e.scores[idx]);
		}
		
		System.out.println("==========");
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		
		int max = 0;
		idx = -1;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] >= max) {
				max = e.scores[i];
				idx = i;
			}
		}
		
		System.out.printf("%d��(%d��)",e.hakbuns[idx],max);
		
		
		

	}
}
