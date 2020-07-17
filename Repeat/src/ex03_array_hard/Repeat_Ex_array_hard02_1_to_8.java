package ex03_array_hard;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이되면 게임은 종료된다.
 */


public class Repeat_Ex_array_hard02_1_to_8 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int[] check = new int[9];
		
		for(int i=0; i<9; i++) {
			int data = ran.nextInt(9)+1;
			arr[i] = data;
			if(check[data-1] ==0) {
				check[data-1] = 1;
			}else {
				i-=1;
			}
		}
		
		int cnt = 0;
		int minidx = 0;
		
		while(cnt<9) {			
			
			for(int i=0; i<9;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			int min = 10;
			
			for(int i=0; i<9;i++) {
				if(arr[i] <min) {// min = 다시 10이 는데, arr[i]의 최솟값은 0임... 0을 제외한 가장 큰수?
					if(arr[i] !=0) {
						min = arr[i]; // min = 1;
						minidx = i; // 1의 idx가 저장
					}else {
						arr[i] = 0;
					}
				}
			}
			System.out.println("입력[1~9]:");
			int idx = scan.nextInt();
			
			if((idx-1) == minidx) { // 입력한 숫자가 1의 idx의 위치와 같으면
				arr[minidx] = 0; // 1의 idx의 값은 0이 됨. 
				cnt+=1; // cnt = 1;
			}
			
		}
	}
}
