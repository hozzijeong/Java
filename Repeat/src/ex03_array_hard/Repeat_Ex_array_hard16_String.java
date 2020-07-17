package ex03_array_hard;

import java.util.Scanner;

public class Repeat_Ex_array_hard16_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String myname = "홍길동";
		
		System.out.print("이름 입력:");
		String name = scan.next();
		

		if(name != myname) {
			System.out.println("!= 연산자: 불일치");
		}else {
			System.out.println("!=연산자 :일치");
		}
		if(!name.equals(myname)) {
			System.out.println("!equals()메서드: 불일치");
		}else {
			System.out.println("!equals()메서드: 일치");
		}
	
	}
}
