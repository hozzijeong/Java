package ex01;
/*
 * # �α���[1�ܰ�]
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */


/*
 * # �α���[2�ܰ�]
 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

/*
 * # ������ ����[1�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */


import java.util.Scanner;

public class Repeat_Ex05_login_land1_gugudan {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("ID:");
		int myId = scan.nextInt();
		System.out.println("Pw:");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("�α��� ����");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("�α��� ����");
		}
		
		
		System.out.println("ȸ������ ID:");
		dbId = scan.nextInt();
		System.out.println("ȸ������ Pw:");
		dbPw = scan.nextInt();
		
		System.out.println("ID:");
		myId = scan.nextInt();
		System.out.println("Pw:");
		myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("�α��� ����");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("�α��� ����");
		}
		
		System.out.println("���� 2�� �Է�:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1+"x"+num2+"=");
		int answer = scan.nextInt();
		
		if(answer == num1*num2) {
			System.out.println("����");
		}
		if(answer != num1*num2) {
			System.out.println("��");
		}
		
		
	}
}
