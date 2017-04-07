package www;


public class MyInteger
{
	
	
	public int value ;
	
	public MyInteger(int value ){
		this.value=value ;

	}
	public int getValue(){
		return value;
		
	}
	public boolean isEven(){
		return isEven(this.value);
		
	}
	public boolean isOdd(){
		return isOdd(this.value);
	}
	public boolean isPrime(){
		return isPrime(this.value);
	}
	public boolean isEven(int value){
		return value%2==0;
	}
	public boolean isOdd(int value){
		return value%2!=0;
	}
	public boolean isPrime(int value){
		for(int i=2;i<value;i++){
			if(value%i==0){
				return false;
			}
		}
		return true;
	}
	
	public boolean isEven(MyInteger value){
		return value.isEven();
	}
	
	public boolean isOdd(MyInteger value){
		return value.isOdd();
	}
	
	public boolean isPrime(MyInteger value){
		return value.isPrime();
	}
	
	
	public boolean equals(int value)
	{
		return this.value==value;
	}
	
	public boolean equals(MyInteger value)
	{
		return value.equals(this.value);
		
	}
	


//	public int parseInt(String s){
//	return Integer.valueOf(s);
//}
//
//public int parseInt(char[] c){
//
//	return Integer.valueOf(new String(c));
//}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	
		MyInteger value1=new MyInteger(2);
		MyInteger value2=new MyInteger(5);
		
		char[] str={'1','2','3'};
		String str1="678";
	
		if(value1.isEven())
		{
			System.out.print("ż��");
		}
		if(value1.isOdd()){
			System.out.print("����");
		}
		
		if(value1.isPrime())
		{
			System.out.println("and����");
		}
		else{
			System.out.println("but not ����");
		}
		if(value2.isEven(new MyInteger(9))){
			System.out.println("ż��");
		}
		if(value2.isOdd(new MyInteger(9))){
			System.out.println("����");
		}
		if(value2.isPrime(new MyInteger(9))){
			System.out.println("����");
		}
		else{
			System.out.println("not����");
		}
		
		System.out.println("{'1','2',3}ת��Ϊ"+String.valueOf(str));
		System.out.println("'123'ת��Ϊ"+Integer.parseInt(str1));
		
	}
}

