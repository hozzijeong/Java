package ex;
//# 경마 게임
//5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다 
//이동한거리의 합이 20이상이면 도착 
//등수 출력 
//조건) 단! 동시도착 예외처리
// 숫자 이동처럼 하는것이 아님. 즉, horse[5][20]에서 20은 총 기회를 의미하는 것이고, 
// 그 안에서 [i][j] 라면, j에 +1~4를 더해서 제일 먼저 [i][j]의 값이 20이 되는 것을 찾는 프로그램. 


import java.util.Random;



public class Day18_Ex01_racegame {
	public static void main(String[] args) {

		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int [5]; 
		
		int count = 1; // 말의 등수를 확인할 변수 count
		
		for(int i=0;i <20; i++) {
			int check = 0; // 동시도착을 예외처리하기 위한 check; 
			for(int j=0; j<5; j++) {
				if(total[j] >=19) {
					horse[j][i] = 0;
				}else {
					int r = ran.nextInt(4)+1; // [i][j]에 들어갈 랜덤한 수 r
					horse[j][i] = r; // horse[j][i]에 r을 저장함으로써, 값을 표시
					total[j] += horse[j][i]; // total 값에 말의 이동거리를 누적해서 저장.
					if (total[j] >= 19) {
						rank[j] = count++; // total이 19가 넘은 순간부터 랭킹을 순서대로 랭킹을 매김 
						check +=1; // 동시 도착한 말이 있는지 체크
						if(check >=2) { // 동시도착한 말이 있으면 아예 초기회 시켜서 처음부터 다시 돌림. 
							i = 0;
							horse = new int [5][20];
							rank = new int [5];
							total = new int [5];
							count = 1;
							break;
							}
						}
					
					}
				}
			}
//		for(int i=0; i<5; i++) {
//			System.out.printf("%d번마 : %d등", i+1,rank[i]);
//			System.out.println();
//		}
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<20; j++) {
//				System.out.print(horse[i][j] +" ");
//			}
//			System.out.println();
//		}
		
		int[][] show = new int [5][20]; // 콘솔창에 나타낼 배열 show
		int [] index = new int [5]; // 말들의 위치를 나타낼 배열 index
		count = 0; // 말들의 위치를 나타낼 변수 0 
		int check = 0;
		while(true) {
			System.out.println("       ★★★★★★★★★★경마게임 "+(count+1)+"회차★★★★★★★★★★");
			for(int i=0; i<5;i++) {
				for(int j=0; j<20; j++) {
					if(show[i][j] == 0) {
						System.out.print("─ ");
					}else {
						System.out.print("㉲ ");
					}
				}
				System.out.println();
			}
			
			for(int i=0; i<5; i++) {
				show[i][index[i]] = 0;
				index[i] += horse[i][count];
				if(index[i] >=20) {
					index[i] = 19;
				}
				show[i][index[i]] = 1;
			}
			count +=1;
			
			if(count == 20)	{
				for(int i=0; i<5; i++) {
					System.out.printf("%d번마 : %d등", i+1,rank[i]);
					System.out.println();
				}
				break;
			}
			
			
			
		}
		
	}
		
}
