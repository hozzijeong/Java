package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 크레이지 아케이드
 * 1. 맵의 크기는 7 x 7 이다. 
 * 2. 상(8)하(2)좌(4)우(6)로 이동이 가능하며,
 *    폭탄설치(5), 폭파(0)로 설정한다. 
 * 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
 * 4. 단, 폭탄이 설치된 순서대로 터져야 하며,
 *    폭파 시 십자가 형태로 터진다.
 * 5. 벽 파괴시 아이템이 랜덤하게 생성되어,
 *    아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
 * 
 * 6. 플레이어의 이동방향에 벽이 있으면 해당 방향으로 이동하지 못한다.
 * 7. 폭탄이 터질 경우 벽 뒤에 있으면 플레이어는 죽지 않는다. 
 * 8. 맵에 맨처음에 표시되는것은 벽과 플레이어
 * 9. 설치하는 것은 폭탄이고, 벽을 부신다면 50%의 확률로 아이템이 나옴. 	
 * 10. 폭탄의 설치와 폭파는, 배열을 이용해서 폭탄의 좌표를 배열에 저장한 다음에, 순차적으로 폭탄을 터뜨림. 
 */

public class Day19_Ex01_crazyacade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7; // 맵의 크기를 7로 제한
		final int WALL = 3; // 벽을 3이라고 정의
		final int PLAYER = 2; // player를 2로 정의
		final int BOMB = 9; // 폭탄을 9로 정의
		final int ITEM = 4; // 아이템은 4로 정의 
		final int BOMBWAY = 5;

		boolean playerDead = false; // 플레이어가 죽으면 dead
		int bombMaxCount = 3; // 최대 설치 가능한 폭탄 개수
		int bombCount = bombMaxCount; // 현재 폭탄의 개수 0되면 더이상 폭탄설치 불가. 
		int wallCount = 20; // 벽의 개수
		int itemCount = 0; // 아이템의 개수 
		int pX = 0; // 플레이어의 x 좌표
		int pY = 0; // 플레이어의 y 좌표 
		
		int[] time = new int [bombMaxCount]; // 폭탄이 폭발하고 난 뒤 남는 잔상 처리. 
		
		int[] bombX = new int[bombMaxCount]; // 폭탄의 X 좌표 
		int[] bombY = new int[bombMaxCount]; // 폭탄의 Y 좌표 
		int[][] map = new int[SIZE][SIZE]; // 맵 전체 사이즈 
		
		int count = 0; // 폭탄 개수 세기
		int bomb_check = 0; // 폭탄을 터뜨렸는지 안터뜨렸는지 확인
		
		// 1. 벽과 플레이어를 맵 안에 배치하기. 
		// 		1. 1차원 배열안에 벽과 플레이어를 저장한뒤, 맵에 넣는다.
		
		System.out.println("[설치] 설치할 벽 개수 설정:");
		int wall = scan.nextInt();
		
		if(wall>48 ) {
			System.out.println("[메세지] 생성할 수 있는 벽의 개수를 초과했습니다.");
		}
		
		int [] temp = new int [wall+1]; // 벽의 크기 + 캐릭터 까지 감안한 크기의 1차원 배열은 만든다.
		
		for(int i=0; i<temp.length;i++)	{
			if( i == 0) {
				temp[i] = PLAYER;
			}else {
				temp[i] = WALL;
			}
		} // 벽과 플레이어를 저장할 temp 안에 벽과  플레이어 값을 저장. 
		
		for(int i=0; i<temp.length;i++) {
			int r1 = ran.nextInt(7);
			int r2 = ran.nextInt(7); // map에 랜덤하게 넣을 숫자 r1,r2를 생성
			
			if(map[r1][r2] == 0) {
				map[r1][r2] = temp[i]; // 맵의 랜덤한 위치의 자리가 비어있으면 temp[i]를 차례대로 집어 넣음. 
				if(i ==0) {
					pX = r1;
					pY = r2;
					// 플레이어의 위치 마킹. 
				}
			}else {
				i-=1; // 만약에 맵의 빈칸에 값이 있으면 다른 수를 저장. 
			}
		}
		
