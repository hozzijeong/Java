package ex04_String;

public class Repeat_Ex_string02_type_conversion {
	public static void main(String[] args) {
		// 문자 -> 숫자
		
		char ch = 'a';
		int num = (int)ch;
		System.out.println(num);
		// 문자 -> 숫자로 형변환을 하는 경우에는 문자에 포함되있는 아스키 코드로 변환이 되며,
		//형변환 자체는 (int)를 이용한다.
		
		ch = (char)(num+1);
		System.out.println(ch);
		// 문자 -> 숫자로 변경을 할때에도 (char)를 붙여주면 되고, num +1된 값의 아스키 코드 값을 문자로 변환하여 출력한다.
		
		//문자열 -> 숫자
		String strnum = "10";
		int snum = Integer.parseInt(strnum);
		System.out.println(snum+1);
		
		// 문자열이 숫자로 바뀔때에는 Integer.parseInt(문자열) 을 이용해서 숫자로 바꿀 수있다. 
		// 문자열 -> 숫자로 바꿀 수 있는 것은 정수밖에 없는건가요...?
		
		// 숫자 -> 문자열
		//1)
		strnum = snum+"";
		System.out.println(strnum+1);
		//2)
		strnum = String.valueOf(snum);
		System.out.println(strnum+1);
	}
}
