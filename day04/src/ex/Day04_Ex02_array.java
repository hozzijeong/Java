package ex;
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


public class Day04_Ex02_array {
	public static void main(String[] args) {
		int num = 0;
		num = 10;
		System.out.println("num: "+num);
		
		int arr[] = null;
		arr = new int[5];
		System.out.println("arr: "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		int arr1[] = new int[3];
		arr[0] = 10;
		arr[1]= 20;
		arr[2] = 30;
		
		for (int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		int temp[] = {1,2,3};
		for (int i = 0; i<3;i++) {
			System.out.println(temp[i]);
		}
		
		
	}

}
