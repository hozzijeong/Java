package ex;

import java.util.Random;
import java.util.Scanner;

class Ex04{
	int [] hakbuns = {1001,1002,1003,1004,1005};
	int [] scores = new int [5];
}
public class Day22_Ex05_Class_manage02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		System.out.println("==========");
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length;i++	) {
			int r = ran.nextInt(100)+1;
			e.scores[i] = r;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		for(int i=0; i<e.scores.length;i++) {
			sum+= e.scores[i];
		}
		
		float avg = sum/e.scores.length;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
		
		System.out.println("==========");
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] >= 60) {
				cnt+=1;
			}
		}
		System.out.println("합경생수: "+cnt);
		
		
		
		System.out.println("==========");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.println("[1~5]인덱스 입력:");
		int idx = scan.nextInt();
		idx-=1;
		if(idx < 0 || idx > e.scores.length-1) {
			System.out.println("[메세지] 해당 인덱스에는 값이 존재하지 않습니다.");
		}else {
			System.out.println("성적: "+e.scores[idx]);
		}
		
		
		System.out.println("==========");
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적 입력:");
		int score = scan.nextInt();
		idx = -1;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] == score) {
				idx = i; 
			}
		}
		
		
		if(idx == -1) {
			System.out.println("[메세지] 해당 성적은 존재하지 않습니다.");
		}else {
			idx +=1;
			System.out.println("인덱스:" + idx);
		}
		
		System.out.println("==========");
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번 입력:");
		int hak = scan.nextInt();
		idx = -1;
		
		for(int i=0; i<e.hakbuns.length;i++	) {
			if(hak == e.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println("성적: "+ e.scores[idx]);
		}
		
		
		
		System.out.println("==========");
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("학번 입력:");
		hak = scan.nextInt();
		idx = -1;
		
		for(int i=0; i<e.hakbuns.length;i++	) {
			if(hak == e.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println("성적: "+ e.scores[idx]);
		}
		
		System.out.println("==========");
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int max = 0;
		idx = -1;
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] >= max) {
				max = e.scores[i];
				idx = i;
			}
		}
		
		System.out.printf("%d번(%d점)",e.hakbuns[idx],max);
		
		
		

	}
}
