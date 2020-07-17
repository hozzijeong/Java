package ex;

public class Day10_Ex01_two_dementional_array {
	public static void main(String[] args) {
		
		int [][]arr = new int[3][3];

		int k = 1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = 10*k;
				k+=1;
			}
		}
		
System.out.println("======巩力1======");		
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		
		System.out.println("======巩力2======");		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] %4 ==0) {
					System.out.print(arr[i][j]+ " ");
				}
			}
		}
		System.out.println();
		
		System.out.println("======巩力3======");
		int sum1 = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] %4 ==0) {
					sum1+= arr[i][j];
				}
			}
		}
		System.out.println(sum1);
		
		
		System.out.println("======巩力4======");
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] %4 ==0) {
					cnt+=1;
				}
			}
		}
		System.out.println(cnt);
		
		
	}
}
