package ex02_array;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */


public class Repeat_Ex_array17_find_sosu_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력:");
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
