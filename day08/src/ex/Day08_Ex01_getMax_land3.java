package ex;
/*
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */
import java.util.Scanner;

public class Day08_Ex01_getMax_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
			
			int k = 0;
			while(k<5) {
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i] +" ");
				}
				System.out.println();
				
				int check = 0;
				int max = 0;
				System.out.println("입력:");
				int num = scan.nextInt();
				
				for(int i=0; i<5; i++) {
					if(arr[i] >max) {
						max = arr[i];
						check = i;
					}
				}
				if(max == num) {
					arr[check] = 0;
					k+=1;
				}
			}
	}
}
