package day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest3 {

	public static void main(String[] args) throws Exception {
		Date d = new Date(); // 시간 객체 Date , local ,GregorianCalendar 애내를 써야 시간 포맷문자를 쓸 수 있음
		System.out.printf("%tY년\n", d);
		System.out.printf("%tm월\n", d);
		System.out.printf("%td일\n", d);		
		System.out.printf("%tY년 %1$tm월 %1$td일\n", d);
		System.out.printf("%tY년 %1$tb %1$te일\n", d);        //tb  , //te 애내는 월 일에 0들어가있으면 뺴줌
		
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", d);
		System.out.printf("%tT\n", d);	//현재 시각
		System.out.printf("%tD\n", d);	 // 월 일 년 지금 시각으로 알려줌
		
		System.out.printf("%tY년 %1$tm월 %1$td일\n", LocalDate.now());
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", LocalDateTime.now());
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", new GregorianCalendar());
	}
}







