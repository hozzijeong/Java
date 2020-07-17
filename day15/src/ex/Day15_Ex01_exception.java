package ex;

import java.util.Scanner;

public class Day15_Ex01_exception {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("[나눗셈] 숫자 1 입력:");
		int num1 = scan.nextInt();
		
		System.out.println("[나눗셉] 숫자 2 입력:");
		int num2 = scan.nextInt();
		
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println((num1 / num2));
		}
		
		
		
		System.out.println("==========Exception==========");
		
		try {
			System.out.println(num1/num2);
		}catch(Exception e)	{
			System.out.println("0으로 나눌 수 없다.");
			
		}finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 문장");
		}
		
	}
}
