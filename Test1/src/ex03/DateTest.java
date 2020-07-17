package ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		// ����, ��, ��¥ , ��:��:�� KST �⵵ ������ ������
		System.out.println(date);
		
		/*
		 * SimpleDateFormat�� �����ؼ� ���ۿ� �˻� �غ���.
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis()
		 * . 1970�� 1�� 1�� ���� ���� �� �޼ҵ尡 ����Ǵ� �������� ������ �ð��� �и���(1/1000��) ������ ���´�.
		 * . 13�ڸ��� ���ڸ� ������ ������ int�� ó���ϸ� ������ �߻��ǹǷ� long�� ó���ؾ� �Ѵ�.
		 */
		 long time = System.currentTimeMillis();
		 System.out.println(time);
		 System.out.println(sdf2.format(date));

	}
}
