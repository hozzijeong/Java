package ex;
/*
 * # 스네이크 게임
 * 1. 10x10 배열을 0으로 채운다.
 * 2. 스네이크는 1234로 표시한다.
 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
 * 4. 자기몸하고 부딪히면, 사망한다.
 * 5. 랜덤으로 아이템을 생성해
 *    아이템을 먹으면 꼬리 1개가 자란다.
 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
 */

import java.util.Random;
import java.util.Scanner;

public class Day21_Ex01_snake {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int ITEM = 9;
		int count = 4;
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int[] x = new int[count];
		int[] y = new int[count];
		int[] snake = new int[count];
		
		for(int i=0; i<4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
			snake[i] = map[y[i]][x[i]];
		}
		
		int r = ran.nextInt(10);
		int [] temp = new int [r];
		
		for(int i =0; i<r; i++) {
			temp[i] = ITEM;
		}
		
		for(int i=0; i<r; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			
			if(map[r1][r2] == 0) {
				map[r1][r2] = ITEM;
			}else {
				i-=1;
			}
		}
		
		boolean run = true;
		while(run) {
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == 9) {
						System.out.print("★  ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("4)left 6)right 8)up 2)down : ");
			int sel = scan.nextInt();
			
			int yy = y[0];
			int xx = x[0];
			
			
			if(sel == 4) { xx = xx - 1; }
			else if(sel == 6) { xx = xx + 1; }
			else if(sel == 8) { yy = yy - 1; }
			else if(sel == 2) {	yy = yy + 1;}

			// 예외처리
			
			if(size <= yy || yy < 0) continue;
			if(size <= xx || xx < 0) continue;
			if(map[yy][xx] != 0) {
				if(map[yy][xx] ==9) {
					if(count <8) {
						count+=1;
						int[] temp_y = y;
						int[]temp_x = x;
						y = new int [count];
						x = new int [count];
						snake = new int [count];
						for(int i=0; i<count-1;i++) {
							y[i] = temp_y[i];
							x[i] = temp_x[i];
							map[y[i]][x[i]] = i+1;
						}
						map[y[count-1]][x[count-1]] = count;
						for(int i=0; i<count; i++) {
							snake[i] = map[y[i]][x[i]];
						}
						
						temp_y = null;
						temp_x = null;
					}else {
						System.out.println("[메세지] 더이상 아이템을 먹을 수 없습니다.");
						continue;
					}
				}
				else {
					run = false;
				}
			}
			int [] body_y = new int [snake.length];
			int [] body_x = new int [snake.length];

			for(int i=0; i<snake.length;i++) {
				body_y[i] = y[i];
				body_x[i] = x[i];
			}
			y[0] =yy;
			x[0] =xx;
			for(int i=0; i<snake.length-1;i++) {
				y[i+1] = body_y[i];
				x[i+1] = body_x[i];
			}
			for(int i=0; i<snake.length;i++) {
				map[y[i]][x[i]] = i+1;
				map[body_y[snake.length-1]][body_x[snake.length-1]] =0;
				
			}
			
			
		}
		
		System.out.println("[메세지] 뱀 사망.");

	}
}











