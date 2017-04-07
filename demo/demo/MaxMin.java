package demo;
import java.util.*; 
public class MaxMin {

	public static void main(String[] args) {
		
		
	     Scanner scan = new Scanner(System.in);  
	     int num1,num2; 
	        while(true){
	        	 num1 = scan.nextInt();
	        	 num2 = scan.nextInt();
	        	if(num1<=1000&&num2<=1000){
	        		break;
	        	}
	        }
	  
	        System.out.println((maxCommonDivisor(num1, num2))+" "+(minCommonMultiple(num1, num2)));// 调用maxCommonDivisor()方法  

	    }  
	  
	    
	    public static int maxCommonDivisor(int m, int n) {  
	        if (m < n) { 
	            int temp = m;  
	            m = n;  
	            n = temp;  
	        }  
	        if (m % n == 0) {
	            return n;  
	        } else {  
	            return maxCommonDivisor(n, m % n);  
	        }  
	    }  
	  
	     
	    public static int maxCommonDivisor2(int m, int n) {  
	  
	        if (m < n) { 
	            int temp = m;  
	            m = n;  
	            n = temp;  
	        }  
	        while (m % n != 0) {  
	            int temp = m % n;  
	            m = n;  
	            n = temp;  
	        }  
	        return n; 
	    }  
	  
	    public static int minCommonMultiple(int m, int n) {  
	        return m * n / maxCommonDivisor(m, n);  
	    }  
		
}


