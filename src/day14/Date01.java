package day14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜클래스
		// Date 클래스 => Deprecated (비권장)
		// Calendar 클래스 / LocalDate 클래스 
		Date d = new Date();
		System.out.println(d); // 오늘 날짜
		System.out.println(d.getDate());
		
		Calendar c = Calendar.getInstance(); // 추상클래스 new로 객체 생성 불가능
		int year = c.get(Calendar.YEAR); // 멤버변수 static final
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1); // 0~11 +1
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year + "-" + (month+1) + "-" + day);

		System.out.println("---------------------------");
		LocalDate date = LocalDate.now(); // 오늘 날짜 리턴
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.getYear()); 
		System.out.println(datetime.getMonth()); // 영어로 나타남 NOVEMBER
		System.out.println(datetime.getMonthValue()); // 숫자로 나타남 11
		System.out.println(datetime.getDayOfMonth()); // 숫자로 나타남 23
		System.out.println(datetime.toLocalDate());
		
		LocalDateTime birth = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(birth);
		
		// formatter y M d m s 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
		
		// 두 객체 사이 간격
		long days = ChronoUnit.DAYS.between(datetime, birth); //일 차이
		System.out.println(days);
		long months = ChronoUnit.MONTHS.between(datetime, birth); // 개월 차이
		
		Duration.between(datetime, birth); // 두 시간사이 간격
		
		Period.between(date, date); // 두 날짜 사이 간격
		
	}

}
