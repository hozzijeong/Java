package ex;

public class Day10_Ex02_two_dimentional_array_land3 {
	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			System.out.println("=====����1=====");
			// ���� 1) ���� �� ���
			// ���� 1) 410, 810, 1210
			for(int i=0; i<arr.length;i++) {
				int sum = 0;
				for(int j=0; j<arr[i].length;j++) {
					sum += arr[i][j];
					garo[i] = sum;
				}
			}
			
			for(int i=0; i<4;i++) {
				int sum = 0;
				for(int j=0; j<3;j++) {
					sum+= arr[j][i];
					sero[i] = sum;
				}
			}
			
			for(int i=0; i<garo.length;i++) {
				System.out.print(garo[i] +" ");
			}
			
			
			System.out.println();
			
			System.out.println("=====����2=====");
			for(int i=0; i<sero.length;i++) {
				System.out.print(sero[i] +" ");
			}
			
			System.out.println();
			
			// ���� 2) ���� �� ���
			// ���� 2) 603, 606, 609, 612


	}
}
