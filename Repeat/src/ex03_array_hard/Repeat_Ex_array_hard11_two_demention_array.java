package ex03_array_hard;

public class Repeat_Ex_array_hard11_two_demention_array {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		System.out.println("문제1==========");
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("총합: "+sum);
		
		System.out.println("문제2==========");
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]%4==0) {
					System.out.printf("%d ",arr[i][j]);
				}
			}
		}
		System.out.println();
		System.out.println("문제3==========");
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		int sum1 = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]%4==0) {
					sum1 += arr[i][j];
				}
			}
		}
		System.out.println("4의 배수 총합:"+sum1);
		System.out.println("문제4==========");
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]%4==0) {
					cnt += 1;
				}
			}
		}
		System.out.println("4의배수 개수:"+cnt);

	}
}
