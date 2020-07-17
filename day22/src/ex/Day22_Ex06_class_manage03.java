package ex;

import java.util.Scanner;

class Ex05{
	String name = "";
	
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
}


public class Day22_Ex06_class_manage03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex05 mega = new Ex05();
		mega.name = "메가 IT고등학교";
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for(int i=0; i<mega.arHakbun.length;i++) {
					System.out.println(mega.arHakbun[i] + "번 :" + mega.arScore[i]);
				}
			}
			else if(choice == 2) {
				int max = 0;
				for(int i=0; i<mega.arScore.length;i++) {
					if(mega.arScore[i] >= max) {
						max = mega.arScore[i];
					}
				}
				System.out.println("1등 성적: "+ max);
			}
			else if(choice == 3) {
				int min = 101;
				for(int i=0; i<mega.arScore.length;i++) {
					if(mega.arScore[i] <= min) {
						min = mega.arScore[i];
					}
				}
				System.out.println("꼴등 성적: "+ min);
			}
			else if(choice == 4) {
				System.out.println("학번 입력:");
				int hak = scan.nextInt();
				int idx = -1;
				for(int i=0; i<mega.arHakbun.length;i++) {
					if(hak == mega.arHakbun[i]) {
						idx = i;
					}
				}
				if(idx == -1) {
					System.out.println("해당 학번은 존재하지 않습니다.");
					continue;
				}
				System.out.println("성적: "+ mega.arScore[idx]);
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}


	}
}
