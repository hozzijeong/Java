package ex05_file;

public class Repeat_Ex01_excepction {
	public static void main(String[] args) {
		int num = 10;
		try {
			System.out.println(num/0);
			// try�ȿ� �ִ� �Ŀ� ������ �� ��� catch�� �Ѿ
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			// try���� ������ ���� ��� catch�� ��������. 
		}
		
		System.out.println("���α׷� ����");
	}
}
