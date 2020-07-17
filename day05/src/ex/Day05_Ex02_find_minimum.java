package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 */


public class Day05_Ex02_find_minimum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
			
		int i = 0;
		while (i<4) {
			int r = ran.nextInt(4);
			if(check[r] == 0) {
				check[r] =1;
				arr[i] = r+1;
				i+=1;
			}
		}
		
		i = 0;
		int cnt = 1;
		
		while(i<4) {
			for(int j =0; j<4; j++) {
				System.out.print(arr[j]+ " ");
			}
			System.out.println();
			System.out.println("입력: ");
			int idx = scan.nextInt();
			
			if(arr[idx] == cnt) {
				arr[idx] = 9;
				cnt+=1;
				i+=1;
			}
			
		}
		
		
	}
}

