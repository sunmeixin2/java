package demo;

import java.util.Random;

public class text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random random=new Random(1000);
		for(int i=0;i<50;i++){
			System.out.print(random.nextInt(100)+"  ");
		}
	}

}
