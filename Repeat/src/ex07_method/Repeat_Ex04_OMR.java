package ex07_method;
/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

import java.util.Random;

class ScoreMng{
	Random ran = new Random();
	
	int[] omr = {1,4,3,2,2};
	int[] me = new int [5];
	
	int cnt = 0;
	int score = 0;
	
	//1. me 답안 작성하기.
	void makeAnswer() {
		for(int i=0; i<me.length;i++) {
			me[i] = ran.nextInt(4)+1;
		}
	}
	//2. 정답 출력하기
	void showAnswer() {
		//omr 카드 출력
		System.out.print("omr = [");
		for(int i=0; i<omr.length;i++) {
			System.out.print(omr[i] +" ");
		}
		System.out.print(" ]");
		System.out.println();
		System.out.print("me = [");
		for(int i=0; i<me.length;i++) {
			System.out.print(me[i] +" ");
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	void checkAnswer() {
		cnt = 0;
		System.out.print("정오표 = [ ");
		for(int i=0; i<omr.length;i++) {
			if(omr[i] == me[i]) {
				System.out.print("O ");
				cnt+=1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println(" ]");
	
		score = 20*cnt;
		System.out.println("점수 = "+score+"점");
	}
	
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
	
}
public class Repeat_Ex04_OMR {
	public static void main(String[] args) {
		ScoreMng sm = new ScoreMng();
		
		sm.run();
	}
}
