package ex;

class Ex03{
	int [] arr = {87,100,11,72,92};
}


public class Day22_Ex04_Class_manage {
	public static void main(String[] args) {
		
		int sum =0;
		
		Ex03 e = new Ex03();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		System.out.println("==========");
		for(int i=0; i<e.arr.length;i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		System.out.println("==========");
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i] %4 ==0) {
				sum+=e.arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("==========");
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		
		System.out.println("==========");
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		cnt = 0;
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i]%2 ==0) {
				cnt+=1;
			}
		}
		System.out.println(cnt);

		
	}
}
