package ex;
class myInteger{
	int a;
	myInteger(int a){
		this.a = a;
	}
}
public class Wrapper {
	public static void main(String[] args) {
		int a = 10;
		float b = 10.1f;
		double c = 10.1;	
		
		// 클래스 선택 : shift + f2
		Integer i = new Integer("10");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// 문자 => 숫자
		String str = "10";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		Float f = new Float("10.1113123123145646f");
		
		Double d = new Double("10.23");
		
		myInteger ii = new myInteger(100);
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ii);
		
	}
}
