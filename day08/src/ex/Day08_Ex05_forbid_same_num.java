package ex;
/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */

import java.util.Random;

public class Day08_Ex05_forbid_same_num {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];
		
//		int check[] = new int[10];
//		
//		for(int i=0; i<5; i++) {
//			int r = ran.nextInt(10)+1;
//			arr[i] = r;
//			if(check[r-1] == 0) {
//				check[r-1] =1;
//			}else {
//				i-=1;
//			}
//		}

		
		int j=0;
		
		while(j<5) {
			int r = ran.nextInt(10)+1;

			int check = 1;
			int i = 0;
			
			while(i<j) {
				if(arr[i] == r) {
					check = -1;
				}
				i+=1;
			}
			
			if(check ==1 ) {
				arr[j] = r;
				j+=1;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
	

	
	
	}
}
