package ex;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Day29_Ex01_date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd(E)");
		SimpleDateFormat f3 = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm");
		SimpleDateFormat f4 = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
		
		System.out.println(f1.format(date));
		System.out.println(f2.format(date));
		System.out.println(f3.format(date));
		System.out.println(f4.format(date));
	}
}
