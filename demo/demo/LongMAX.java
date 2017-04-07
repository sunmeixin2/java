package demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.*;

public class LongMAX {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//

//		long x = Long.MAX_VALUE; 
//		String sc = Long.toString(x);
		String str=""+ Long.MAX_VALUE;
		BigInteger b = new BigInteger(str).add(BigInteger.ONE);
		int n=0;
		while(n<10){
			if(b.remainder(new BigInteger("5")).equals(BigInteger.ZERO)||b.remainder(new BigInteger("6")).equals(BigInteger.ZERO)){
				n++;
				System.out.println(b);
				
			}
			b=b.add(BigInteger.ONE);
		}
//		System.out.println(n);
	}
	
}

