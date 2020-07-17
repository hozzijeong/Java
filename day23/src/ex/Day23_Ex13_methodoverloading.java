package ex;
/*
 * # �޼��� �����ε�(overloading)
 * �Ű������� ������ ������ �ٸ��� �Ͽ� ���� �̸��� �޼ҵ带 ���� �� ���� �� �ְ��ϴ� ���
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
