package ex;

import java.util.Scanner;

public class Day12_Ex02_two_dementional_array_insert2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int jangCount = 5;
		
		String[][] jang = {
			{"철수", "김밥"},
			{"영희", "감"},
			{"철수", "사과"},
			{"영희", "사과"},
			{"영희", "김밥"}
		};
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		// 1. jang[i][0] 즉 요소들을 우선적으로 정리한다.
		// 2. 애초에 저장하고 있던 주소 값들은 같기 때문에 나중에 바꿔줘도 된다...?
		
		for(int i=0; i<jang.length;i++) {
			String minStr = jang[i][0];
			int idx = i;
			for(int j=i; j<jang.length;j++) {
				if(minStr.compareTo(jang[j][0])>=0) {
					minStr = jang[j][0];
					idx = j;
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[idx];
			jang[idx] = temp;
			
		}
		
		System.out.println("=====================");
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		for(int i=0; i<jang.length;i++) {
			String minStr = jang[i][1];
			int idx = i;
			for(int j=i; j<jang.length;j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(minStr.compareTo(jang[j][1])>0) {
						minStr = jang[j][1];
						idx = j;
					}
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[idx];
			jang[idx] = temp;
			
		}
		
		System.out.println("=====================");
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
	}
}
