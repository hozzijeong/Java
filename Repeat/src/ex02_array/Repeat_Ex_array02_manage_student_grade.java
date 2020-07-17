package ex02_array;

import java.util.Random;

public class Repeat_Ex_array02_manage_student_grade {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];

		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		System.out.println("==========");
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			sum += arr[i];
		}
		double avg = sum/5.0;
		System.out.printf("%d,%.2f",sum,avg);
		System.out.println();
		System.out.println("==========");
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		int cnt = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			if(arr[i] >=60) {
				cnt+=1;
			}
		}
		System.out.println(cnt+"��");

		System.out.println("==========");

	}
}
