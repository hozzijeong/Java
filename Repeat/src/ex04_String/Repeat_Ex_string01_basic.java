package ex04_String;
/*
 * 문자열 = 문자의 배열
 * 문자 = 문자열의 한 요소
 * 0부터 시작하는 번호 부여!!!
 */
public class Repeat_Ex_string01_basic {
	public static void main(String[] args) {
		String str = "megait";
		System.out.println(str); // 문자열 str 출력!
		
		//[1] 문자의 길이 : length();
		int size = str.length();
		System.out.println("[1]size:"+size);
	
	
		// [2] 문자 한개 추출(인덱싱) : charAt(index)	
		char ch = str.charAt(0);
		System.out.println("str의 0번째 문자 : "+ch);
		ch = str.charAt(size-1);
		System.out.println("str의 마지막 문자: "+ch);
	
		//[3]	문자 여러개 추출(슬라이싱)
		// 1)substring (index1, idx2);
		// 마지막은 포함하지 않음. idx1<=  <idx2	
		String rs = str.substring(4,6);
		System.out.println("str 의 4,5번째 문자:"+rs);
		
		//2) substring(index)	
		// index부터 문자열 끝까지
		
		rs = str.substring(4);
		
		System.out.println("str의 4~끝가지"+rs);
		
		//[4] 구분자로 잘라내기
		
		str = "hello,java,android";
		String[] ar = str.split(","); // split은 한개로밖에 분할을 하지 못하는 것인가요ㅕ?
		
		System.out.println("ar의 길이: "+ar.length);
		for(int i=0; i<ar.length;i++) {
			System.out.println("ar의 "+i+"번째 요소"+ar[i]);
		}
	
	
	}
	
}	
