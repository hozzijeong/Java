package ex04_String;
/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 * 
 * 문자열도 배열이다.
 * 하나하나 비교하면 된다.
 */

import java.util.Scanner;

public class Repeat_Ex_string10_compare_String {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.println("동물 이름을 입력하세요: ");
		String myname = scan.next();
		int check = -1;
		int cnt = 0;
		if(name.length() == myname.length()) {
			for(int i=0; i<name.length();i++) {
				if(name.charAt(i) == myname.charAt(i)) {
					cnt+=1;
					if(cnt == name.length()) {
						check = 1;
					}
				}
			}
		}
		
		if(check == -1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
	}
}
