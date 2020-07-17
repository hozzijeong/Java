package ex;

import java.util.Scanner;

public class Day06_Ex02_array_controler {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]추가");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(cnt ==5) {
					System.out.println("배열이 꽉찼습니다.");
					continue;
				}else {
					System.out.println("추가할 숫자 입력:");
					int data = scan.nextInt();
					
					arr[cnt] = data;
					
					cnt+=1;
				}
			}
			
		}


	}
}
