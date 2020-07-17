package ex;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */

public class Day04_Ex12_array_forbid_same_num {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			int r = ran.nextInt(5);
			arr[i] = r;
			if(check[r] == 0) {
				check[r] =1;
			}else {
				i-=1;
			}
		}
		for( int i = 0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
