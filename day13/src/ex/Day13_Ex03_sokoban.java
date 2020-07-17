package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * 소코반
 * 벽의 개수 랜덤
 * 
 * 벽의 위치 랜덤 (벽은 1로 취급)
 * 공의 위치 랜덤 (공은 3으로 취급)
 * 플레이어의 위치 랜덤 (플레이어는 2로 취급)
 * 골인지점(골인지점은 4로 취급)	
 * 
 * 예외처리에 신경쓸것 (공이 벽을 만났을때, 플레이어가 벽을 만났을때 등등)
 * 여러가지 경우가 나오기 때문에, 게임 재실행 하는 경우가 자주 생김.
 * 
 * 맵의 크기는 7x7로 할것. 
 *  
 *  
 */
public class Day13_Ex03_sokoban {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int size = 7;
		int [][] soko = new int[7][7];
		
		System.out.println("생성할 벽 개수 입력:");
		int wall = scan.nextInt();
		
		
		int[] temp = new int[3];
		// 유닛들(공,플레이어, 골인지점을 설정 해놓고, 벽의 개수를 추가적으로 넣을예정.
		
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
		// temp 안에 중복되지 않은 수 2,3,4 를 저장함.
		int[] unit = new int[temp.length+wall];
		
		for(int i=0; i<unit.length;i++) {
			if(i<3) {
				unit[i] = temp[i];
			}else {
				unit[i] = 1;
			}
		}
		// temp안에 저장된 수를 우선적으로 unit에 옮기고, 나머지 배열에는 1로 채워 넣음. 
		
		for(int i=0; i<unit.length;i++) {
			System.out.print(unit[i]+" ");
		}
		System.out.println();

		
		/*
		 * 해야할일
		 * 1. unit에 있는 숫자들을 soko안에 랜덤으로 집어 넣어야함.
		 * 2. 랜덤으로 집어 넣었을때, 플레이어, 볼, 골인을 변수로 지정하고, 어떻게 움직일지를 생각
		 * 3. 4는 왼쪽 6은 오른쪽 8은 위에 2는 아래로 선택. 
		 * 4. 일단은 여기까지...
		 * 
		 */

		int[][]temp1 = new int [unit.length][2];
		// unit에서 soko행렬로 넘어갈 때, 인덱스의 숫자중 중복이 되는곳과 안되는 곳 확인. 
		
		
		for(int i=0; i<unit.length;i++) {
			int r1 = ran.nextInt(7); 
			int r2 = ran.nextInt(7);
			soko[r1][r2] = unit[i];
			//soko 에 들 어갈 랜덤한 좌표 2개를 생성 한뒤, 그 값 안에 unit[i] 저장.
			
			
			temp1[i][0] = r1;
			temp1[i][1] = r2;
			// temp1의 i번째에 첫번째 인덱스에  r1, 두번째 인덱스에 r2값을 저장. 
			
			int check = 1;
			int j=0;
			
			while(j<i) {
				if(temp1[i][0] == temp1[j][0] && temp1[i][1] == temp1[j][1]) {
					check = -1;
					soko[r1][r2] = unit[j]; // 위에서 이미 soko[r1][r2]에 unint[i]를 저장했기 때문에, soko[r1][r2]는 unit[i]가 저장 되어있음
					// 따라서 이 값을 이전에 있던 값인 unit[j]를 다시 넣어줌으로써 숫자가 바뀌는 것을 방지!
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
		// 현재 플레이어의 위치와, 공의 위치를 변수에 각각 저장하여, 움직임에 있어서 좌표 변경이 가능하게 설정
		
		
		
		int goal = 0; // 목적지인 goal에 도달 여부를 확인하기 위한 변수
		while(true) {
			System.out.println("======= SOKOBAN =======");
			for(int i=0; i<size;i++) {
				for(int j=0; j<size; j++) {
					if(soko[i][j] ==0) {
						System.out.print("+ ");
					}else if(soko[i][j] ==1) {
						System.out.print("■ ");
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
			System.out.println("     [8]위");
			System.out.println("[4]왼쪽 \t [6]오른쪽");
			System.out.println("     [2]아래");
			int move = scan.nextInt();
			
			/*
			 * 예외처리를 하는 경우
			 * 1. 플레이어가 벽을 만났을때.
			 * 2. 플레이어가 이동시키는 공이 벽을 만났을때.
			 * 3. 플레이어의 이동 방향이 0~6을 벗어날 때.
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
							// player의 왼쪽에 ball이 있는 상황에서, ball의 좌측이 벽이라면 continue;
							if(soko[ball_y][ball_x-1] ==4) {
								goal = 1;
							}
							//ball 을 움직였을때 4를 만나면 goal 즉 게임 종료.
							
							soko[ball_y][ball_x-1] =3;
							soko[ball_y][ball_x] = 0;
							ball_x-=1;
							// ball의 움직임을 왼쪽으로 한칸 같이 움직여줌. 
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
							// player의 오른에 ball이 있는 상황에서, ball의 우측이 벽이라면 continue;
							if(soko[ball_y][ball_x+1] ==4) {
								goal = 1;
							}
							//ball 을 움직였을때 4를 만나면 goal 즉 게임 종료.
							
							soko[ball_y][ball_x+1] =3;
							soko[ball_y][ball_x] = 0;
							ball_x+=1;
							// ball의 움직임을 오른쪽으로 한칸 같이 움직여줌. 
						}
					}
					soko[player_y][player_x+1] =2;
					soko[player_y][player_x] = 0;
					player_x+=1;
					// ball이 없는 상황이면 player만 움직임.
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
							// player의 위쪽에 ball이 있는 상황에서, ball의 위쪽이 벽이라면 continue;
							if(soko[ball_y+1][ball_x] ==4) {
								goal = 1;
							}
							//ball 을 움직였을때 4를 만나면 goal 즉 게임 종료.
							
							soko[ball_y+1][ball_x] =3;
							soko[ball_y][ball_x] = 0;
							ball_y+=1;
							// ball의 움직임을 위쪽으로 한칸 같이 움직여줌. 
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
							// player의 아래쪽에 ball이 있는 상황에서, ball의 아래쪽이 벽이라면 continue;
							if(soko[ball_y-1][ball_x] ==4) {
								goal = 1;
							}
							//ball 을 움직였을때 4를 만나면 goal 즉 게임 종료.
							
							soko[ball_y-1][ball_x] =3;
							soko[ball_y][ball_x] = 0;
							ball_x-=1;
							// ball의 움직임을 아래쪽으로 한칸 같이 움직여줌. 
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
