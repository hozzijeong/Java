package ex;

// ����) �й��� �Է¹޾� ���� ���
// 		��, �����й� �Է� �� ����ó��
// ��)
// �й� �Է� : 1002		���� : 11��
// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
import java.util.Scanner;

public class Day04_Ex06_array_manage_student_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.println("�й� �Է�:");
		int hk = scan.nextInt();
		int check = -1;
		
		for(int i =0; i<5;i++) {
			if(hk == hakbuns[i]) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(scores[check]+"��");
		}



	}
}