package ex;

import java.util.Scanner;

/*
 * # �α���[2�ܰ�]
 * 2348~ 2352(4��)
 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */


public class Day01_Ex08_login2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		System.out.println("===========ȸ������===========");		
		System.out.println("ID:");
		int myId = scan.nextInt();
		System.out.println("PW:");
		int myPw = scan.nextInt();
		dbId = myId;
		dbPw = myPw;
		System.out.println("===========�α���===========");
		System.out.println("ID:");
		int logId = scan.nextInt();
		System.out.println("PW");
		int logPw = scan.nextInt();
		if(dbId == logId && dbPw == logPw) {
			System.out.println("�α��� ����");
		}
		if(dbId != logId || dbPw != logPw) {
			System.out.println("�α��� ����");
		}
	}
}
