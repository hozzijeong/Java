package ex02_array;

import java.util.Random;

public class Repeat_Ex_array02_manage_student_grade {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		System.out.println("==========");
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			sum += arr[i];
		}
		double avg = sum/5.0;
		System.out.printf("%d,%.2f",sum,avg);
		System.out.println();
		System.out.println("==========");
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			if(arr[i] >=60) {
				cnt+=1;
			}
		}
		System.out.println(cnt+"명");

		System.out.println("==========");

	}
}
