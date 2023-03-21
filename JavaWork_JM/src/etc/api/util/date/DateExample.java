package etc.api.util.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("-----------------------------");
		
		//현재 날짜 정보 얻기 (연,월,일)
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//현재 시간 정보 얻기 (시,분,초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2002,7,1,9,0,0);
		System.out.println(beginDate);
		
		//연도 추출
		int year = localDateTime.getYear();
		System.out.println(year);
		
		Month month = localDateTime.getMonth();
		int monthValue = localDateTime.getMonthValue();
		System.out.println(monthValue);
		System.out.println(month);
		
		System.out.println("----------------------------");
		
		//지금으로 부터 3일 뒤
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);
		
		//지금으로 부터 1년 2개월 7일 뒤
		LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
		System.out.println(d1);
		
		//사이 날짜 연산
		LocalDate b = LocalDate.of(2020, 12,30);
		LocalDate f = LocalDate.of(2025, 9,14);
		
		long between=ChronoUnit.DAYS.between(b, f);
		System.out.println(between);
		
		//날짜 포맷 변경
		System.out.println("--------------------");
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(localDateTime.format(dtf));
		
		
		
		
		
		
		
		
		
		
	}

}
