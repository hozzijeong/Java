package day24;

class Student1{
	static int x;
	int score;
	double height;
	String name;
}

public class Ex04 {
	public static void main(String[] args) 
	{
		
		
		// 클래스 영역에 선언된 변수는 값이 자동 초기화된다.
		// int : 0
		// double : 0.0
		// 클래스(String) : null
		Student1 hgd = new Student1();
		System.out.println("height = " +hgd.height);
		System.out.println("score = "+hgd.score);
		System.out.println("name = " + hgd.name);
		System.out.println("x = "+Student1.x);
		// 지역변수는 반드시 값 저장 후 사용
		int a;
		// System.out.println(a);
		
		int num = 10;
		int[] arr = new int[3];
		System.out.println(arr[0]);
		
		
//		 클래스는 사용자 정의 데이터 타입이다.
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student[] list = new Student[3];
		list[0] = new Student();
		list[1] = new Student();
		list[2] = new Student();
		
		
	}
}




