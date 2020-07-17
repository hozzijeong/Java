package ex;

import java.util.Scanner;

/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class Day14_Ex09_compare_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.println("동물 이름을 입력하세요:");
		String myName = scan.next();
		
		int size = name.length();
		int j=0;
		int check = -1;
		
		for(int i=0; i<size;i++) {
			if(name.charAt(i) == myName.charAt(j)) {
				j+=1;
				if(j == size-1) {
					check = 1;
				}
			}
		}
		
		if(check ==-1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
	}
}
