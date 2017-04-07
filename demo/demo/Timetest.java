package demo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;
public class Timetest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		long a=input.nextLong();
		long b=input.nextInt(); 
		long c;

		c=(b*24*60*60*1000)+a;

	
		SimpleDateFormat matter = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(matter.format(a));
		System.out.println(matter.format(c));
		
		
	}

}
