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

public class Day11_Ex05_two_demention_array_insert_delete2 {
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
		String[][] temp = new String[jang.length][jang[0].length];
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				temp[i][j] = "";
			}
		}
		
		System.out.println("입력:");
		String name = scan.next();
		
		int count = 0;
		for(int i=0; i<jang.length;i++) {
			temp[i][0] = name;
			int check = -1;
			for(int j=0; j<i; j++) {
				if(temp[j][0].equals(jang[i][0])) {
					check = i;
				}
			}
			if(check != -1) {
				temp[count] = jang[check];
				count = count + 1;
			}
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i][0] + " : " + temp[i][1]);
		}
		
		
		
			 


	}
}
