package ex;

import java.util.Random;

public class Day04_Ex04_array_manage_student_grade {
	public static void main(String[] args) {
		Random ran = new Random();
	// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
	// 예   1) 87, 11, 92, 14, 47
		int arr[] = {0,0,0,0,0};
		for(int i = 0; i<5;i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		System.out.println("===================");
	
	// 문제2) 전교생의 총점과 평균 출력
	// 예   2) 총점(251) 평균(50.2)
		int sum = 0; 
		double avg = 0;
		for (int i = 0; i<5;i++) {
			sum +=arr[i];
		}
		avg = sum/5.0;
		System.out.println("총점: "+sum+"평균: "+(avg));
		System.out.println("===================");

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
	// 예   3) 2명
		int stu = 0;
		for(int i = 0; i<5;i++) {
			if(arr[i]>=60) {
				stu +=1;
			}
		}
		System.out.println("합격생: "+stu);
		
		
	}
}
