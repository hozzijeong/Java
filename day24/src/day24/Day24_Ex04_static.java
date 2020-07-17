package day24;

/*
 * # 변수의 종류
 * [1] 자료형에 따른 분류
 * 1) 정수 : byte, short, int, long
 * 2) 실수 : float, double
 * 3) 문자 한 개 : character
 * 4) 논리형 : boolean
 * -----------------------------------
 * 5) 문자열 : String
 * 
 * [2] 선언 위치에 따른 분류
 * 1) 클래스 영역
 * 		- static(클래스 변수) 
 * 		- non-static(인스턴스[멤버] 변수)
 * 2) 메서드 영역 : 지역변수(local variable)
 * 
 */

class Ex {
	// 클래스 영역
	static int x = 10; // static 변수
		   int y = 20; // non-static 변수(멤버 변수)
		   
	void print() 
	{
		// 메서드 영역
		int z;
	}
	
}

public class Day24_Ex04_static {
	public static void main(String[] args) 
	{
		
		System.out.println("static 변수 호출1 = " + Ex.x);
		
		Ex e = new Ex();
		System.out.println("static 변수 호출2 = "+e.x);
		System.out.println("멤버 변수 = "+ e.y);
		
	}
}

// Day24_Ex04_static.main(null);

