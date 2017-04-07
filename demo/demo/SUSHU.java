package demo;
import java.math.BigInteger; 

public class SUSHU {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int count=0;
		long x = Long.MAX_VALUE;
		String sc = Long.toString(x);
		BigInteger bi = new BigInteger(sc);
		while(count<5) {
		  bi = bi.nextProbablePrime();    //要想严格证明是素数，那就从0循环到bi/2验证下
		  System.out.println( bi );
		  count++;
		}

	}

}
