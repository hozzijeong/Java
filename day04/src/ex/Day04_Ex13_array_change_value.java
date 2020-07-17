package ex;

import java.util.Scanner;

public class Day04_Ex13_array_change_value {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println("인덱스 1입력:");
		int index1 = scan.nextInt();
		System.out.println("인덱스2입력:");
		int index2 = scan.nextInt();
		int x = 0;
		
		x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("=========================");
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println("값 1입력:");
		int value1 = scan.nextInt();
		System.out.println("값2입력:");
		int value2 = scan.nextInt();
		int j = 0;
		int k = 0;
		
		for(int i = 0; i<5; i++) {
			if(arr[i] == value1) {
				j = i;
			}
			if(arr[i] == value2) {
				k = i;
			}
		}

		int y = arr[j];
		arr[j]= arr[k];
		arr[k] = y;
		
		for(int i =0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		System.out.println("학번1 입력:");
		int hak1 = scan.nextInt();
		System.out.println("학번2 입력:");
		int hak2 = scan.nextInt();
		
		int a = 0;
		int b = 0;
		
		for (int i =0; i<5; i++) {
			if(hak1 == hakbuns[i]) {
				a = i;
			}
			if(hak2 == hakbuns[i]) {
				b = i;
			}
		}
		int m = scores[a];
		scores[a] = scores[b];
		scores[b] = m;
		
		for(int i =0; i<5; i++) {
			System.out.print(hakbuns[i]+" ");
		}
		System.out.println();
		for(int i =0; i<5; i++) {
			System.out.print(scores[i]+" ");
		}
		
	}
}
