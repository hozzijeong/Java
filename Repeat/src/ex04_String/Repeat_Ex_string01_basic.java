package ex04_String;
/*
 * ���ڿ� = ������ �迭
 * ���� = ���ڿ��� �� ���
 * 0���� �����ϴ� ��ȣ �ο�!!!
 */
public class Repeat_Ex_string01_basic {
	public static void main(String[] args) {
		String str = "megait";
		System.out.println(str); // ���ڿ� str ���!
		
		//[1] ������ ���� : length();
		int size = str.length();
		System.out.println("[1]size:"+size);
	
	
		// [2] ���� �Ѱ� ����(�ε���) : charAt(index)	
		char ch = str.charAt(0);
		System.out.println("str�� 0��° ���� : "+ch);
		ch = str.charAt(size-1);
		System.out.println("str�� ������ ����: "+ch);
	
		//[3]	���� ������ ����(�����̽�)
		// 1)substring (index1, idx2);
		// �������� �������� ����. idx1<=  <idx2	
		String rs = str.substring(4,6);
		System.out.println("str �� 4,5��° ����:"+rs);
		
		//2) substring(index)	
		// index���� ���ڿ� ������
		
		rs = str.substring(4);
		
		System.out.println("str�� 4~������"+rs);
		
		//[4] �����ڷ� �߶󳻱�
		
		str = "hello,java,android";
		String[] ar = str.split(","); // split�� �Ѱ��ιۿ� ������ ���� ���ϴ� ���ΰ����?
		
		System.out.println("ar�� ����: "+ar.length);
		for(int i=0; i<ar.length;i++) {
			System.out.println("ar�� "+i+"��° ���"+ar[i]);
		}
	
	
	}
	
}	
