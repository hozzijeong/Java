package day24;

/*
 * # ������ ����
 * [1] �ڷ����� ���� �з�
 * 1) ���� : byte, short, int, long
 * 2) �Ǽ� : float, double
 * 3) ���� �� �� : character
 * 4) ���� : boolean
 * -----------------------------------
 * 5) ���ڿ� : String
 * 
 * [2] ���� ��ġ�� ���� �з�
 * 1) Ŭ���� ����
 * 		- static(Ŭ���� ����) 
 * 		- non-static(�ν��Ͻ�[���] ����)
 * 2) �޼��� ���� : ��������(local variable)
 * 
 */

class Ex {
	// Ŭ���� ����
	static int x = 10; // static ����
		   int y = 20; // non-static ����(��� ����)
		   
	void print() 
	{
		// �޼��� ����
		int z;
	}
	
}

public class Day24_Ex04_static {
	public static void main(String[] args) 
	{
		
		System.out.println("static ���� ȣ��1 = " + Ex.x);
		
		Ex e = new Ex();
		System.out.println("static ���� ȣ��2 = "+e.x);
		System.out.println("��� ���� = "+ e.y);
		
	}
}

// Day24_Ex04_static.main(null);

