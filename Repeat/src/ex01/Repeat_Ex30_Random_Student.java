package ex01;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */


public class Repeat_Ex30_Random_Student {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int total = 0;
		int pass = 0;
		int max = 0;
		int maxSco = 0;
		int i =0;
		while(i<10) {
			int rnum = ran.nextInt(100)+1;
			total +=rnum;
			if(rnum>=60) {
				pass+=1;
			}
			if(rnum>maxSco) {
				maxSco = rnum;
				max = i;
			}
			i+=1;
		}
		
		double avg = (total)/10.0;
		
		System.out.printf("전교생 총점: %d\n",total);
		System.out.printf("전교생 평균: %.2f\n",avg);
		System.out.printf("합격자수: %d\n",pass);
		System.out.printf("1등학생 번호 & 점수: %d %d",i,maxSco);
		
		
		
	}
}
