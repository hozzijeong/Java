package ex;

public class Day14_Ex02_type_conversion {
	public static void main(String[] args) {
		// ���� -> ����	
		char ch = 'a';
		int anum = (int)ch;
		System.out.println(anum); //�ƽ�Ű �ڵ� ������ ��Ÿ����.
		
		ch = (char)(anum+1);
		System.out.println(ch);
	
	
		//����'��' -> ����	
		String strNum ="10";
		int num  = Integer.parseInt(strNum);
		System.out.println((num+1));
	
		// ���� -> ���ڿ�
		//1) ���1
		strNum = num +""; // ���....?
		System.out.println(strNum+1);
	
		//2) ���2
		strNum = String.valueOf(num);
		System.out.println(strNum+1);
		
		
		System.out.println("==========");
		
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		
		/*
		 * 1. �տ� 89�⵵�� �����̽� �Ѵ�. (���ڿ�)
		 * 2. �����̽� �� ���� ������ �����Ѵ�.
		 * 3. 2020 ���� 1900+89�� �ؼ� ���� ����.
		 * 4. ���̸� ����Ѵ�.
		 */
		
		String age = jumin.substring(0,2); // ���ڿ� ����
		
		int Age = Integer.parseInt(age); // ������ ����
		
		
		char gender = jumin.charAt(7); // ���� ����
		int g = (int)gender; // ���� ����
		
		int real_age = 0; // ���� ��¥ ����
		
		if(g == 49 || g ==50) {
			real_age = (2020 - (1900+Age));
		}else if(g == 51 || g ==52) {
			real_age = (2020 - (2000+Age));
		}
		
		age = real_age+"";
		System.out.println(age+"��");
		
		
		System.out.println("========================");
		// ���� 2) ���� ���
		// ���� 2) ����
		
		if(g == 50 || g == 52) {
			System.out.println("����");
		}else if(g == 49 || g ==51) {
			System.out.println("����");
		}
	}
}
