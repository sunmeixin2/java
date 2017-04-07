package demo;

import java.util.Scanner;

public class QuadraticEquation {

	private double a; 
	private double b; 
	private double c; 
	
	public QuadraticEquation(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	public double getDiscriminant(){
		return b*b-4*a*c;
	}
	public double getRoot1(){
		return (-b+Math.pow(getDiscriminant(),0.5))/2.0*a;
	} 
	public double getRoot2(){
		return (-b-Math.pow(getDiscriminant(),0.5))/2.0*a;
	} 
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter a,b,and c values:");
		
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		QuadraticEquation root=new QuadraticEquation(a,b,c);
		
		if(root.getDiscriminant()>0){
			System.out.println(String.format("%.4f",root.getRoot1())+" and "+String.format("%.4f",root.getRoot2()));
		}
		else if(root.getDiscriminant()==0){
			System.out.println(root.getRoot1());
		}
		
		else{
			System.out.println("The equation has no roots");
		}
		
	}

}



