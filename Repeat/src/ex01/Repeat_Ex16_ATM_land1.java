package ex01;
/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
 * 			myMoney   - ��ü�� �ݾ�
 * 			yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
 */

import java.util.Scanner;

public class Repeat_Ex16_ATM_land1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		System.out.println("���¹�ȣ �Է�:");
		int Acc = scan.nextInt();
		
		if(Acc == myAcc) {
			System.out.println("��ü�� �ݾ� �Է�:");
			int money = scan.nextInt();
			
			if(myMoney >= money) {
				System.out.println("��ü ����");
				myMoney-=money;
				yourMoney += money;
			}else {
				System.out.println("���� ����");
			}
		}
		
	}
}
