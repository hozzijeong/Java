package ex06_class;

import java.util.Random;
import java.util.Scanner;

class Ex02{
	int[] hakbuns = {1001,1002,1003,1004,1005};
	int [] scores = new int [5];
	
}
public class Repeat_Ex02_studentmanage02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		Ex02 e = new Ex02();
		
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length;i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i]+ " ");
		}
		System.out.println();
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int total = 0;
		for(int i=0; i<e.scores.length;i++) {
			total += e.scores[i];
		}
		double avg = total/ e.scores.length;
		
		System.out.println(total +"/"+ avg );
		
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		
		int cnt = 0;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] >= 60) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1	���� : 11��
		System.out.println("�ε��� �Է�");
		int idx = scan.nextInt();
		
		System.out.println(e.scores[idx]);
		
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11		�ε��� : 1
		System.out.println("���� �Է�:");	
		int score = scan.nextInt();
		
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] == score) {
				idx = i;
			}
		}
		System.out.println(idx);
		
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003	���� : 45��
		
		System.out.println("�й� �Է�:");
		int hak = scan.nextInt();
		
		for(int i=0; i<e.scores.length;i++) {
			if(e.hakbuns[i] == hak) {
				idx = i;
			}
		}
		System.out.println(e.scores[idx]);
		
		// ����7) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й� �Է�:");
		hak = scan.nextInt();
		idx = -1;
		for(int i=0; i<e.scores.length;i++) {
			if(e.hakbuns[i] == hak) {
				idx = i;
			}
		}
		if(idx ==-1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(e.scores[idx]);
			
		}
		
		
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		
		int max = 0;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] > max) {
				max = e.scores[i];
				idx = i;
			}
		}
		System.out.printf("%d��(%d��)",e.hakbuns[idx],max);
		System.out.println();


	}
}
