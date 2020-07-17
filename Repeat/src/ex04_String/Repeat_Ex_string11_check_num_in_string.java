package ex04_String;
/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

import java.util.Scanner;

public class Repeat_Ex_string11_check_num_in_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력:");
		String text = scan.next();
		
		int size = text.length();
		
		char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		
		int cnt = 0;
		for(int i=0; i<size; i++) {
			for(int j=0; j<num.length;j++) {
				if(text.charAt(i) == num[j]) {
					cnt+=1;
				}
			}
		}
		
		if(cnt ==0) {
			System.out.println("문자만 있다");
		}else if(cnt == size) {
			System.out.println("숫자만 있다");
		}else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
	}
}
