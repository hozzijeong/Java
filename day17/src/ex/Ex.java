package ex;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("문자열 입력 : ");
		String str = scan.nextLine();
		
		int number = Integer.parseInt(scan.nextLine());
		
		
	}
}
