package CalendarClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Birthday_ans {
	public static void main(String[] args) {
		String birhString= "20221029";
		int birthYear= Integer.parseInt(birhString.substring(0, 4));
		int birthMonth= Integer.parseInt(birhString.substring(4, 6));
		int birthDay = Integer.parseInt(birhString.substring(6, 8));
		
		int birthInt = birthMonth*100+birthDay;
		
		GregorianCalendar gcNow= new GregorianCalendar();
		System.out.println(gcNow.get(Calendar.YEAR));
		System.out.println(gcNow.get(Calendar.MONTH)+1);
		System.out.println(gcNow.get(Calendar.DAY_OF_MONTH));
		System.out.println(gcNow.getTime());
		System.out.printf("현재 시각은 %1$tY년,%1$tm월 %1$td일 입니다.\n",gcNow.getTime());
		
		
		int nowInt = (gcNow.get(Calendar.MONTH)+1)*100+gcNow.get(Calendar.DAY_OF_MONTH);
		
		GregorianCalendar gcBirth =new GregorianCalendar(birthYear,birthMonth-1,birthDay);
		System.out.println(gcBirth.get(Calendar.YEAR));
		System.out.println(gcBirth.get(Calendar.MONTH)+1);
		System.out.println(gcBirth.get(Calendar.DAY_OF_MONTH));
		int day=0;
		if( true) {//생일이 안지났다.
			while(true) {
				if((gcNow.get(Calendar.MONTH)+1 == gcBirth.get(Calendar.MONTH)+1)&&
				   (gcNow.get(Calendar.DAY_OF_MONTH)+1 == gcBirth.get(Calendar.DAY_OF_MONTH)+1)) {
						break;
				}
				gcNow.add(Calendar.DAY_OF_MONTH, 1);
				day++;
			}
		}
		System.out.println("D-DAY : "+day+"일");
		
		
		
	}

}