//		for(int i=0; i<7; i++) {
//			for(int j=0 ;j<7; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		while(true) {
			System.out.println("★☆★☆★☆★☆★☆ 크레이지 아케이드 ★☆★☆★☆★☆★☆");
			System.out.println("나의 정보");
			System.out.println("위치("+pX+","+pY+")");
			System.out.println("최대 폭탄 개수:"+ bombMaxCount);
			System.out.println("폭탄 설치 가능 개수 :" + bombCount);
			System.out.println("현재 아이템 개수:"+itemCount);
			
			for(int i=0; i<SIZE; i++) {
				int check = 0; // 폭탄 터졌나 안터졌나 확인
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == 0) {
						System.out.print("┼ ");
					}else if(map[i][j] ==PLAYER) {
						System.out.print("읏 ");
					}else if(map[i][j] == WALL) {
						System.out.print("■ ");
					}else if(map[i][j] == BOMB) {
						System.out.print("○ ");
					}else if(map[i][j] == ITEM) {
						System.out.print("● ");
					}else if(map[i][j] == BOMBWAY) {
						if(check >=1) {
						}
						System.out.print("D ");
						check +=1;
					}
				}
				System.out.println();
				System.out.println();
			} // 콘솔에 나타나는 맵 설정.
			
			
			
			
			System.out.println("    [8]상");
			System.out.println("[4]좌\t[6]우");
			System.out.println("    [2]하");
			System.out.println("[5]폭탄 설치 [0]폭탄 폭파");
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
					System.out.println("시간 길이"+ time.length);
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
			// 여기까지가 움직임
			/*
			 * [폭탄설치]
			 *  폭탄은 플레이어의 위치에 설치한다.
			 *  플레이어의 현재 좌표를 
			 * 	bombX -> pX
			 *  bombY -> pY 에 저장. 
			 */
			else if(sel ==5) {
				if(count == bombMaxCount) {
					System.out.println("[메세지]더 이상 설치할 수 없습니다.");
					continue;
				}
				if(bombCount ==0) {
					System.out.println("[메세지] 설치가능한 폭탄이 없습니다.");
					continue;
				}
				
//				if(bomb_check ==1) {
//					count = 0;
//				} // 폭탄이 터졌다면, 폭탄 개수를 다시 0으로 초기화
				
				bombX[count] = pX;
				bombY[count] = pY;
				map[bombX[count]][bombY[count]] = 9;
				count +=1;
				bombCount -=1;
				bomb_check +=1; // 설치된 폭탄의 개수
			}
			/*
			 * 폭탄 폭파.
			 * 폭탄 폭파의 경우 설치한 좌표 기준 좌우 합이 3이 되야함. 
			 * 예외처리의 경우 맵의 끝에 다다랐을때 혹은 벽을 폭파했을때
			 * 플레이어가 폭파 반경안에 있다면 게임은 그대로 종료. 
			 * 50%의 확률로 아이템이 떨어짐. 
			 * 
			 */
			else if(sel ==0) {
				if(bomb_check ==0) {
					System.out.println("[메세지]설치된 폭탄이 없습니다.");
					continue;
				}
				bomb_check -=1; // 폭탄을 터뜨리면 그 폭탄개수 -1;
				
			
				
				for(int i= -1; i<2; i++) {
					if(bombX[0] +i <0 || bombX[0] +i>SIZE-1) {
						continue;
					}
					if(map[bombX[0]+i][bombY[0]] == WALL) {
						int r = ran.nextInt(2); // 아이템이 떨어질 확률을 설정하는 변수 r
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
						System.out.println("(좌우)벽위치 = " + bombY[0] + i);
						int r = ran.nextInt(2); // 아이템이 떨어질 확률을 설정하는 변수 r
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
				
				/* 해야할일
				 * 1. 폭탄이 폭파하고 난뒤 남는 잔상을 한번 움직이고 나면 다시 원래대로 돌려놓기 ok
				 * 2. 폭탄이 폭파하고 벽을만났을때, 50%의 확률로 아이템이 떨어지도록 만듦.
				 * 3. 플레이어가 폭탄길에 서 있으면 죽는 다는 거서을 새로 만들어줌. 
				 * 4. 아이템을 먹으면 폭탄 MAX가 늘어나고 그에따른 폭탄의 현재 개수도 증가하는 것  추가. 
				 */
				// 폭탄 폭파후, 폭탄 배열의 상황.
				// 폭탄의 순차적인 폭발까지 구현
				// 무조건적으로 0,0 을 집어넣고 아래 이렇게 넣어버리니까, 폭탄 설치를 하지 않았는데도 bomb 0 0 이 체크 되버리는 것임.
				// 하나의 조건을 추가해야함. 어..... 폭탄이 터지고, 설치, 돌아다니다 터뜨림, 터뜨리는 동시에 아래 조건이 만족하기 위해서는 다음 폭탄이 설치되어 있어야함. 
				time[0] = 1; // 폭탄을 터뜨리고 나면, 시간을 1로 바꿔서 순서대로 원래 길로 돌려 놓음. 
				
				for(int i=0; i<count-1;i++) {
					bombX[i] = bombX[i+1];
					bombY[i] = bombY[i+1];
				}
				count -=1;
			}
		}
	}
}
