package ex02_array;

import java.util.Scanner;

public class Repeat_Ex_arrat16_array_controler_total {
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
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(cnt ==5) {
					System.out.println("더이상 값을 추가할 수 없습니다.");
					continue;
				}
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt+=1;
				
			}
			else if(sel == 2) {
				int delIdx = -1;
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				for(int i=0; i<cnt;i++) {
					if(arr[i] == data) {
						delIdx = i;
					}
				}
				if(delIdx == -1) {
					System.out.println("삭제하려는 값이 존재하지 않습니다.");
					continue;
				}
				for(int i=delIdx; i<cnt-1;i++) {
					arr[i] = arr[i+1];
				}
				cnt-=1;
				
			}
			else if(sel == 3) {
				if(cnt ==5) {
					System.out.println("더이상 값을 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				if(idx>cnt || idx<0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;
				}
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				for(int i = cnt; i>idx; i--) {
					arr[i] = arr[i-1];
				}
				arr[idx] = data;
				cnt+=1;
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
		


	}
}
