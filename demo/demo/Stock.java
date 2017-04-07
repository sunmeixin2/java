package demo;


public class Stock {
	private String symbol; 
	private String name; 
	private double previousClosingPrice; 
	private double currentPrice; 
	
	public Stock(String symbol,String name){
		this.symbol=symbol;
		this.name=name;
	}
	
	public double getchangepercent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
		
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stock a=new Stock("JAVA", "Sun Microsystems Inc");
		a.setCurrentPrice(34.35);
		a.setPreviousClosingPrice(34.5);
		double d=a.getchangepercent();
		System.out.println(String.format("%.4f",d));
		
	}

}
