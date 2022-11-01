package CalendarClass;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Calendar클래스는 추상클래스이다
		Calendar now = Calendar.getInstance(); //now=현재 날짜와 시간정보
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		
		Calendar t1 =Calendar.getInstance();
		t1.clear();
		t1.set(1990, 11, 15); //1990년 12월 15일.
		
		
		System.out.println("출력합니다");
		System.out.println(t1.get(Calendar.YEAR)+" "+ (t1.get(Calendar.MONTH)+1)+" "+t1.get(Calendar.DATE));
		
		
		t1.set(Calendar.YEAR,1990);
		t1.set(Calendar.MONTH,Calendar.DECEMBER);
		t1.set(Calendar.DAY_OF_MONTH,15);
		System.out.println(t1.get(Calendar.YEAR)+" "+ (t1.get(Calendar.MONTH)+1)+" "+t1.get(Calendar.DATE));
		
		
		
		t1.add(Calendar.DAY_OF_MONTH, +41);//날짜더하기
		System.out.println(t1.get(Calendar.YEAR)+" "+ (t1.get(Calendar.MONTH)+1)+" "+t1.get(Calendar.DATE));
	}

}
