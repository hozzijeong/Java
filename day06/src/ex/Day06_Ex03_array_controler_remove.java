package ex;

import java.util.Scanner;

public class Day06_Ex03_array_controler_remove {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[2]삭제");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				for(int i=0; i<cnt; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				System.out.println("삭제할 값 입력:");
				int data = scan.nextInt();
				
				int delIdx = -1;
				
				for(int i=0; i<cnt; i++) {
					if(arr[i] ==data) {
						delIdx = i;
					}
				}
				if(delIdx == -1) {
					System.out.println("존재하지 않는 값입니다.");
					continue;
				}else {
					for( int i = delIdx; i<cnt-1;i++) {
						arr[i] = arr[i+1];
					}
					cnt-=1;
				}
				
			}
		}
	}
}
