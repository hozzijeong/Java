package ex04_String;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */

public class Repeat_Ex_string13_change_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		String ctext = "";
		
		while(true) {
			
			System.out.println(ctext);
			
			System.out.print("변경하고 싶은 단어를 입력하세요 : ");
			String word = scan.nextLine();
			System.out.println();
			// 1. 우선 단어 검색 먼저!
			char[] temp = new char[text.length()];
			
			for(int i=0; i<text.length();i++) {
				temp[i] = text.charAt(i);
			}
			
			int size = word.length();
			int check = -1;
			
			int start = 0;
			// 해당 단어가 시작하는 인덱스 번호를 저장할 변수. 
			
			for(int i=0; i<temp.length - size+1;i++) {
				int cnt = 0;
				for(int j=0; j<size;j++) {
					if(temp[i+j] == word.charAt(j)) {
						cnt+=1;
					}
				}
				if(cnt ==size) {
					check = 1;
					start = i;
				}
			}
			
			if(check == -1) {
				System.out.printf("%s(은)는 존재하지 않습니다.");
				continue;
			}
			
			
			System.out.println("바꿀 단어 입력:");
			String cword = scan.next();
			// start ~ start + size -> 이것이 word의 길이이자, 위치.
			int csize = cword.length();
			
			int ss = start+size;
			
			char[] ctemp = new char[text.length() - size + csize];
			
			for(int i=0; i<start;i++) {
				ctemp[i] = temp[i];
			}
			for(int i = csize;i<ctemp.length;i++) {
				ctemp[i] = temp[start+size];
				ss +=1;
			}
			
			
			for(int i= start; i<csize; i++) {
				ctemp[i] = cword.charAt(i);
			}
			
			for(int i=0; i<ctemp.length;i++) {
				ctext +=ctemp[i];
			}
			
		
		}
			
		
		


	}
}
