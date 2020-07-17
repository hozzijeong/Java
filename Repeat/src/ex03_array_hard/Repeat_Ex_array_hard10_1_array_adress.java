package ex03_array_hard;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 */

public class Repeat_Ex_array_hard10_1_array_adress {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			System.out.println("score = ");
			for(int i=0; i<count;i++) {
				System.out.print(score[i]+" ");
			}
			System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == 0) {
					score = new int[count+1];
				}else {
					int[] temp = score;
					score = new int[count+1];
					for(int i=0; i<count;i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
					
				System.out.println("추가할 값 입력:");
				int data = scan.nextInt();
				
				score[count] = data;
				
				count+=1;
			}
			else if(sel == 2) {
				System.out.println("삭제할 인덱스 입력:");
				int idx = scan.nextInt();
				
				if(idx>count-1 || idx<0) {
					System.out.println("해당 위치의 값은 존재하지 않습니다.");
					continue;
				}
				if(count ==1) {
					score = null;
				}else if(count>1) {
					int [] temp = score;
					score = new int[count-1];
					for(int i=idx; i<count-1;i++) {
						score[i] = temp[i+1];
					}
					for(int i=0; i<idx;i++) {
						score[i] = temp[i];
					}
					
					temp = null;
				}
				count-=1;
				
				
			}
			else if(sel == 3) {
				System.out.println("삭제할 값 입력:");
				int data = scan.nextInt();
				int delIdx = -1;
				for(int i=0;i<count;i++) {
					if(data == score[i]) {
						delIdx = i;
					}
				}
				if(delIdx ==-1) {
					System.out.println("해당 값이 존재하지 않습니다.");
					continue;
				}
				if(count ==1) {
					score = null;
				}else if(count>1){
					int[] temp = score;
					score = new int[count-1];
					
					for(int i=delIdx; i<count-1;i++) {
						score[i] = temp[i+1];
					}
					for(int i=0; i<delIdx;i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
				count-=1;
				
				
				
			}
			else if(sel == 4) {
				System.out.println("인덱스를 입력하세여:");
				int idx = scan.nextInt();
				if(idx>count || idx<0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;	
				}
				System.out.println("값 입력:");
				int data = scan.nextInt();
				if(count ==0) {
					score = new int[count+1];
				}else if (count>1) {
					int[] temp = score;
					score = new int[count+1];
					
					for(int i=0; i<count;i++) {
						score[i] = temp[i];
					}	
					
					for(int i=count; i>idx;i--) {
						score[i] = score[i-1];
					}
					temp = null;
				}
				score[idx] = data;
				count+=1;
			}
			else if(sel == 0) {
				break;
			}
		}




	}
}
