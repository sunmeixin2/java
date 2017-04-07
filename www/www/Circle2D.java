package www;


public class Circle2D {
	public double x;
	public double y;
	public double radius;
	public static  final double PI=3.1514926;

	public double getX() {
		return x;
	}
	public Circle2D(){
		x=0;
		y=0;
		radius=1;
		
	}
	public Circle2D(double x,double y,double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
		
	}
	
	public double getY() {
		return y;
	}


	public double getRadius() {
		return radius;
	}
	
	public double getArea()			//面积
	{
		return radius*radius*PI;
	}
	public double getPerimeter()			//周长
	{
		return 2*radius*PI;
	}
	public boolean contains(double x,double y){			//圆内
		if(Math.sqrt((getX()-x)*(getX()-x)+(getY()-y)*(getY()-y))<radius){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean contains(Circle2D circle){				//圆内
		if(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y))<radius){
//			System.out.println(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y)));
//			System.out.println(radius+"  "+circle.getX()+"  "+x);
			return true;
		}
		else{
			return false;
		}
	}
	public boolean overlaps(Circle2D circle){			//重叠
		if(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+circle.getY()*circle.getY())>Math.abs(circle.getRadius()-radius)&&Math.sqrt((circle.getX()-x)*(circle.getX()-x)+circle.getY()*circle.getY())<Math.abs(circle.getRadius()+radius)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle2D c1=new Circle2D(2,2,5.5);
		System.out.println("面积："+c1.getArea());
		System.out.println("周长："+c1.getPerimeter());
		
		
		if(c1.contains(11,11)){
			System.out.println("给定点（11,11）在圆内");
		}
		else{
			System.out.println("给定点（11,11）bu在圆内");
		}
		
		
		if(c1.contains(new Circle2D(4,5,10.5)))
		{
			System.out.println("给定圆(4,5,10.5)在这个圆内");
		}
		else{
			System.out.println("给定圆(4,5,10.5)bu在这个圆内");
		}
		
		
		if(c1.overlaps(new Circle2D(3,5,2.3))){
			System.out.println("给定圆(3,5,2.3)和这个圆重叠");
		}
		else{
			System.out.println("给定圆(3,5,2.3)bu和这个圆重叠");
		}
		
		
	}

}
