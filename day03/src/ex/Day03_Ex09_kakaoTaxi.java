package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # īī�� �ý�
 * 1356~1419(23��)
 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
 * 3. �޴��� �Ʒ��� ����.
 * 		1) �ӵ����� : 1~3������ ����
 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
 * 4. �Ÿ� 2ĭ �� 50���� �߰��Ǿ� ��ݵ� ����Ѵ�.
 * ��) 1(50) 2(50) 3(100) 4(100) ...
 */


public class Day03_Ex09_kakaoTaxi {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// ������(destination)
		int desX = ran.nextInt(10)-10;
		int desY = ran.nextInt(10)-10;
		
		// ���� ��ġ
		int x = 0;
		int y = 0;
		
		// ����(direction)
		int dir = 0;
		
		// �ӵ�
		int speed = 0;
		
		// ���
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("��(1) ��(2) ��(3) ��(4)���� ");
				dir = scan.nextInt();
			}
			else if(sel == 2) {
				System.out.println("�ӵ� ����:1~3�ܰ�");
				speed = scan.nextInt();
			}
			else if(sel == 3) {
				fee = fee + speed;
				if (dir == 1) {
					x = x+speed;
				}else if (dir ==2) {
					x = x - speed;
				}else if (dir ==3) {
					y = y - speed;
				}else if (dir == 4) {
					y = y+speed;
				}
			}
			
			if (x == desX && y == desY) {
				System.out.println("�������� �����߽��ϴ�");
				run = false;
				if (fee%2 == 0) {
					fee = (fee/2)*50;
				}else if (fee%2 == 1) {
					fee = (fee/2)*50 +50;
				}
					System.out.println("����� "+fee+"���Դϴ�.");
			}
				
			
		}



	}
}