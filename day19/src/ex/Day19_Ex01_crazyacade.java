package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # ũ������ �����̵�
 * 1. ���� ũ��� 7 x 7 �̴�. 
 * 2. ��(8)��(2)��(4)��(6)�� �̵��� �����ϸ�,
 *    ��ź��ġ(5), ����(0)�� �����Ѵ�. 
 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
 *    ���� �� ���ڰ� ���·� ������.
 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
 * 
 * 6. �÷��̾��� �̵����⿡ ���� ������ �ش� �������� �̵����� ���Ѵ�.
 * 7. ��ź�� ���� ��� �� �ڿ� ������ �÷��̾�� ���� �ʴ´�. 
 * 8. �ʿ� ��ó���� ǥ�õǴ°��� ���� �÷��̾�
 * 9. ��ġ�ϴ� ���� ��ź�̰�, ���� �νŴٸ� 50%�� Ȯ���� �������� ����. 	
 * 10. ��ź�� ��ġ�� ���Ĵ�, �迭�� �̿��ؼ� ��ź�� ��ǥ�� �迭�� ������ ������, ���������� ��ź�� �Ͷ߸�. 
 */

public class Day19_Ex01_crazyacade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7; // ���� ũ�⸦ 7�� ����
		final int WALL = 3; // ���� 3�̶�� ����
		final int PLAYER = 2; // player�� 2�� ����
		final int BOMB = 9; // ��ź�� 9�� ����
		final int ITEM = 4; // �������� 4�� ���� 
		final int BOMBWAY = 5;

		boolean playerDead = false; // �÷��̾ ������ dead
		int bombMaxCount = 3; // �ִ� ��ġ ������ ��ź ����
		int bombCount = bombMaxCount; // ���� ��ź�� ���� 0�Ǹ� ���̻� ��ź��ġ �Ұ�. 
		int wallCount = 20; // ���� ����
		int itemCount = 0; // �������� ���� 
		int pX = 0; // �÷��̾��� x ��ǥ
		int pY = 0; // �÷��̾��� y ��ǥ 
		
		int[] time = new int [bombMaxCount]; // ��ź�� �����ϰ� �� �� ���� �ܻ� ó��. 
		
		int[] bombX = new int[bombMaxCount]; // ��ź�� X ��ǥ 
		int[] bombY = new int[bombMaxCount]; // ��ź�� Y ��ǥ 
		int[][] map = new int[SIZE][SIZE]; // �� ��ü ������ 
		
		int count = 0; // ��ź ���� ����
		int bomb_check = 0; // ��ź�� �Ͷ߷ȴ��� ���Ͷ߷ȴ��� Ȯ��
		
		// 1. ���� �÷��̾ �� �ȿ� ��ġ�ϱ�. 
		// 		1. 1���� �迭�ȿ� ���� �÷��̾ �����ѵ�, �ʿ� �ִ´�.
		
		System.out.println("[��ġ] ��ġ�� �� ���� ����:");
		int wall = scan.nextInt();
		
		if(wall>48 ) {
			System.out.println("[�޼���] ������ �� �ִ� ���� ������ �ʰ��߽��ϴ�.");
		}
		
		int [] temp = new int [wall+1]; // ���� ũ�� + ĳ���� ���� ������ ũ���� 1���� �迭�� �����.
		
		for(int i=0; i<temp.length;i++)	{
			if( i == 0) {
				temp[i] = PLAYER;
			}else {
				temp[i] = WALL;
			}
		} // ���� �÷��̾ ������ temp �ȿ� ����  �÷��̾� ���� ����. 
		
		for(int i=0; i<temp.length;i++) {
			int r1 = ran.nextInt(7);
			int r2 = ran.nextInt(7); // map�� �����ϰ� ���� ���� r1,r2�� ����
			
			if(map[r1][r2] == 0) {
				map[r1][r2] = temp[i]; // ���� ������ ��ġ�� �ڸ��� ��������� temp[i]�� ���ʴ�� ���� ����. 
				if(i ==0) {
					pX = r1;
					pY = r2;
					// �÷��̾��� ��ġ ��ŷ. 
				}
			}else {
				i-=1; // ���࿡ ���� ��ĭ�� ���� ������ �ٸ� ���� ����. 
			}
		}
		
