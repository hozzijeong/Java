package ex;
/*
 * # OMR카드 : 클래스 + 변수
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

class Ex06{
	int []answer = {1,3,4,2,5};
	int [] hgd = new int [5];
	
	int cnt = 0;
	int score = 0;
}
public class Day22_Ex07_class_OMR {
	public static void main(String[] args) {
		Random ran = new Random();
		
		Ex06 e = new Ex06();
		
		for(int i=0; i<5; i++) {
			int r = ran.nextInt(5)+1;
			e.hgd[i] = r;
		}
		System.out.print("정오표 { ");
		for(int i=0; i<e.answer.length;i++) {
			if(e.answer[i] == e.hgd[i]) {
				System.out.print("O ");
				e.cnt +=1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("}");

		e.score = e.cnt*20;
		
		System.out.println("성적 : "+ e.score);
		
		
	}
}
