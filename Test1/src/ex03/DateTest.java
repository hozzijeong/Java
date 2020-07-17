package ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		// 요일, 월, 날짜 , 시:분:초 KST 년도 순으로 나열됨
		System.out.println(date);
		
		/*
		 * SimpleDateFormat과 관련해서 구글에 검색 해보기.
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis()
		 * . 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 * . 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		 */
		 long time = System.currentTimeMillis();
		 System.out.println(time);
		 System.out.println(sdf2.format(date));

	}
}
