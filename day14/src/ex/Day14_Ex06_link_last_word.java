package ex;
/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 * 
 * 집가서...해보기...
 */

import java.util.Scanner;

public class Day14_Ex06_link_last_word {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		while(true) {
			int size = start.length();
			System.out.println("제시어 : " + start);
			
			System.out.print("입력:");
			String word = scan.next();
			
			if(word.substring(0, 1).equals(start.substring(size-1)) ) {
				start = word;
			}else {
				break;
			}
		}
		
		
		
	}
}
