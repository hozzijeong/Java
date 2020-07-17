package ex;
/*
 * # 메서드의 구조[2단계]
 * void print(매개변수[parameter]){
 * 		실행할 내용;
 * } 
 *
 * # 메서드의 사용(호출)
 * print(인자,인수[argument]);
 */
class Ex20{
	void test1(int x, int y) {
		int total = 0;
		for(int i = x; i<=y; i++) {
			total += i;
		}
		System.out.println("total = "+ total);
		System.out.println();
	}
	
	void test2(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println();
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		
		System.out.println("before : "+arr[idx1]+","+arr[idx2]);
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println();
		System.out.println("after : "+arr[idx1]+","+arr[idx2]);
		
	}
}

public class Day23_Ex07_method_2 {
	public static void main(String[] args) {
		Ex20 e = new Ex20();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);
		
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		
		// 문제 3) arr배열을 전달받아 인덱스 2개를 입력받고, 해당 위치의 값을 교체하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		
		e.test3(arr, idx1, idx2);


	}
}
