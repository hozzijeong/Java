package ex;
/*
 * # �α���[1�ܰ�]
 * 2341~2346
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */


import java.util.Scanner;

public class Day01_Ex07_login {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("ID");
		int meId = scan.nextInt();
		System.out.println("PW:");
		int mePw = scan.nextInt();
		
		if (dbId == meId && dbPw == mePw ) {
			System.out.println("�α��� ����");
		}
		
		if (dbId == meId && dbPw != mePw ) {
			System.out.println("�߸��� ��й�ȣ");
		}
		
		if (dbId != meId) {
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}
		
	}
}
