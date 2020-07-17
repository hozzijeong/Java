package ex03_array_hard;

import java.util.Random;

public class Repeat_Ex_array_hard05_forbid_samenum {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
//		int[]check = new int[10];
//		for(int i=0;i<5;i++) {
//			int r = ran.nextInt(10)+1;
//			arr[i] = r;
//			if(check[r-1]==0) {
//				check[r-1] = 1;
//			}else {
//				i-=1;
//			}
//		}
		
		int j=0;
		
		while(j<5)	{
			int r = ran.nextInt(10)+1;
			
			int i=0;
			int check = -1;
			
			while(i<j) {
				if(arr[i] ==r) {
					check = 1;
				}
				i+=1;
			}
			if(check ==-1) {
				arr[j] = r;
				j+=1;
			}
			
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		
	}
}
