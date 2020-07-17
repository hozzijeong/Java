package ex02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date02 {
	public static void main(String[] args) {
		/*
		 * # Date Ŭ������ Ȱ��
		 * . Date Ŭ���� ��ü���� ��, ��, ��, ��, ��, �ʸ� ��������
		 * . get���� �����ϴ� �޼ҵ带 ����Ѵ�.
		 * . �����Ϸ��� set���� �����ϴ� �޼ҵ带 ����ϸ� �ȴ�.
		 * 
		 * . Date Ŭ������ 1900���� �������� ��¥�� ó���Ѵ�.
		 * . ���� �������� 1900�� ���ؼ� ���;� �ϰ� �־��� ���� 1900�� ���� �־���� �Ѵ�.
		 * . ���� �������� 1�� ���ؼ� ���;� �ϰ� �־��� ���� 1�� ���� �־���� �Ѵ�.
		 */

		Date date = new Date();
		
		System.out.println("�� : " +(date.getYear() + 1900));
		System.out.println("�� : "+ (date.getMonth()+1));
		System.out.println("�� : "+(date.getDate()));
		
		System.out.println("���� : "+(date.getDay()));
		// �Ͽ���(0) ~ �����(6)	
		System.out.println("�� : "+(date.getHours()));
		System.out.println("�� : "+(date.getMinutes()));
		System.out.println("�� : "+(date.getSeconds()));
		
		/*
		 * Calendar Ŭ������ singleton �������� ����� Ŭ�����̹Ƿ� ��ü�� ����� ����� �� ����.
		 * ��ü�� ����� ����� �� ���� Ŭ������ Ŭ���� ���ο� �ڽ��� Ŭ������ ���� ��ü�� ������ �ְ�
		 * ���ο� ������ �ִ� Ŭ���� ��ü�� ������ �޼ҵ带 �����ؼ� ����Ѵ�.
		 */
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("calendar "+calendar);
		
		/*
		 * Calendar Ŭ���� ��ü�� ��¥ �� �ð� ���� �̿��� �� ���� ������ ������ �����Ƿ� 
		 * SimpleDateFormat Ŭ���� ��ü�� �̿��� ������ �����Ϸ��� 
		 * getTime() �޼ҵ�� ��¥�� �ð��� ���� �� ������Ѿ� �Ѵ�.
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println("sdf : "+sdf.format(calendar.getTime()));
	
		System.out.println("�� : " +calendar.get(calendar.YEAR));
		System.out.println("�� : "+(calendar.get(calendar.MONTH)+1));
		System.out.println("�� : "+calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("�� : "+calendar.get(calendar.DATE));
		
		System.out.println("���� : "+calendar.get(calendar.DAY_OF_WEEK));
		// �Ͽ���(0) ~ �����(6)	
		System.out.println("�� : "+calendar.get(calendar.HOUR));
		System.out.println("�� : "+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("�� : "+calendar.get(calendar.MINUTE));
		System.out.println("�� : "+calendar.get(calendar.SECOND));
	
	}
}
