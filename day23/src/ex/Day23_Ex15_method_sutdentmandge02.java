package ex;

import java.util.Random;

class Student{
	int hakbun;
	int score;
}

class Ex09{
	
	void test1(int[] x) {
		Random ran = new Random();
		for(int i=0; i<x.length;i++) {
			int r = ran.nextInt(100)+1;
			x[i] = r;
			System.out.print(x[i] +" ");
		}
		System.out.println();
		
	}
	
	int test2() {
		return 0;
	}
	double test3(int [] x) {
		return 0;
	}
	int test4(int[] x) {
		return 0;
	}
	int test5(int[] x,int idx) {
		return 0;
	}
	int test6(int[] x,int score) {
		return 0;
	}
	int test7(int[] x, int[] y, int hakbun) {
		return 0;
	}
	
	Student test08(int[] x, int[]y) {return null;}
}


public class Day23_Ex15_method_sutdentmandge02 {
	public static void main(String[] args) {
		Ex09 e = new Ex09();
		
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = new int [5];
		System.out.println("===============");
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ���� �޼���
		// ��   1) 87, 11, 92, 14, 47
		e.test1(scores);
		
		
		System.out.println("===============");
		// ����2) �������� ���� ���� �޼���
		// ��   2) ����(251) ���(50.2)
//		e.test2(scores);
		
		
		System.out.println("===============");
		// ����3) �������� ��� ���� �޼���
		// ��   3) ���(50.2)
		e.test3(scores);
		
		// ����4) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���� �޼���
		// ��   4) 2��
		e.test4(scores);

		// ����5) �ε����� ���޹޾� ���� ���� �޼���
		// ����5) �ε��� �Է� : 1	���� : 11��
		e.test5(scores, 1);
		
		// ����6) ������ ���޹޾� �ε��� ���� �޼���
		//		  ��, ���� ���� �Է� �� ����ó��		
		// ����6) ���� �Է� : 11	�ε��� : 1
		e.test6(scores, 11);
		
		// ����7) �й��� ���޹޾� ���� ���� �޼���
		// 		  ��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش� �й��� �������� �ʽ��ϴ�.
		e.test7(hakbuns, scores, 1000);
		
		// ����9) 1���л��� �й��� ������ Ŭ���� Ÿ��(Student Ŭ����)���� ���� �޼���
		// ����9) 1004��(98��)
//		e.test8(hakbuns, scores);


		
		
	}
}
