package ex;

import java.util.Scanner;

public class Day12_Ex01_two_dementional_array_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
				{"철수", "소고기"},
				{"철수", "김밥"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};
		
		//1. 이름과 번호를 입력 받는다.
		//2. 해당 인덱스를 삭제하고, 전체 배열의 크기를 -1한다.
		System.out.println("이름 입력:");
		String name = scan.next();
		
		System.out.println("번호 입력:");
		int idx = scan.nextInt();
		
		int delIdx = -1;
		
		
		int count = 0;
		for(int i=0; i<jang.length;i++) {
			if(jang[i][0].equals(name)) {
				if(count == idx) {
					delIdx = i;
				}
				count+=1;
			}
		}
		
		System.out.println(delIdx);
		
		// 해당 이름과 그에 맞는 번호 (delIdx)를 찾음. 
		// 해당 인덱스를 삭제하고 전체 배열의 크기를 -1할 일.
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j=0;
		for(int i=0;i<temp.length;i++) {
			if(i != delIdx) {
				jang[j] = temp[i];
				j+=1;
			}
		}
		temp = null;
		
		for(int i=0; i<jang.length;i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
	}
}



