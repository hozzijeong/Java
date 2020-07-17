package ex02;

import java.util.Calendar;

class MyCalendar{
	static MyCalendar a = new MyCalendar();
	static public MyCalendar getInstance() {
		return a;
	}
}

public class date {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		MyCalendar c = MyCalendar.getInstance();
		
		System.out.println(c);
	}
}
