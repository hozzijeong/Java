package ex;

import java.util.Random;

public class Day04_Ex04_array_manage_student_grade {
	public static void main(String[] args) {
		Random ran = new Random();
	// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
	// ��   1) 87, 11, 92, 14, 47
		int arr[] = {0,0,0,0,0};
		for(int i = 0; i<5;i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		System.out.println("===================");
	
	// ����2) �������� ������ ��� ���
	// ��   2) ����(251) ���(50.2)
		int sum = 0; 
		double avg = 0;
		for (int i = 0; i<5;i++) {
			sum +=arr[i];
		}
		avg = sum/5.0;
		System.out.println("����: "+sum+"���: "+(avg));
		System.out.println("===================");

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
	// ��   3) 2��
		int stu = 0;
		for(int i = 0; i<5;i++) {
			if(arr[i]>=60) {
				stu +=1;
			}
		}
		System.out.println("�հݻ�: "+stu);
		
		
	}
}
