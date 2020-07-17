package ex07_method;
class Ex01{
	int test1(int [] arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}						
	int test2(int [] arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				total+= arr[i];
			}
		}
		
		return total;
	}
	int test3(int [] arr) {
		int cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				cnt+= 1;
			}
		}
		
		return cnt;}
	
	int test4(int [] arr) {
		int cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				cnt+= 1;
			}
		}
		
		return cnt;}
}
public class Repeat_Ex01_managestudent01 {
	public static void main(String[] args) {
		Ex01 e = new Ex01();
		
		int[] arr = {87,100,11,72,92};
		
		
		// 문제 1) 전체 합 리턴
		// 정답 1) 362
		System.out.println(e.test1(arr));
		
		// 문제 2) 4의 배수의 합 리턴
		// 정답 2) 264
		System.out.println(e.test2(arr));
		
		// 문제 3) 4의 배수의 개수 리턴
		// 정답 3) 3
		System.out.println(e.test3(arr));
		
		// 문제 4) 짝수의 개수 리턴
		// 정답 4) 3
		System.out.println(e.test4(arr));


	}
}
