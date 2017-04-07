package demo;
import java.util.*;
import java.io.ObjectInputStream.GetField;
import java.util.GregorianCalendar;

public class text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		java.util.GregorianCalendar time=new GregorianCalendar();
		   Calendar cal = Calendar.getInstance();
	//	java.util.GregorianCalendar time1=new GregorianCalendar(setTimeInMillis(1234567898765L));
		System.out.println(time.get(GregorianCalendar.YEAR)+"  "+(time.get(GregorianCalendar.MONTH)+1)+"  "+time.get(GregorianCalendar.DAY_OF_MONTH));
		cal.setTimeInMillis(1234567898765L);
		System.out.println(cal.getTime());
		
	}

}
