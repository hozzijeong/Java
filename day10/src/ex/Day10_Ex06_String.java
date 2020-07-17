package ex;

import java.util.Scanner;

/*
 * # 문자열 [입력받기]
 * . 숫자나 영어단어 입력 시 커서를 옮길 필요가 없다.
 * . 단, 한글 입력 시 반드시 커서를 끝으로 옮긴 후 작성해야 한다.
 */
/*
 * # 문자열 [비교]
 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
 */




public class Day10_Ex06_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "홍길동";
		
		System.out.print("이름 입력:");
		String myname = scan.next();
		
		if(name == myname) {
			System.out.println("==연산자 : 일치");
		}else {
			System.out.println("== 연산자: 불일치");
		}
		
		System.out.println(!true);
		
		if(!name.equals(myname)) {
			System.out.println("equals()메서드: 일치");
		}else {
			System.out.println("equals()메서드: 불일치");
		}
	}

}
