package ex;

import java.util.Scanner;

public class Day12_Ex02_two_dementional_array_insert2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int jangCount = 5;
		
		String[][] jang = {
			{"ö��", "���"},
			{"����", "��"},
			{"ö��", "���"},
			{"����", "���"},
			{"����", "���"}
		};
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		// 1. jang[i][0] �� ��ҵ��� �켱������ �����Ѵ�.
		// 2. ���ʿ� �����ϰ� �ִ� �ּ� ������ ���� ������ ���߿� �ٲ��൵ �ȴ�...?
		
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
