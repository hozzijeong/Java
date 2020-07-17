package ex04_String;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class Repeat_Ex_string12_search_word {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

		char[] arr = new char[text.length()];
		
		for(int i=0; i<text.length();i++) {
			arr[i] = text.charAt(i);
		}
		// arr에 text에 있는 모든 문자들을 저장
		
		int size = word.length();
		
		int check = -1;
		for(int i=0; i<text.length()-size +1; i++) {
			// text.length - size +1 : text의 길이에서 word의 길이만큼 뺀 이유는
			// size 만큼 수를 더할 일 이생길 것이기 때문! +1을 한 것은 숫자가 딱 맞아 조건식이 "<"이어서!
			int count = 0;
			
			for(int j=0; j<size;j++) {
				if(arr[i+j] == word.charAt(j)) {
					// arr[i +j]를 한 이유는, i를 고정해 놓고, j 가 size만큼 증가할때, size 길이 만큼 count 가 늘어나는 지 확안하기 위해서
					// i는 처음 시작의 기준을 잡는 수, j는 그에 따라 가변하는 수를 의미.
					count+=1;
				}
			}
			if(count == size) {
				check = 1;
			}
		}
		
		
		
		if(check ==1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}
}
