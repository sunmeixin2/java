package demo;

public class RegularPolygon {
	private int n = 3; 
	private double side= 1; 
	private double x=0; 
	private double y = 0 ;
	
	final double PI = 3.1415926;
	
	public RegularPolygon(){
		n=3; 
		side=1;
		x=0; 
		y=0; 
		
	}
	public RegularPolygon(int n,double side){
		this.n =n; 
		this.side=side;
		x=0;
		y=0; 
	}
	public RegularPolygon(int n,double side,double x,double y){
		
		this.n=n;
		this.side=side; 
		this.x=x; 
		this.y=y; 
		
	}
	
	
	public int getN() {
		return n;		//得到n属性的值
	}
	public void setN(int n) {			//传递一个形参n的值给属性赋值
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getPerimeter() {
		return side*n;
	}
	public double getArea(){
		return (n*side*side)/(4*Math.tan(PI/n));
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RegularPolygon polygon=new RegularPolygon();
		RegularPolygon polygon1=new RegularPolygon(6,4);
		RegularPolygon polygon2=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("周长："+polygon.getPerimeter()+"  "+"面积："+polygon.getArea());
		System.out.println("周长："+polygon1.getPerimeter()+"  "+"面积："+polygon1.getArea());
		System.out.println("周长："+polygon2.getPerimeter()+"  "+"面积："+polygon2.getArea());

	}

}
