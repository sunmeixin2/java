package demo;
import java.math.BigInteger; 

public class SUSHU {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int count=0;
		long x = Long.MAX_VALUE;
		String sc = Long.toString(x);
		BigInteger bi = new BigInteger(sc);
		while(count<5) {
		  bi = bi.nextProbablePrime();    //Ҫ���ϸ�֤�����������Ǿʹ�0ѭ����bi/2��֤��
		  System.out.println( bi );
		  count++;
		}

	}

}
