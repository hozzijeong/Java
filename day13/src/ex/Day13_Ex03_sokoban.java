package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * ���ڹ�
 * ���� ���� ����
 * 
 * ���� ��ġ ���� (���� 1�� ���)
 * ���� ��ġ ���� (���� 3���� ���)
 * �÷��̾��� ��ġ ���� (�÷��̾�� 2�� ���)
 * ��������(���������� 4�� ���)	
 * 
 * ����ó���� �Ű澵�� (���� ���� ��������, �÷��̾ ���� �������� ���)
 * �������� ��찡 ������ ������, ���� ����� �ϴ� ��찡 ���� ����.
 * 
 * ���� ũ��� 7x7�� �Ұ�. 
 *  
 *  
 */
public class Day13_Ex03_sokoban {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int size = 7;
		int [][] soko = new int[7][7];
		
		System.out.println("������ �� ���� �Է�:");
		int wall = scan.nextInt();
		
		
		int[] temp = new int[3];
		// ���ֵ�(��,�÷��̾�, ���������� ���� �س���, ���� ������ �߰������� ��������.
		
		for(int i=0; i<temp.length;i++) {
			int r = ran.nextInt(3)+2;
			temp[i] = r;
			int check = 1;
			for(int j=0;j<i;j++) {
				if(temp[j] == temp[i]) {
					check = -1;
				}
			}
			if(check ==-1) {
				i--;
			}
		}
		// temp �ȿ� �ߺ����� ���� �� 2,3,4 �� ������.
		int[] unit = new int[temp.length+wall];
		
		for(int i=0; i<unit.length;i++) {
			if(i<3) {
				unit[i] = temp[i];
			}else {
				unit[i] = 1;
			}
		}
		// temp�ȿ� ����� ���� �켱������ unit�� �ű��, ������ �迭���� 1�� ä�� ����. 
		
		for(int i=0; i<unit.length;i++) {
			System.out.print(unit[i]+" ");
		}
		System.out.println();

		
		/*
		 * �ؾ�����
		 * 1. unit�� �ִ� ���ڵ��� soko�ȿ� �������� ���� �־����.
		 * 2. �������� ���� �־�����, �÷��̾�, ��, ������ ������ �����ϰ�, ��� ���������� ����
		 * 3. 4�� ���� 6�� ������ 8�� ���� 2�� �Ʒ��� ����. 
		 * 4. �ϴ��� �������...
		 * 
		 */

		int[][]temp1 = new int [unit.length][2];
		// unit���� soko��ķ� �Ѿ ��, �ε����� ������ �ߺ��� �Ǵ°��� �ȵǴ� �� Ȯ��. 
		
		
		for(int i=0; i<unit.length;i++) {
			int r1 = ran.nextInt(7); 
			int r2 = ran.nextInt(7);
			soko[r1][r2] = unit[i];
			//soko �� �� � ������ ��ǥ 2���� ���� �ѵ�, �� �� �ȿ� unit[i] ����.
			
			
			temp1[i][0] = r1;
			temp1[i][1] = r2;
			// temp1�� i��°�� ù��° �ε�����  r1, �ι�° �ε����� r2���� ����. 
			
			int check = 1;
			int j=0;
			
			while(j<i) {
				if(temp1[i][0] == temp1[j][0] && temp1[i][1] == temp1[j][1]) {
					check = -1;
					soko[r1][r2] = unit[j]; // ������ �̹� soko[r1][r2]�� unint[i]�� �����߱� ������, soko[r1][r2]�� unit[i]�� ���� �Ǿ�����
					// ���� �� ���� ������ �ִ� ���� unit[j]�� �ٽ� �־������ν� ���ڰ� �ٲ�� ���� ����!
				}
				j+=1;
			}
			
			if(check ==-1) {
				i-=1;
			}
			
		}
		
		System.out.println();
		
		int player_x = 0;
		int player_y = 0;
		int ball_x = 0;
		int ball_y = 0;
		
		for(int i=0; i<size;i++	) {
			for(int j=0; j<size;j++) {
				if(soko[i][j] == 2) {
					player_y = i;
					player_x = j;
				}else if(soko[i][j] == 3) {
					ball_y = i;
					ball_x = j;
				}
			}
		}
		// ���� �÷��̾��� ��ġ��, ���� ��ġ�� ������ ���� �����Ͽ�, �����ӿ� �־ ��ǥ ������ �����ϰ� ����
		
		
		
