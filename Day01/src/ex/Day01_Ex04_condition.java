package ex;
/*
 * ���ǹ�!!
 * if,switch-case
 * ���ǹ� if 
 * if(���ǽ�){
 * 	���ǽ��� True�� �� ������ ����;
 * }
 */
public class Day01_Ex04_condition {
	public static void main(String[] args) {
	if (true) {
		System.out.println("���� o");
	}
	if (false) {
		System.out.println("���� x");
	}
	// ���� 1) ���, 0, ���� ���
	int num1 = -10;
	if (num1 > 0) {
		System.out.println("���");
	}
	if (num1 == 0) {
		System.out.println("0");
	}
	
	if (num1 < 0) {
		System.out.println("����");
	}
	
	// ���� 2) 4�� ��� ���
	int num2 = 12;
	if (num2 %4 ==0) {
		System.out.println("4�� ���");
	}
	if (num2 %4 !=0) {
		System.out.println("4�� ����� �ƴ�");
	}
	
	// ���� 3) �հ�, ���հ� ���
	int score = 87;
	if (score >= 90) {
		System.out.println("�հ�");
	}
	if (score < 90) {
		System.out.println("���հ�");
	}
	
	
	

	}
}
