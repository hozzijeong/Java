package ex02_array;

import java.util.Scanner;

/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */


public class Day07_Ex08_find_sosu_landw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int num = scan.nextInt();
		
		int cnt = 0;
		int check = 0;
		
		for(int i=num; i>=1;i--	) {
			for(int j = 1; j<=num; j++) {
				if(i%j == 0) {
					cnt+=1;
					if(cnt ==2) {
						check +=1;
					}
				}
			}
		}
		
		int[] sosu = new int[check];
		
		for(int i=num; i>=1;i--	) {
			for(int j = 1; j<=num; j++) {
				if(i%j == 0) {
					cnt+=1;
					if(cnt ==2) {
						sosu[j-1] = i;
					}
				}
			}
		}
		
		for(int i = 0; i<check; i++) {
			System.out.print(sosu[i] + " ");
		}
		
		
	}
}
