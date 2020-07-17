package ex;

import java.util.Scanner;

public class Day04_Ex05_array_manage_sutdent_lande {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 인덱스            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.println("학생 번호 입력:");
		int num = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num == i) {
				System.out.printf("%d번 학생의 성적 = %d \n",i,arr[i]);
			}
		}
		System.out.println("===============================");
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.println("학생 성적 입력:");
		int num1 = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num1 == arr[i]) {
				System.out.printf("%d점 학생의 번호 = %d \n",arr[i],i);
			}
		}
		
		System.out.println("===============================");
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번 입력:");
		int num2 = scan.nextInt();
		for (int i =0; i<5; i++) {
			if (num2 == hakbuns[i]) {
				System.out.printf("%d의 점수 = %d \n",hakbuns[i],scores[i]);
			}
		}


	}
}
