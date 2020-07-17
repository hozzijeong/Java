package ex;
/*
 * # nextLine()과 next()의 차이
 * 1. nextLine() : 문장 한라인 전체를 입력받는다. 
 * 2. next() : 공백을 기준으로 한단어씩 입력받는다.
 */

import java.util.Scanner;

public class Day14_Ex11_nextline_vs_next {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 *  hello java 입력시,
		 *  nextLine() 메서드는 hellojava 모두 출력되지만,
		 *  next()메서드는 hello 만 출력한다.
		 */
		
		
		System.out.println("이름입력:");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println("이름 입력:");
		name = scan.next();
		System.out.println(name);
	}
}
