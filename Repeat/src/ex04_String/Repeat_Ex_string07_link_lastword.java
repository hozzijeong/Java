package ex04_String;
/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

import java.util.Scanner;

public class Repeat_Ex_string07_link_lastword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";

		while(true) {
			System.out.println("제시어 : " + start);
			System.out.print("입력:");
			String word = scan.next();
			
			if(start.charAt(start.length()-1) == word.charAt(0)) {
				start = word;
			}else {
				System.out.println("땡!");
				break;
			}
			
			
			
		}
		

	}
}
