package ex02_array;

import java.util.Scanner;

/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */


public class Repeat_Ex_array17_find_sosu_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int num = scan.nextInt();
		
		int check = 0;
		int k =0;
		for(int i =1; i<=num; i++) {
			int cnt = 0;
			for(int j =1; j<=i;j++) {
				if(i%j ==0) {
					cnt+=1;
				}
			}
			if(cnt == 2) {
//				check +=1;
				System.out.print(i +" ");
			}
		}
//		
//		int[] sosu = new int[check];
//		
//		
//		for(int i = 1; i<=num; i++) {
//			int cnt = 0;
//			for(int j = 1; j<=i; j++) {
//				if(i%j ==0) {
//					cnt+=1;
//				}
//			}
//			if(cnt ==2) {
//				sosu[k] = i;
//				k+=1;
//			}
//		}
//		
//	for(int m = 0; m<check; m++){
//		System.out.print(sosu[m] +" ");
//	}
		
	}
}
