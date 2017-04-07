package www;

import java.util.Scanner;

public class Main  	{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i;
		Scanner input =new Scanner(System.in); 
		do{
			i=input.nextInt(); 
			
		}while(i<0&&i>2359); 
		int a=i%100; 
		int b=i/100; 
		if(a>=60){
			int c=a/60; 
			a=a%60; 
			b=b+c;
		}
		
		b=b-8;
		if(b<0){
			b=24+b;
		}
		int d=(b*100+a);
		System.out.println(d);
	}

}
