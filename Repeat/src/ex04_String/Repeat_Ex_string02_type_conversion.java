package ex04_String;

public class Repeat_Ex_string02_type_conversion {
	public static void main(String[] args) {
		// ���� -> ����
		
		char ch = 'a';
		int num = (int)ch;
		System.out.println(num);
		// ���� -> ���ڷ� ����ȯ�� �ϴ� ��쿡�� ���ڿ� ���Ե��ִ� �ƽ�Ű �ڵ�� ��ȯ�� �Ǹ�,
		//����ȯ ��ü�� (int)�� �̿��Ѵ�.
		
		ch = (char)(num+1);
		System.out.println(ch);
		// ���� -> ���ڷ� ������ �Ҷ����� (char)�� �ٿ��ָ� �ǰ�, num +1�� ���� �ƽ�Ű �ڵ� ���� ���ڷ� ��ȯ�Ͽ� ����Ѵ�.
		
		//���ڿ� -> ����
		String strnum = "10";
		int snum = Integer.parseInt(strnum);
		System.out.println(snum+1);
		
		// ���ڿ��� ���ڷ� �ٲ𶧿��� Integer.parseInt(���ڿ�) �� �̿��ؼ� ���ڷ� �ٲ� ���ִ�. 
		// ���ڿ� -> ���ڷ� �ٲ� �� �ִ� ���� �����ۿ� ���°ǰ���...?
		
		// ���� -> ���ڿ�
		//1)
		strnum = snum+"";
		System.out.println(strnum+1);
		//2)
		strnum = String.valueOf(snum);
		System.out.println(strnum+1);
	}
}
