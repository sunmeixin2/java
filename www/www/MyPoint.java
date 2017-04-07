package www;

public class MyPoint {
	public double x;
	public double y;
	
	public MyPoint(){
		x=0; 
		y=0;
	}
	public MyPoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public double getX() 
	{
		return x;
	}
	public double getY() 
	{
		return y;
	}
	
	
	public double distance(MyPoint p1,MyPoint p2){
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
	}
	public double distance(double x,double y){
		return Math.sqrt(Math.pow(getX()- x,2)+Math.pow(getY()-y,2));
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyPoint point=new MyPoint();
		

		System.out.println(point.distance(new MyPoint(0,0),new MyPoint(10,30.5)));
	
	}

}
