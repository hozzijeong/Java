package ex;
/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

public class Day04_Ex09_array_movie_seat_reserve {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int cnt = 0;
		
		for(int i =0;i<7;i++) {
			System.out.print("seat = ");
			for(int j =0; j<7; j++) {
				System.out.print(seat[j] + " ");
			}
			System.out.println(" ");
			
			System.out.println("�¼� ����[1~7]: ");
			int mySeat = scan.nextInt();
			if(seat[mySeat-1] == 0) {
				seat[mySeat-1] = 1;
				cnt +=1;
			}else if(seat[mySeat] == 1) {
				System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
				i -=1;
			}
		}
		System.out.println("�����: "+cnt*12000);
	}
}
//int cnt = 0;
//
//for(int i =0; i<7;i++) {
//	System.out.print("seat = ");
//	for(int j =0; j<7;j++) {
//		System.out.print(seat[j]+" ");
//	}
//	System.out.println();
//	
//	System.out.println("�¼� ����:");
//	int mySeat = scan.nextInt();
//	if(seat[mySeat] == 0) {
//		seat[mySeat] = 1;
//		cnt +=1;
//	}else {
//		System.out.println("�̹� ���Ű� �Ϸ�� �ڸ� �Դϴ�.");
//		i -=1;
//	}
//}
//System.out.println("---------------");
//System.out.println("�����: "+(cnt*12000));
