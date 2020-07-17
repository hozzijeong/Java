package ex02_array;
/*
 * # 배열(array)
 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];
 * 3. 인덱스(index)
 * 		0부터 시작하는 방번호(index)가 부여된다.
 * 4. 주소 변수
 */


public class Repeat_Ex_array01_base {
	public static void main(String[] args) {
		int[] arr = new int[5];
				
		System.out.println("==========");
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for(int i=0; i<5; i++) {
			arr[i] = (i+1)*10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		// 문제2) 4의 배수만 출력
		// 정답2) 20 40
		for(int i=0; i<5;i++) {
			if(arr[i] %4 ==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("==========");
		// 문제3) 4의 배수의 합 출력
		// 정답3) 60
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("==========");
		
		// 문제4) 4의 배수의 개수 출력
		// 정답4) 2
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		
		System.out.println(cnt);
		System.out.println("==========");
		// 문제5) 짝수의 개수 출력
		// 정답5) 5
		cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%2==0) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		


	}
}
