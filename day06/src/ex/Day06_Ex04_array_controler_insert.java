package ex;

import java.util.Scanner;

public class Day06_Ex04_array_controler_insert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[3]삽입");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 3) {
				
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
			}
			
		}


	}
}
