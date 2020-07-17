package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_array03_manage_student_grage_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 인덱스            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스 입력:");
		int idx = scan.nextInt();
		System.out.println("성적:" +arr[idx]);
		
		System.out.println("==========");
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적 입력:");
		int score = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(score ==arr[i]) {
				System.out.println("인덱스:" + i);
			}
		}
		
		System.out.println("==========");
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("학번 입력:");
		int num1 = scan.nextInt();
		
		int check = -1;
		for(int i=0; i<5;i++) {
			if(num1 == hakbuns[i]) {
				check = i;
			}
		}
		if(check ==-1) {
			System.out.println("해당 학번은 존해자히 않습니다.");
		}else {
			System.out.println("성적:" + scores[check]);			
		}
		System.out.println("==========");
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.


		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int max = 0;
		int maxnum =0;
		for(int i=0; i<5; i++) {
			if(scores[i]>maxnum) {
				maxnum = scores[i];
				max = hakbuns[i];
			}
		}
		System.out.printf("%d번(%d점)",max,maxnum);

	}
}
