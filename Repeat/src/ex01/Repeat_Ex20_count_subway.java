package ex01;

import java.util.Scanner;

/*
 * # ����ö ��� ���
 * 1. �̿��� ������ ���� �Է¹޴´�.
 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
 * 3. ���ǥ
 * 1) 1~5	: 500��
 * 2) 6~10	: 600��
 * 3) 11,12 : 650��
 * 4) 13,14 : 700��
 * 5) 15,16 : 750��
 * ... 
 */


public class Repeat_Ex20_count_subway {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̿��� ������ �� �Է�:");
		int station = scan.nextInt();
		
		int charge = 0;
		if(station>0 && station<=5) {
			charge =500;
		
		}
		else if(station>5 && station<=10) {
			charge=600;
		}
		else {
			if(station%2 ==1) {
				charge = (station - 10)/2 *50;
				charge +=650;
			}else {
				charge = (station -10)/2 *50;
				charge +=600;
			}
		}
		System.out.println("�����"+charge+"���Դϴ�.");
	}
}
