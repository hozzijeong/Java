package ex;

class Number{
	
	// �Ű�����(parameter)
	int changeNum(int num) {
		num = 100;
		return num;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		Number n = new Number();
	
		System.out.println("�޼��� ȣ�� �� = " + num);
		
		// ����,�μ�(argument)
		num = n.changeNum(num);
		
		System.out.println("�޼��� ȣ�� �� = " + num);
		
	}
}
