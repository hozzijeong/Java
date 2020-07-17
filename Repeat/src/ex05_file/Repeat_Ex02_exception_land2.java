package ex05_file;

import java.util.Scanner;

public class Repeat_Ex02_exception_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[나눗셈] 숫자1 입력:	");
		int num1 = scan.nextInt();
		
		System.out.println("[나눗셈] 숫자2 입력:	");
		int num2 = scan.nextInt();
		
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println(num1/num2);
		}
	
		System.out.println("----------------------------");
		
		try {
			System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("예외 발생과 상관없이 무조건 실행하는 문장을 적음 ");
		}
	}
}
