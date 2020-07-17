package ex02_array;

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


public class Repeat_Ex_array12_find_minimum {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for(int i=0; i<4; i++) {
			int idx= ran.nextInt(4)+1;
			arr[i] = idx;
			if(check[idx-1] == 0) {
				check[idx-1] = 1;
			}else {
				i-=1;
			}
		}
		int m = 0;
		int cnt = 1;
		while(m<4) {
			for(int i=0; i<4; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			System.out.println("입력:");
			int num = scan.nextInt();
		
			if(arr[num] == cnt) {
				arr[num] = 9;
				cnt+=1;
				m+=1;
			}
			
		}

	}
}
