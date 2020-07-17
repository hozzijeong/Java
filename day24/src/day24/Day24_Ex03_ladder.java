package day24;

import java.util.Scanner;

class Ladder{
	Scanner scan = new Scanner(System.in);
	int[][] ladder = { 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 2, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 0, 0, 0, 0 } 
	};
	int x = 0;
	int y = 0;
	
	String menu = "";
	
	void showLadder() {
		System.out.println(" 1  2  3  4  5");
		for(int i=0; i<ladder.length;i++) {
			for(int j=0; j<ladder[i].length;j++) {
				if(ladder[i][j] ==0) {
					if(x ==i && y ==j) {
						System.out.print(" * ");
					}else {
						System.out.print(" �� ");
					}
				}else if(ladder[i][j] ==1) {
					if(x ==i && y ==j) {
						System.out.print(" * ");
					}else {
						System.out.print(" �� ");
					} 
				}else if(ladder[i][j] ==2) {
					if(x ==i && y ==j	) {
						System.out.print(" * ");
					}else {
						System.out.print(" �� ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("��� ���� ġŲ ���� ����");
		System.out.println();
	}
	
	void moveLadder() {
		showLadder();
		
		while(true) {
			
			if(ladder[x][y] == 0) {
				x +=1;
				showLadder();
			}else if(ladder[x][y] ==1) {
				y+=1;
				showLadder();
				x+=1;
			}else if(ladder[x][y] ==2) {
				y-=1;
				showLadder();
				x+=1;
			}
			
			if(x ==7) {
				break;
			}
		}
	}
	
	void setMenu() {
		if(y ==0) {
			menu = "���";
		}else if(y ==1) {
			menu = "����";
		}else if(y ==2) {
			menu = "ġŲ";
		}else if(y ==3) {
			menu = "����";
		}else if(y ==4) {
			menu = "����";
		}
	}
	
	void run() {
		
		showLadder();
		
		x = 0;
		y = 0;
		
		System.out.println("��ȣ ����[1~5]");
		y = scan.nextInt()-1;
		
		moveLadder();
		
		setMenu();
		System.out.println("���� ������" + menu+"��");
	}

}
public class Day24_Ex03_ladder {
	public static void main(String[] args) {
		
		Ladder l = new Ladder();
		
		l.run();
	}
}
