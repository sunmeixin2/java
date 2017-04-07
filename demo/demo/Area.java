package demo;
import java.awt.print.Printable;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Scanner input = new Scanner(System.in);
			
			System .out.print("Enter three point:");
			double x1=input.nextDouble();
			double y1=input.nextDouble();
			double x2=input.nextDouble();
			double y2=input.nextDouble();
			double x3=input.nextDouble();
			double y3=input.nextDouble();
			
			double a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
			double c=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
			
			double s=(a+b+c)/2.0;
			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			System.out.println("The area of the triangle is:"+String.format("%.1f", area));
			
		
			
	}

}
