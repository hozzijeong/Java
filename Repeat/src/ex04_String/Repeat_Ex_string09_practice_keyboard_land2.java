package ex04_String;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * 
 *  --> 반복문을 돌려서 랜덤한 숫자가 나왔을떄 그저 *로만 표시해 주면 됨
 *  	--> 문자열도 행렬, 즉 순서가 있다는 것을 명심할 것!
 *
 * ...
 */
public class Repeat_Ex_string09_practice_keyboard_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		final int size = words.length;
		for(int i=0; i<50; i++) {
			int r = ran.nextInt(size);
			
			String temp = words[0];
			words[0] = words[r]	;
			words[r] = temp;
		}
		int cnt = 0;
		while(cnt<size) {
		
			int wsize = words[cnt].length();
			int r = ran.nextInt(wsize);
			System.out.print("문제:");
			for(int i=0; i<wsize;i++) {
				if(i ==r) {
					System.out.print("*");
				}else {
					System.out.print(words[cnt].charAt(i));
				}
			}
			System.out.println();
			System.out.print("입력:");
			String word = scan.next();
			
			if(word.equals(words[cnt])) {
				cnt+=1;
			}
		
		}


	}
}
