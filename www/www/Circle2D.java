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
	
	public double getArea()			//���
	{
		return radius*radius*PI;
	}
	public double getPerimeter()			//�ܳ�
	{
		return 2*radius*PI;
	}
	public boolean contains(double x,double y){			//Բ��
		if(Math.sqrt((getX()-x)*(getX()-x)+(getY()-y)*(getY()-y))<radius){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean contains(Circle2D circle){				//Բ��
		if(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y))<radius){
//			System.out.println(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y)));
//			System.out.println(radius+"  "+circle.getX()+"  "+x);
			return true;
		}
		else{
			return false;
		}
	}
	public boolean overlaps(Circle2D circle){			//�ص�
		if(Math.sqrt((circle.getX()-x)*(circle.getX()-x)+circle.getY()*circle.getY())>Math.abs(circle.getRadius()-radius)&&Math.sqrt((circle.getX()-x)*(circle.getX()-x)+circle.getY()*circle.getY())<Math.abs(circle.getRadius()+radius)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle2D c1=new Circle2D(2,2,5.5);
		System.out.println("�����"+c1.getArea());
		System.out.println("�ܳ���"+c1.getPerimeter());
		
		
		if(c1.contains(11,11)){
			System.out.println("�����㣨11,11����Բ��");
		}
		else{
			System.out.println("�����㣨11,11��bu��Բ��");
		}
		
		
		if(c1.contains(new Circle2D(4,5,10.5)))
		{
			System.out.println("����Բ(4,5,10.5)�����Բ��");
		}
		else{
			System.out.println("����Բ(4,5,10.5)bu�����Բ��");
		}
		
		
		if(c1.overlaps(new Circle2D(3,5,2.3))){
			System.out.println("����Բ(3,5,2.3)�����Բ�ص�");
		}
		else{
			System.out.println("����Բ(3,5,2.3)bu�����Բ�ص�");
		}
		
		
	}

}
