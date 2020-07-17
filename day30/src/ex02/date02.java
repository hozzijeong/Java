package ex02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date02 {
	public static void main(String[] args) {
		/*
		 * # Date 클래스의 활용
		 * . Date 클래스 객체에서 년, 월, 일, 시, 분, 초를 얻어오려면
		 * . get으로 시작하는 메소드를 사용한다.
		 * . 수정하려면 set으로 시작하는 메소드를 사용하면 된다.
		 * 
		 * . Date 클래스는 1900년을 기준으로 날짜를 처리한다.
		 * . 년을 얻어오려면 1900을 더해서 얻어와야 하고 넣어줄 때는 1900을 빼서 넣어줘야 한다.
		 * . 월을 얻어오려면 1을 더해서 얻어와야 하고 넣어줄 때는 1을 빼서 넣어줘야 한다.
		 */

		Date date = new Date();
		
		System.out.println("년 : " +(date.getYear() + 1900));
		System.out.println("월 : "+ (date.getMonth()+1));
		System.out.println("일 : "+(date.getDate()));
		
		System.out.println("요일 : "+(date.getDay()));
		// 일요일(0) ~ 토요일(6)	
		System.out.println("시 : "+(date.getHours()));
		System.out.println("분 : "+(date.getMinutes()));
		System.out.println("초 : "+(date.getSeconds()));
		
		/*
		 * Calendar 클래스는 singleton 패턴으로 설계된 클래스이므로 객체를 만들어 사용할 수 없다.
		 * 객체를 만들어 사용할 수 없는 클래스는 클래스 내부에 자신의 클래스로 만든 객체를 가지고 있고
		 * 내부에 가지고 있는 클래스 객체를 얻어오는 메소드를 실행해서 사용한다.
		 */
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("calendar "+calendar);
		
		/*
		 * Calendar 클래스 객체는 날짜 및 시간 정보 이외의 더 많은 정보를 가지고 있으므로 
		 * SimpleDateFormat 클래스 객체를 이용해 서식을 지정하려면 
		 * getTime() 메소드로 날짜와 시간만 얻어온 후 적용시켜야 한다.
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println("sdf : "+sdf.format(calendar.getTime()));
	
		System.out.println("년 : " +calendar.get(calendar.YEAR));
		System.out.println("월 : "+(calendar.get(calendar.MONTH)+1));
		System.out.println("일 : "+calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("일 : "+calendar.get(calendar.DATE));
		
		System.out.println("요일 : "+calendar.get(calendar.DAY_OF_WEEK));
		// 일요일(0) ~ 토요일(6)	
		System.out.println("시 : "+calendar.get(calendar.HOUR));
		System.out.println("시 : "+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("분 : "+calendar.get(calendar.MINUTE));
		System.out.println("초 : "+calendar.get(calendar.SECOND));
	
	}
}
