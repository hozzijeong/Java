package ex07_method;

import java.util.Random;
import java.util.Scanner;

class Student{
	int hakbun;
	int score;
}
class Ex02{
	Random ran = new Random();
	void test1(int[] x) {
		for(int i=0; i<x.length;i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i] +" ");
		}
		System.out.println();
	};
	
	int test2(int[] x) { 
		int total = 0;
		for(int i=0; i<x.length;i++) {
			total+= x[i];
		}
		
		return total; }
	double test3(int[] x) { 
	
		double avg = test2(x)/x.length;
		
		return avg; }
	int test4(int[] x) {
		int cnt = 0;
		for(int i=0; i<x.length;i++) {
			if(x[i] >=60) {
				cnt+=1;
			}
		}
		return cnt; }
	
	int test5(int[] x, int idx) { 
		
		return x[idx]; }
	
	
	int test6(int[] x, int score) {
		int check = -1;
		for(int i=0; i<x.length;i++) {
			if( score == x[i]) {
				check = i;
			}
		}
		if(check == -1) {
			return 0;
		}else {
			return check;
		}
		
	}
			
	int test7(int[] x, int[] y, int hakbun) { 
		int check = -1;
		for(int i=0; i<x.length;i++) {
			if(hakbun == x[i] ) {
				check = i;
			}
		}
		
		if(check == -1) {
			return 0;
		}
		
		
		return y[check]; }

	Student test8(int[] x, int[] y) { 
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<x.length;i++) {
			if(maxScore < y[i]) {
				maxScore = y[i];
				maxIdx = i;
			}
		}
		
		Student temp = new Student();
		temp.hakbun = x[maxIdx];
		temp.score = y[maxIdx];
		
		return temp; }


}
public class Repeat_Ex02_managestudent02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex02 e = new Ex02();
		
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = new int[5];
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
		// 예   1) 87, 11, 92, 14, 47
		e.test1(scores);
		
		// 문제2) 전교생의 총점 리턴 메서드
		// 예   2) 총점(251) 평균(50.2)
		int total = e.test2(scores);
		System.out.println( total);
		
		// 문제3) 전교생의 평균 리턴 메서드
		// 예   3) 평균(50.2)
		double avg = e.test3(scores);
		System.out.println(avg);
		
		// 문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
		// 예   4) 2명
		int cnt = e.test4(scores);
		System.out.println( cnt);
		// 문제5) 인덱스를 전달받아 성적 리턴 메서드
		// 정답5) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스 입력:");
		int idx = scan.nextInt();
		
		int score = e.test5(scores, idx);
		System.out.println(score);
		
		
		// 문제6) 성적을 전달받아 인덱스 리턴 메서드
		//		  단, 없는 성적 입력 시 예외처리		
		// 정답6) 성적 입력 : 11	인덱스 : 1
		System.out.println("성적 입력:");
		score = scan.nextInt();
		idx = e.test6(scores, score);
		
		if(idx == 0) {
			System.out.println("해당 성적은 존재하지 않습니다.");
		}else {
			System.out.println(idx);
		}
		
		
		// 문제7) 학번을 전달받아 성적 리턴 메서드
		// 		  단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당 학번은 존재하지 않습니다.
		System.out.println("학번 입력:");
		int hak = scan.nextInt();
		
		score = e.test7(hakbuns, scores, hak);
		
		if(score ==0) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.printf("%d번(%d점)",hak,score);
		}
		System.out.println();
		
		// 문제9) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
		// 정답9) 1004번(98점)
		
		
		Student temp = e.test8(hakbuns, scores);
		
		System.out.println(temp.hakbun+"("+temp.score+")점");


	}
}
