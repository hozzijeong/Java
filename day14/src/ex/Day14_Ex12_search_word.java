package ex;
/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

import java.util.Scanner;

public class Day14_Ex12_search_word {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.println("검색할 단어를 입력하세요:");
		String word = scan.next();
		int check = -1;
		int idx = 0;
		int cnt = 0;
		for(int i=0; i<word.length();i++) {
			for(int j=idx; j<text.length();j++) {
				if(word.charAt(i) == text.charAt(j)) {
					idx = j;
					cnt+=1;
					if(cnt == word.length()) {
						check = 1;
					}
				}
			}
		}
		
		
		if(check ==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
