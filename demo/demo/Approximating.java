package demo;

import java.math.BigDecimal;

public class Approximating {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i,j,n=100; 
		double sum=0, t=1;
		while(n<=1000){
			sum=0; 
			t=1;
			for(i=1;i<=n;i++){
				for(j=1;j<=i;j++){
					t=t*j;
				}
				sum=sum+1/t; 
			}
			BigDecimal s=new BigDecimal(sum); 
			System.out.println(s);
			n=n+100;
		}
		
		
	}

}
