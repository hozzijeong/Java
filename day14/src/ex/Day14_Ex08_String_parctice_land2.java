package ex;

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
 * ...
 */

public class Day14_Ex08_String_parctice_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};

		
		for(int i=0; i<50;i++) {
			int r = ran.nextInt(4);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i=0;
		while(i<words.length) {
			int size = words[i].length();
			int r = ran.nextInt(size); // 단어의 길이 만큼안에서의 랜덤한 숫자 r 생성
			
			System.out.println("문제"+"["+(i+1)+"]");
			for(int j=0; j<size;j++) {
				if(j ==r) {
					System.out.print("*");
					// random 한 숫자와 j 가 같다면 그 자리는 *를 출력
				}else {
					System.out.print(words[i].charAt(j));
					// 그게 같지 않다면 다른 수들은 전부 인덱싱을 해서 그 값만 출력
				}
			}
			System.out.println();
			
			System.out.print("입력:"	);
			String word = scan.next();
			
			if(word.equals(words[i])) {
				i+=1;
			}
		}
		
		
		
	}
}
