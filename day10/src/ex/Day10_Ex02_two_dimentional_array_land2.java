package ex;

import java.util.Scanner;

public class Day10_Ex02_two_dimentional_array_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		System.out.println("=====문제1=====");
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.println("인덱스 2개 입력:");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		
		System.out.println("값 출력:"+arr[idx1][idx2]);
		
		System.out.println("=====문제2=====");
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("값 입력:");
		int data = scan.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == data) {
					System.out.printf("인덱스1: %d 인덱스2: %d",i,j );
				}
			}
		}
		System.out.println();
		
		System.out.println("=====문제3=====");
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int mi = 0;
		int mj = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] >max) {
					max = arr[i][j];
					mi = i;
					mj = j;
				}
			}
		}
		System.out.printf("가장 큰 값의 인덱스: %d  %d ",mi,mj);
		
		System.out.println();
		
		System.out.println("=====문제4=====");
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println("값 2개 입력:");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		int a = 0;
		int b = 0;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == value1) {
					a = i;
					b = j;
				}
				if(arr[i][j] == value2) {
					x = i;
					y = j;
				}
			}
		}
		
		int temp = arr[a][b];
		arr[a][b] = arr[x][y];
		arr[x][y] = temp;
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++)	{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}
}
