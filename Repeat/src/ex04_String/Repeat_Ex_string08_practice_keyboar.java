package ex04_String;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class Repeat_Ex_string08_practice_keyboar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i<50; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		for(int i=0; i<words.length;i++) {
			System.out.print("문제:");
			System.out.println(words[i]);
			System.out.print("입력:");
			String word = scan.next();
			if(!words[i].equals(word)) {
				System.out.println("땡");
				i-=1;
			}
		}

	}
}