		int goal = 0; // �������� goal�� ���� ���θ� Ȯ���ϱ� ���� ����
		while(true) {
			System.out.println("======= SOKOBAN =======");
			for(int i=0; i<size;i++) {
				for(int j=0; j<size; j++) {
					if(soko[i][j] ==0) {
						System.out.print("+ ");
					}else if(soko[i][j] ==1) {
						System.out.print("�� ");
					}else if(soko[i][j] == 2) {
						System.out.print("P ");
					}else if(soko[i][j] ==3) {
						System.out.print("O "); 
					}else if(soko[i][j] ==4) {
						System.out.print("G ");
					}
				}
				System.out.println();
			}
			System.out.println("     [8]��");
			System.out.println("[4]���� \t [6]������");
			System.out.println("     [2]�Ʒ�");
			int move = scan.nextInt();
			
			/*
			 * ����ó���� �ϴ� ���
			 * 1. �÷��̾ ���� ��������.
			 * 2. �÷��̾ �̵���Ű�� ���� ���� ��������.
			 * 3. �÷��̾��� �̵� ������ 0~6�� ��� ��.
			 * 
			 */
			
			if(move ==4) {
				if(player_x-1>=0) {
					if(soko[player_y][player_x-1] == 1) {
						continue;
					}
					if(soko[player_y][player_x-1] ==3) {
						if(ball_x-1>=0) {
							if(soko[ball_y][ball_x-1] == 1) {
								continue;
							}
							// player�� ���ʿ� ball�� �ִ� ��Ȳ����, ball�� ������ ���̶�� continue;
							if(soko[ball_y][ball_x-1] ==4) {
								goal = 1;
							}
							//ball �� ���������� 4�� ������ goal �� ���� ����.
							
							soko[ball_y][ball_x-1] =3;
							soko[ball_y][ball_x] = 0;
							ball_x-=1;
							// ball�� �������� �������� ��ĭ ���� ��������. 
						}
					}
					soko[player_y][player_x-1] =2;
					soko[player_y][player_x] = 0;
					player_x-=1;
				}
			}else if(move ==6) {
				if(player_x+1<7) {
					if(soko[player_y][player_x+1] == 1) {
						continue;
					}
					if(soko[player_y][player_x+1] ==3) {
						if(ball_x+1<7) {
							if(soko[ball_y][ball_x+1] == 1) {
								continue;
							}
							// player�� ������ ball�� �ִ� ��Ȳ����, ball�� ������ ���̶�� continue;
							if(soko[ball_y][ball_x+1] ==4) {
								goal = 1;
							}
							//ball �� ���������� 4�� ������ goal �� ���� ����.
							
							soko[ball_y][ball_x+1] =3;
							soko[ball_y][ball_x] = 0;
							ball_x+=1;
							// ball�� �������� ���������� ��ĭ ���� ��������. 
						}
					}
					soko[player_y][player_x+1] =2;
					soko[player_y][player_x] = 0;
					player_x+=1;
					// ball�� ���� ��Ȳ�̸� player�� ������.
				}
				
			}else if(move == 2) {
				if(player_y+1<7) {
					if(soko[player_y+1][player_x] == 1) {
						continue;
					}
					if(soko[player_y+1][player_x] ==3) {
						if(ball_y+1<7) {
							if(soko[ball_y+1][ball_x] == 1) {
								continue;
							}
							// player�� ���ʿ� ball�� �ִ� ��Ȳ����, ball�� ������ ���̶�� continue;
							if(soko[ball_y+1][ball_x] ==4) {
								goal = 1;
							}
							//ball �� ���������� 4�� ������ goal �� ���� ����.
							
							soko[ball_y+1][ball_x] =3;
							soko[ball_y][ball_x] = 0;
							ball_y+=1;
							// ball�� �������� �������� ��ĭ ���� ��������. 
						}
					}
					soko[player_y+1][player_x] =2;
					soko[player_y][player_x] = 0;
					player_y+=1;
				}
			}else if(move == 8) {
				if(player_y-1>=0) {
					if(soko[player_y-1][player_x] == 1) {
						continue;
					}
					if(soko[player_y-1][player_x] ==3) {
						if(ball_x-1>=0) {
							if(soko[ball_y-1][ball_x] == 1) {
								continue;
							}
							// player�� �Ʒ��ʿ� ball�� �ִ� ��Ȳ����, ball�� �Ʒ����� ���̶�� continue;
							if(soko[ball_y-1][ball_x] ==4) {
								goal = 1;
							}
							//ball �� ���������� 4�� ������ goal �� ���� ����.
							
							soko[ball_y-1][ball_x] =3;
							soko[ball_y][ball_x] = 0;
							ball_x-=1;
							// ball�� �������� �Ʒ������� ��ĭ ���� ��������. 
						}
					}
					soko[player_y-1][player_x] =2;
					soko[player_y][player_x] = 0;
					player_y-=1;
				}
				
			}
			
			if(goal ==1) {
				System.out.println("Goal!!");
				break;
			}
			
			
			
			
			
		}
	}
}
