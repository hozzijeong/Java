package ex01;
/*
 * # �α���[3�ܰ�]
 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
 */

import java.util.Scanner;

public class Repeat_Ex08_login_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  dbId =1234;
		int dbPw = 1111;
		System.out.println("ID �Է�:");
		int myId = scan.nextInt();
		
		
		if(myId == dbId) {
			System.out.println("Pw�Է�");
			int myPw = scan.nextInt();
			if(myPw == dbPw) {
				System.out.println("�α��� ����");
			}
			if(myPw != dbPw) {
				System.out.println("��й�ȣ�� Ȯ�����ּ���");
			}
			
		}
		if(myId != dbId) {
			System.out.println("ID�� Ȯ�����ּ���");
		}
	
	
	
	}

}
