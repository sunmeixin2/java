package demo;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class welcom {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		String str1=JOptionPane.showInputDialog("Enter employee's name:");
		double str2=Float.parseFloat(JOptionPane.showInputDialog("Enter number of hours worked in a week:"));
		double str3=Float.parseFloat(JOptionPane.showInputDialog("Enter hourly pay rare:"));
		double str4=Float.parseFloat(JOptionPane.showInputDialog("Enter federal tax withholding rate:"));
		double str5=Float.parseFloat(JOptionPane.showInputDialog("Enter state tax withholding rate"));
		
		
		JOptionPane.showMessageDialog(null, 
				"Employee name: "+str1+"\n"
				+"Hours weeked: "+str2+"\n"
				+"Pay rate: $"+str3+"\n"
				+"Gross pay: $"+str2*str3+"\n"
				+"Deductions: \n"
				+"  Federal withholding(20.0%): $"+String.format("%.2f",str2*str3*str4)+"\n"
				+"  Stste withholding(9.0%) $"+String.format("%.2f",str2*str3*str5)+"\n"
				+"  Total deduction: $"+String.format("%.2f",(str2*str3*str4+str2*str3*str5))+"\n"
				+"Net pay:  $"+String.format("%.2f",str2*str3-str2*str3*str4-str2*str3*str5));
		
		
		System.out.print("Enter employee's name:");
		String name=input.nextLine();
		
		System.out.print("Enter number of hours worked in a week:");
		double hours=input.nextDouble();
		
		System.out.print("Enter hourly pay rate:");
		double hourlyPay=input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		double federal_rate=input.nextDouble();
		
		System.out.print("Enter state tax withholding rate:");
		double state_rate=input.nextDouble();
		
		System.out.println("Employee name: "+name);
		System.out.println("Hours weeked: "+hours);
		System.out.println("Pay rate: "+"$"+hourlyPay);
		
		double money1=hours*hourlyPay;
		double money2=money1*federal_rate;
		double money3=money1*state_rate;
		double sum1=money2+money3;
		double sum=money2-sum1;
	
		System.out.println("Gross pay: "+"$"+money1);
		System.out.println("Deductions:");
		System.out.println("  Federal withholding(20.0%): "+"$"+money2);
		System.out.println("  Stste withholding(9.0%) "+"$"+String.format("%.2f",money3));
		System.out.println("  Total deduction: $"+String.format("%.2f",(money2+money3)));
		System.out.println("Net pay:  $"+String.format("%.2f",(money1-money2-money3)));
		
	}

}
