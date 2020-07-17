package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_array08_change_Value {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.println("인덱스 1입력:");
		int idx1 = scan.nextInt();
		System.out.println("인덱스2입력:");
		int idx2 = scan.nextInt();
		
		int x = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = x;
		for(int i=0; i<5;i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		System.out.println("==================");
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		
		System.out.println("값1입력:");
		int value1 = scan.nextInt();
		System.out.println("값2입력:");
		int value2 = scan.nextInt();
		
		int k =0;
		int j =0;
		
		for (int i=0; i<5; i++) {
			if(arr[i] == value1) {
				k = i;

			}
		}
		for(int i=0; i<5; i++) {
			if(arr[i] == value2) {
				j = i;
			}
		}
		
		
		int m = arr[k];
		arr[k] = arr[j];
		arr[j] = m;
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		
		System.out.println("학번1 입력:");
		int h1 = scan.nextInt();
		System.out.println("학번2 입력:");
		int h2 = scan.nextInt();
		int x1 = 0;
		int y = 0;
		
		for(int i=0; i<5; i++) {
			if(hakbuns[i] == h1) {
				x1 = i;
			}
			if(hakbuns[i] == h2) {
				y = i;
			}
		}
		
		int z = scores[x1];
		scores[x1] = scores[y];
		scores[y] = z;
		
		for(int i = 0; i<5; i++) {
			System.out.print(scores[i] +" ");
			
		}
		
		

		
		
		
	
	}
}
