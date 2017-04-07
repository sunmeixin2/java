import java.text.SimpleDateFormat;
import java.util.Date;


public class Account {
	private int id=0; 
	private double balance=0 ; 
	private double annualInteresRate = 0; 
	private String datecreate; 
	
	public Account (int id ,double balance){
		this.id=id;
		this.balance=balance;
		Date date = new Date();
		SimpleDateFormat matter = new SimpleDateFormat("yyyy-MM-dd");
		datecreate = matter.format(date);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInteresRate() {
		return annualInteresRate;
	}

	public void setAnnualInteresRate(double annualInteresRate) {
		this.annualInteresRate = annualInteresRate;
	}

	public String getDatecreate() {
		return datecreate;
	}
	public double getmonthlyinterestrate(){			//月利息
		return annualInteresRate/12; 
	}
	
	public void withdraw(double money){			//取钱
		this.balance-=money; 
	}
	
	public void deposit(double money){		//存钱
		this.balance+=money; 
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  Account myAccount=new Account(1122, 20000);
		  myAccount.setAnnualInteresRate(4.5/100);
		  myAccount.withdraw(2500);
		  myAccount.deposit(3000);
		  
		  System.out.println("余额："+myAccount.getBalance());
		  System.out.println("月利息："+myAccount.getmonthlyinterestrate());
		  System.out.println("开户日期："+myAccount.getDatecreate());
		 
	}
}