//		for(int i=0; i<7; i++) {
//			for(int j=0 ;j<7; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		while(true) {
			System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ� ũ������ �����̵� �ڡ١ڡ١ڡ١ڡ١ڡ�");
			System.out.println("���� ����");
			System.out.println("��ġ("+pX+","+pY+")");
			System.out.println("�ִ� ��ź ����:"+ bombMaxCount);
			System.out.println("��ź ��ġ ���� ���� :" + bombCount);
			System.out.println("���� ������ ����:"+itemCount);
			
			for(int i=0; i<SIZE; i++) {
				int check = 0; // ��ź ������ �������� Ȯ��
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == 0) {
						System.out.print("�� ");
					}else if(map[i][j] ==PLAYER) {
						System.out.print("�� ");
					}else if(map[i][j] == WALL) {
						System.out.print("�� ");
					}else if(map[i][j] == BOMB) {
						System.out.print("�� ");
					}else if(map[i][j] == ITEM) {
						System.out.print("�� ");
					}else if(map[i][j] == BOMBWAY) {
						if(check >=1) {
						}
						System.out.print("D ");
						check +=1;
					}
				}
				System.out.println();
				System.out.println();
			} // �ֿܼ� ��Ÿ���� �� ����.
			
			
			
			
			System.out.println("    [8]��");
			System.out.println("[4]��\t[6]��");
			System.out.println("    [2]��");
			System.out.println("[5]��ź ��ġ [0]��ź ����");
			int sel = scan.nextInt();
			if(sel == 4) {
				if(pY-1 < 0) {
					continue;
				}
				if(map[pX][pY-1]== BOMB || map[pX][pY-1]== WALL) {
					continue;
				}else if(map[pX][pY-1]== ITEM) {
					map[pX][pY] = 0;
					map[pX][pY-1] = PLAYER;
					pY -=1;
					bombMaxCount +=1;
					continue;
				}else if(map[pX][pY] == BOMB) {
					map[pX][pY] = BOMB;
					map[pX][pY-1] = PLAYER;
					pY-=1;
					continue;
				}
				if(time[0] == 1) {
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == BOMBWAY) {
								map[i][j] = 0;
							}
						}
					}
					time[0] = 0;
					for(int i=0; i<bombMaxCount-1; i++) {
						time[i] = time[i+1];
					}
				}
				map[pX][pY] = 0;
				map[pX][pY-1] = PLAYER;
				pY-=1;
			}
			else if(sel ==6) {
				if(pY + 1 > 6) {
					continue;
				}
				if(map[pX][pY+1]== BOMB || map[pX][pY+1]== WALL) {
					continue;
				}else if(map[pX][pY+1]== ITEM) {
					map[pX][pY] = 0;
					map[pX][pY+1] = PLAYER;
					pY +=1;
					bombMaxCount +=1;
					continue;
				}else if(map[pX][pY] == BOMB) {
					map[pX][pY] = BOMB;
					map[pX][pY+1] = PLAYER;
					pY+=1;
					continue;
				}
				if(time[0] == 1) {
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == BOMBWAY) {
								map[i][j] = 0;
							}
						}
					}
					time[0] = 0;
					System.out.println("�ð� ����"+ time.length);
					for(int i=0; i<bombMaxCount-1; i++) {
						time[i] = time[i+1];
					}
				}
				map[pX][pY] = 0;
				map[pX][pY+1] = PLAYER;
				pY+=1;
			}
			else if(sel ==8) {
				if(pX-1 < 0) {
					continue;
				}
				if(map[pX-1][pY]== BOMB || map[pX-1][pY]== WALL) {
					continue;
				}else if(map[pX-1][pY]== ITEM) {
					map[pX][pY] = 0;
					map[pX-1][pY] = PLAYER;
					pX -=1;
					bombMaxCount +=1;
					continue;
				}else if(map[pX][pY] == BOMB) {
					map[pX][pY] = BOMB;
					map[pX-1][pY] = PLAYER;
					pX-=1;
					continue;
				}
				if(time[0] == 1) {
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == BOMBWAY) {
								map[i][j] = 0;
							}
						}
					}
					time[0] = 0;
					for(int i=0; i<bombMaxCount-1; i++) {
						time[i] = time[i+1];
					}
				}
				map[pX][pY] = 0;
				map[pX-1][pY] = PLAYER;
				pX-=1;
			}
			else if(sel ==2) {
				if(pX+1 >6) {
					continue;
				}
				if(map[pX+1][pY]== BOMB || map[pX+1][pY]== WALL) {
					continue;
				}else if(map[pX+1][pY]== ITEM) {
					map[pX][pY] = 0;
					map[pX+1][pY] = PLAYER;
					pX +=1;
					bombMaxCount +=1;
					continue;
				}else if(map[pX][pY] == BOMB) {
					map[pX][pY] = BOMB;
					map[pX+1][pY] = PLAYER;
					pX+=1;
					continue;
				}
				
				if(time[0] == 1) {
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == BOMBWAY) {
								map[i][j] = 0;
							}
						}
					}
					time[0] = 0;
					for(int i=0; i<bombMaxCount-1; i++) {
						time[i] = time[i+1];
					}
				}
				
				map[pX][pY] = 0;
				map[pX+1][pY] = PLAYER;
				pX+=1;
			}
			// ��������� ������
			/*
			 * [��ź��ġ]
			 *  ��ź�� �÷��̾��� ��ġ�� ��ġ�Ѵ�.
			 *  �÷��̾��� ���� ��ǥ�� 
			 * 	bombX -> pX
			 *  bombY -> pY �� ����. 
			 */
			else if(sel ==5) {
				if(count == bombMaxCount) {
					System.out.println("[�޼���]�� �̻� ��ġ�� �� �����ϴ�.");
					continue;
				}
				if(bombCount ==0) {
					System.out.println("[�޼���] ��ġ������ ��ź�� �����ϴ�.");
					continue;
				}
				
//				if(bomb_check ==1) {
//					count = 0;
//				} // ��ź�� �����ٸ�, ��ź ������ �ٽ� 0���� �ʱ�ȭ
				
				bombX[count] = pX;
				bombY[count] = pY;
				map[bombX[count]][bombY[count]] = 9;
				count +=1;
				bombCount -=1;
				bomb_check +=1; // ��ġ�� ��ź�� ����
			}
			/*
			 * ��ź ����.
			 * ��ź ������ ��� ��ġ�� ��ǥ ���� �¿� ���� 3�� �Ǿ���. 
			 * ����ó���� ��� ���� ���� �ٴٶ����� Ȥ�� ���� ����������
			 * �÷��̾ ���� �ݰ�ȿ� �ִٸ� ������ �״�� ����. 
			 * 50%�� Ȯ���� �������� ������. 
			 * 
			 */
			else if(sel ==0) {
				if(bomb_check ==0) {
					System.out.println("[�޼���]��ġ�� ��ź�� �����ϴ�.");
					continue;
				}
				bomb_check -=1; // ��ź�� �Ͷ߸��� �� ��ź���� -1;
				
			
				
				for(int i= -1; i<2; i++) {
					if(bombX[0] +i <0 || bombX[0] +i>SIZE-1) {
						continue;
					}
					if(map[bombX[0]+i][bombY[0]] == WALL) {
						int r = ran.nextInt(2); // �������� ������ Ȯ���� �����ϴ� ���� r
						//System.out.println("X"+wall_idxX);
						//System.out.println("xr" + r);
						if(r == 1) {
							map[bombX[0]+i][bombY[0]] = ITEM;
						}else {
							map[bombX[0]+i][bombY[0]] = BOMBWAY;
						}
					}else if(bombX[0]+i == PLAYER){
						playerDead= true;
					}
					else {
						map[bombX[0]+i][bombY[0]] = BOMBWAY;
					}
				}
				
				for(int i= -1; i<2; i++) {
					if(bombY[0] +i <0 || bombY[0] +i>SIZE-1) {
						continue;
					}
					
					if(map[bombX[0]][bombY[0]+i] == WALL) {
						System.out.println("(�¿�)����ġ = " + bombY[0] + i);
						int r = ran.nextInt(2); // �������� ������ Ȯ���� �����ϴ� ���� r
//						System.out.println("Y"+ wall_idxY);
//						System.out.println("yr" +r);
						if(r == 1) {
							map[bombX[0]][bombY[0]+i] = ITEM;
						}else {
							map[bombX[0]][bombY[0]+i] = BOMBWAY;
						}
					}else {
					map[bombX[0]][bombY[0]+i] = BOMBWAY;
					}
				}
				
				/* �ؾ�����
				 * 1. ��ź�� �����ϰ� ���� ���� �ܻ��� �ѹ� �����̰� ���� �ٽ� ������� �������� ok
				 * 2. ��ź�� �����ϰ� ������������, 50%�� Ȯ���� �������� ���������� ����.
				 * 3. �÷��̾ ��ź�濡 �� ������ �״� �ٴ� �ż��� ���� �������. 
				 * 4. �������� ������ ��ź MAX�� �þ�� �׿����� ��ź�� ���� ������ �����ϴ� ��  �߰�. 
				 */
				// ��ź ������, ��ź �迭�� ��Ȳ.
				// ��ź�� �������� ���߱��� ����
				// ������������ 0,0 �� ����ְ� �Ʒ� �̷��� �־�����ϱ�, ��ź ��ġ�� ���� �ʾҴµ��� bomb 0 0 �� üũ �ǹ����� ����.
				// �ϳ��� ������ �߰��ؾ���. ��..... ��ź�� ������, ��ġ, ���ƴٴϴ� �Ͷ߸�, �Ͷ߸��� ���ÿ� �Ʒ� ������ �����ϱ� ���ؼ��� ���� ��ź�� ��ġ�Ǿ� �־����. 
				time[0] = 1; // ��ź�� �Ͷ߸��� ����, �ð��� 1�� �ٲ㼭 ������� ���� ��� ���� ����. 
				
				for(int i=0; i<count-1;i++) {
					bombX[i] = bombX[i+1];
					bombY[i] = bombY[i+1];
				}
				count -=1;
			}
		}
	}
}
