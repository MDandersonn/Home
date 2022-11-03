package CalendarClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Birthday {

	public static void main(String[] args) throws ParseException {
		String birth= "1990/10/30";
		
		Calendar calBirth = Calendar.getInstance();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		Date dt= sf.parse(birth);
		calBirth.setTime(dt);
		
		Calendar calNow = Calendar.getInstance();
		calNow.set(Calendar.HOUR_OF_DAY, 0);
		calNow.set(Calendar.MINUTE, 0);
		calNow.set(Calendar.SECOND, 0);
		calBirth.set(Calendar.YEAR, calNow.get(Calendar.YEAR));
		
		Date dtNow = new Date(calNow.getTimeInMillis());
		
		Date dtBirth = new Date(calBirth.getTimeInMillis());
		System.out.println(dtNow);
		System.out.println(dtBirth);
		if(calNow.after(calBirth)) {
			calBirth.set(Calendar.YEAR, calNow.get(Calendar.YEAR)+1);
			dtBirth = new Date(calBirth.getTimeInMillis());
			long s=dtBirth.getTime()-dtNow.getTime();
			double ss = (double)s/(1000*60*60*24);
			String sss=String.format("%.0f일",ss);
			if(sss.equals("365일")) System.out.println("0일");
			else System.out.println(sss);
			
		}else {
			long s=  dtBirth.getTime()-  dtNow.getTime();
			double ss = (double)s/(1000*60*60*24);
			System.out.printf("%.0f 일",ss);
		}
		
		System.out.println();
		System.out.println("=========TEST=========");
		System.out.println((int)0.3);
		System.out.println((int)1.3);
		System.out.println((int)-0.3);
		System.out.println((int)-1.3);
		//int는 그냥 소수점이하 없애버리는것이다 반올림이 아님.
		
		

	}

}
