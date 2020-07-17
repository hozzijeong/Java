package ex;
/*
 * 출력문의 종류
 * 1. System.out.println();
 * 		1) ln = new line
 * 		2) 줄바꿈 가능
 * 2. System.out.print();
 * 		1) 줄바꿈 불가
 * 3. System.out.printf();
 * 		1) 서식문자 출력
 * 		2) 종류
 * 			%d:정수
 * 			%f:소수
 * 			%c:문자 1개
 * 			%s:문자 여러개(문자열)
 */
public class Day02_Ex03_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.print("안녕");
		System.out.println("하세요.");
		/*
		 * 이스케이프 문자
		 * 1) \n: 줄바꿈
		 * 2) \t: tab
		 * 3) \": "
		 * 4) \': '
		 */
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("\"안녕하세요\"");
		System.out.println("\'안녕하세요\'");
	
		System.out.printf("%d",10);
		System.out.println();

		System.out.printf("%f\n",3.14);
		System.out.printf("%.2f\n",3.14);
		
		System.out.printf("%c\n",'c');
		
		System.out.printf("%s\n","안녕하세요");
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다",fruit,cnt);
	}

}
