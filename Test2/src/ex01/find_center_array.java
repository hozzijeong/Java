package ex01;

import java.util.Scanner;

//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
//(단 ! 짝수자리의 수는 짝수자리라고 출력)
// 예)  123 ==> 2
// 예)  1234 ==> 짝수의 자리이다
// 예)  1 ==> 1
// 예)  1234567 ==> 4

// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
// 예) ==> 123 ==> 3 ==> arr[] = new int[3];


public class find_center_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = scan.nextInt();
		
		// 숫자 전체를 입력받고 그 숫자의 가운데를 입력받으면 됨.
		int cnt = 0;
		int temp = num;
		while(temp>0) {
			temp = temp/10;
			cnt++;
		}
		
		int[] arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = num%10;
			System.out.println("arr["+i+"]"+arr[i]);
			num = num/10;
		
		}
		
		if(cnt%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			int cen = cnt/2;
			System.out.println(arr[cen]);
		}
		
		
		
	}
}
