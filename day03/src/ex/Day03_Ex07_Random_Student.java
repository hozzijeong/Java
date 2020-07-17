package ex;
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

import java.util.Random;
import java.util.Scanner;

public class Day03_Ex07_Random_Student {
	public static void main(String[] args) {
		Random ran = new Random();
		int i = 1; // 학생 번호
		double avg = 0; // 학생 평균
		int suc = 0; // 합격자수
		int max = 0; // 학생의 성적
		int maxi = 0;// 1등 번호
		while (i<=10) {
			int scor = ran.nextInt(100)+1;
			System.out.printf("%d번째 학생 점수:%d \n",i,scor);
			
			if (scor>=60) {
				suc+=1;
			}
			avg += scor;
			if (scor > max) {
				max = scor;
				maxi = i;
			}
			i +=1;
		}
		System.out.println("전교생 총점:"+avg+ " 평균:"+(avg/10.0));
		System.out.println("합격자수: "+suc);
		System.out.println("1등학생 번호:"+maxi+" 성적"+max);
	}

}
