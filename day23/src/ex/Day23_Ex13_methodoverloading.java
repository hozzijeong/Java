package ex;
/*
 * # 메서드 오버로딩(overloading)
 * 매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술
 */

class Ex07{
	int add(int x, int y) {
		return x + y;
	}
	int add(int x, int y, int z) {
		return x + y + z;
	}
	int add(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}

public class Day23_Ex13_methodoverloading {
	public static void main(String[] args) {
		Ex07 e = new Ex07();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int r1 = e.add(10, 3);
		int r2 = e.add(10, 3, 1);
		int r3 = e.add(arr);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);


	}
}
