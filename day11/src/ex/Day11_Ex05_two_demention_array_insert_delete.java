package ex;
/*
 * # 2차원배열[삭제]
 * . 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수	1
 * 삭제 : 김밥
 * 
 * 입력 : 철수 2
 * 삭제 : 바나나
 */

import java.util.Scanner;

public class Day11_Ex05_two_demention_array_insert_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 이름과 인덱스를 입력하면 '목록'이 삭제. 
		String[][] jang = {
				{"철수", "소고기"},		// 0
				{"철수", "김밥"},		// 1
				{"영희", "김치"},
				{"철수", "바나나"},		// 2
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};
		System.out.println("이름 입력:");
		String name = scan.next();
		System.out.println("인덱스 입력:");
		int idx = scan.nextInt();
		int count = 0;
		int delIdx = -1;
		for(int i=0; i<jang.length;i++) {
			if(jang[i].equals(name)) {
				if(count == idx ) {
					delIdx = i;
				}
				count+=1;
			}
		}
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j =0;
		for(int i=0; i<temp.length;i++) {
			if(i != idx) {
				jang[j] = temp[i];
				j+=1;
			}
		}
		
		for(int i=0; i<jang.length;i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
		
		
		
		
			 


	}
}
