package ex;
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

import java.util.Scanner;

public class Day02_Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� �Է�:");
		int station = scan.nextInt();
		
		int charge = 0;
		
		if (station >=1 && station <=5) {
			charge = 500;
		}else if (station >=6 && station <=10) {
			charge = 600;
		}else {
			if (station %2 == 1) {
				charge = (station-10)/2*50;
				charge = charge + 650;
			}else {
				charge = (station - 10)/2*50;
				charge = charge + 600; 
			}
		}
		System.out.println("����� "+charge+"�� �Դϴ�.");
	}
}
