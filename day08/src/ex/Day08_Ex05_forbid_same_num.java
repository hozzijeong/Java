package ex;
/*
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
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
