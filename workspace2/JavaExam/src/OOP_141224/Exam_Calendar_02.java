package OOP_141224;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calendar_02 {

	public static void main(String[] args) {
		
		//Calendar c = new GregorianCalendar();
		//사용
		
		Calendar c2 = Calendar.getInstance();  
		// new 로 생성하지 않아도.
		// static 매소드가 리턴되어 만들어질수도 있다.
		System.out.println(c2.YEAR+"-"+c2.MONTH+"-"+c2.DAY_OF_MONTH+", "+c2.HOUR+":"+c2.MINUTE+":"+c2.SECOND);
		System.out.println(c2.DATE);
		System.out.println(c2.DAY_OF_YEAR);
		System.out.println(c2.get(3));
		
		//날짜 시간 출력해 보기 .
		int year = c2.get(c2.YEAR);
		int month = c2.get(c2.MONTH) +1;
		int day = c2.get(c2.DATE);
		int dayofweek = c2.get((c2.DAY_OF_WEEK));
		
		System.out.println(year +"-"+ month +"-"+ day +"-"+ dayofweek);
	}

}// Exam_Calendar_01 - END

