package ex;

import java.util.Random;

public class Day18_Ex_racegame {
	public static void main(String[] args) {
		int horse[][] = new int[5][20]; // 경기장 배열
		Random ran = new Random();
		int max = 20; // 최대 사이즈
		int rank[] = new int[5]; // 말들의 순위를 매기는 배열
		
 		int total[] = new int[5]; // 말들의 위치를 저장하는 배열 
		
		
		
		boolean run = true;
		int count = 1;
		
		
		// 코드 진행 순서가, 로직 먼저 짜고, 결과를보여주는 형식. 
		
		for (int i = 0; i < 20; i++) {
			int check = 0;
			for (int n = 0; n < 5; n++) {
				if (total[n] >= 19) {
					horse[n][i] = 0;
					// horse의 위치들이 19를 넘어갔을때 전부 0으로 바꿔줌. 
				} else {
					int r = ran.nextInt(4) + 1;
					horse[n][i] = r;
					total[n] = total[n] + horse[n][i];
					if (total[n] >= 19) {
						rank[n] = count++;
						check += 1;
						// n번째 말이 결승점에 도착했을때, n번째 말에게 점수를 매김. 
						// 1마리 들어왔다는 check를 함. 
						
						if (check >= 2) {
							
							i = 0;
							horse = new int[5][20];
							total = new int[5];
							rank = new int[5];
							count = 1;
							break;
							// 동시에 들어온 말이 있다면, 아예 초기화를 해버림. 
						}
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			// System.out.println(total[i]);
			System.out.println(rank[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 20; n++) {
				System.out.print(horse[i][n]);
			}
			System.out.println();
		}

		int show[][] = new int[5][20];
		int index[] = new int[5];
		run = true;
		count = 0;
		while (run) {
			for (int i = 0; i < 5; i++) {
				for (int n = 0; n < 20; n++) {
					if (show[i][n] == 0) {
						System.out.print("[ ]");
					} else {
						System.out.print("[읏]");
					}
				}
				System.out.println("");
			}
			System.out.println("===============");
			for (int n = 0; n < 5; n++) {
				 show[n][index[n]] = 0;
				 index[n] += horse[n][count]; 
				 if(index[n] >= 20) index[n] = 19;
				 show[n][index[n]] = 1;
				 
			}
			
			
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			
			
			count += 1;
			if (count == 20)
				break;
		}

	}
}
