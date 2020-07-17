package ex;

import java.util.Random;

class Student{
	int hakbun;
	int score;
}

class Ex09{
	
	void test1(int[] x) {
		Random ran = new Random();
		for(int i=0; i<x.length;i++) {
			int r = ran.nextInt(100)+1;
			x[i] = r;
			System.out.print(x[i] +" ");
		}
		System.out.println();
		
	}
	
	int test2() {
		return 0;
	}
	double test3(int [] x) {
		return 0;
	}
	int test4(int[] x) {
		return 0;
	}
	int test5(int[] x,int idx) {
		return 0;
	}
	int test6(int[] x,int score) {
		return 0;
	}
	int test7(int[] x, int[] y, int hakbun) {
		return 0;
	}
	
	Student test08(int[] x, int[]y) {return null;}
}


public class Day23_Ex15_method_sutdentmandge02 {
	public static void main(String[] args) {
		Ex09 e = new Ex09();
		
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = new int [5];
		System.out.println("===============");
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
		// 예   1) 87, 11, 92, 14, 47
		e.test1(scores);
		
		
		System.out.println("===============");
		// 문제2) 전교생의 총점 리턴 메서드
		// 예   2) 총점(251) 평균(50.2)
//		e.test2(scores);
		
		
		System.out.println("===============");
		// 문제3) 전교생의 평균 리턴 메서드
		// 예   3) 평균(50.2)
		e.test3(scores);
		
		// 문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
		// 예   4) 2명
		e.test4(scores);

		// 문제5) 인덱스를 전달받아 성적 리턴 메서드
		// 정답5) 인덱스 입력 : 1	성적 : 11점
		e.test5(scores, 1);
		
		// 문제6) 성적을 전달받아 인덱스 리턴 메서드
		//		  단, 없는 성적 입력 시 예외처리		
		// 정답6) 성적 입력 : 11	인덱스 : 1
		e.test6(scores, 11);
		
		// 문제7) 학번을 전달받아 성적 리턴 메서드
		// 		  단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당 학번은 존재하지 않습니다.
		e.test7(hakbuns, scores, 1000);
		
		// 문제9) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
		// 정답9) 1004번(98점)
//		e.test8(hakbuns, scores);


		
		
	}
}
