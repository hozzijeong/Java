package ex;

import java.util.Scanner;

/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */
class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}



public class Day23_Ex04_ladder_game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex14 e = new Ex14();
		
		System.out.println("[오늘의 점심메뉴]");
		for(int i=0; i<e.menu.length;i++) {
			System.out.println(e.menu[i]);
		}
		System.out.println("---------------");
		
		for(int i=0; i<e.ladder[0].length;i++) {
			System.out.print(" "+(i+1)+" ");
		}
		System.out.println();
		
		for(int j=0; j<e.ladder.length;j++) {
			for(int i=0; i<e.ladder[j].length;i++) {
				if(e.ladder[j][i] ==0) {
					System.out.print(" │ ");
				}else if(i!=0 && e.ladder[j][i] ==1 && e.ladder[j][i-1] ==1) {
					System.out.print(" ┤ ");
				}else if( i!= e.ladder.length -1 && e.ladder[j][i] ==1 && e.ladder[j][i+1] ==1) {
					System.out.print(" ├ ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("번호 선택[1~5]");
		e.x = scan.nextInt();
		
		e.x -=1;
		
		for(int i=0; i<e.ladder.length;i++) {
			for(int j=0; j<e.ladder.length;j++) {
				for(int k =0; k<e.ladder[j].length;k++) {
					if(j == e.y && k == e.x) {
						System.out.print(" * ");
					}else if(e.ladder[j][k] ==0	) {
						System.out.print(" │ ");
					}else if(k!= 0 && e.ladder[j][k] ==1 && e.ladder[j][k-1] ==1) {
						System.out.print (" ┤ ");
					}else if(k != e.ladder.length -1 && e.ladder[j][k] ==1 && e.ladder[j][k+1] ==1) {
						System.out.print(" ├ ");
					}
				}
				System.out.println();
				
			}
			System.out.println();
			
			if(e.x != e.ladder[0].length-1 && e.ladder[e.y][e.x]==1 && e.ladder[e.y][e.x+1]==1 ) {
				e.x+=1;
				for(int j=0; j<e.ladder.length;j++) {
					for(int k=0; k<e.ladder[j].length;k++) {
						if(j == e.y && k == e.x) {
							System.out.println(" * ");
						}else if(e.ladder[j][k] ==0	) {
							System.out.print(" │ ");
						}else if(k!= 0 && e.ladder[j][k] ==1 && e.ladder[j][k-1] ==1) {
							System.out.print (" ┤ ");
						}else if(k != e.ladder.length -1 && e.ladder[j][k] ==1 && e.ladder[j][k+1] ==1) {
							System.out.print(" ├ ");
						}
						
					}
					System.out.println();
				}
				System.out.println();
			}
			else if(e.x != 0 && e.ladder[e.y][e.x]==1 && e.ladder[e.y][e.x-1] ==1 ) {
				e.x-=1;
				for(int j=0; j<e.ladder.length;j++) {
					for(int k=0; k<e.ladder[j].length;k++) {
						if(j == e.y && k == e.x) {
							System.out.println(" * ");
						}else if(e.ladder[j][k] ==0	) {
							System.out.print(" │ ");
						}else if(k!= 0 && e.ladder[j][k] ==1 && e.ladder[j][k-1] ==1) {
							System.out.print (" ┤ ");
						}else if(k != e.ladder.length -1 && e.ladder[j][k] ==1 && e.ladder[j][k+1] ==1) {
							System.out.print(" ├ ");
						}
						
					}
					System.out.println();
				}
				System.out.println();
			}
			e.y +=1;
			
		}
		System.out.println("오늘의 점심메뉴는 \"" + e.menu[e.x] + "\" 입니다.");


		
		
		
	}

}
