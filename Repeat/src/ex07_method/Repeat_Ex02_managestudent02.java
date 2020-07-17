package ex07_method;

import java.util.Random;
import java.util.Scanner;

class Student{
	int hakbun;
	int score;
}
class Ex02{
	Random ran = new Random();
	void test1(int[] x) {
		for(int i=0; i<x.length;i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i] +" ");
		}
		System.out.println();
	};
	
	int test2(int[] x) { 
		int total = 0;
		for(int i=0; i<x.length;i++) {
			total+= x[i];
		}
		
		return total; }
	double test3(int[] x) { 
	
		double avg = test2(x)/x.length;
		
		return avg; }
	int test4(int[] x) {
		int cnt = 0;
		for(int i=0; i<x.length;i++) {
			if(x[i] >=60) {
				cnt+=1;
			}
		}
		return cnt; }
	
	int test5(int[] x, int idx) { 
		
		return x[idx]; }
	
	
	int test6(int[] x, int score) {
		int check = -1;
		for(int i=0; i<x.length;i++) {
			if( score == x[i]) {
				check = i;
			}
		}
		if(check == -1) {
			return 0;
		}else {
			return check;
		}
		
	}
			
	int test7(int[] x, int[] y, int hakbun) { 
		int check = -1;
		for(int i=0; i<x.length;i++) {
			if(hakbun == x[i] ) {
				check = i;
			}
		}
		
		if(check == -1) {
			return 0;
		}
		
		
		return y[check]; }

	Student test8(int[] x, int[] y) { 
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<x.length;i++) {
			if(maxScore < y[i]) {
				maxScore = y[i];
				maxIdx = i;
			}
		}
		
		Student temp = new Student();
		temp.hakbun = x[maxIdx];
		temp.score = y[maxIdx];
		
		return temp; }


}
public class Repeat_Ex02_managestudent02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex02 e = new Ex02();
		
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = new int[5];
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ���� �޼���
		// ��   1) 87, 11, 92, 14, 47
		e.test1(scores);
		
		// ����2) �������� ���� ���� �޼���
		// ��   2) ����(251) ���(50.2)
		int total = e.test2(scores);
		System.out.println( total);
		
		// ����3) �������� ��� ���� �޼���
		// ��   3) ���(50.2)
		double avg = e.test3(scores);
		System.out.println(avg);
		
		// ����4) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���� �޼���
		// ��   4) 2��
		int cnt = e.test4(scores);
		System.out.println( cnt);
		// ����5) �ε����� ���޹޾� ���� ���� �޼���
		// ����5) �ε��� �Է� : 1	���� : 11��
		System.out.println("�ε��� �Է�:");
		int idx = scan.nextInt();
		
		int score = e.test5(scores, idx);
		System.out.println(score);
		
		
		// ����6) ������ ���޹޾� �ε��� ���� �޼���
		//		  ��, ���� ���� �Է� �� ����ó��		
		// ����6) ���� �Է� : 11	�ε��� : 1
		System.out.println("���� �Է�:");
		score = scan.nextInt();
		idx = e.test6(scores, score);
		
		if(idx == 0) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}else {
			System.out.println(idx);
		}
		
		
		// ����7) �й��� ���޹޾� ���� ���� �޼���
		// 		  ��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش� �й��� �������� �ʽ��ϴ�.
		System.out.println("�й� �Է�:");
		int hak = scan.nextInt();
		
		score = e.test7(hakbuns, scores, hak);
		
		if(score ==0) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.printf("%d��(%d��)",hak,score);
		}
		System.out.println();
		
		// ����9) 1���л��� �й��� ������ Ŭ���� Ÿ��(Student Ŭ����)���� ���� �޼���
		// ����9) 1004��(98��)
		
		
		Student temp = e.test8(hakbuns, scores);
		
		System.out.println(temp.hakbun+"("+temp.score+")��");


	}
}
