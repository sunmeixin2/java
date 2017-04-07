package demo;
import java.util.Scanner;
public class root {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a,b,c:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		double t=b*b-4*a*c;
		double r1;
		double r2;
		
		if (t>0) {
			r1=(-b+Math.pow(t,0.5))/2.0*a;
			r2=(-b-Math.pow(t,0.5))/2.0*a;
			System.out.println("The roots are "+String.format("%.6f", r1)+" and "+String.format("%.5f",r2));
		} 
		else if (t==0){
			r1=(-b+Math.pow(t,0.5))/2.0*a;
			System.out.println("The root is "+r1);
		}
		else{
			System.out.println("The equation has no real roots");
		}
	}

}
