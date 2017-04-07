package demo;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in); 
		String[] name=new String[5];
		int[] grade=new int[5]; 
		int sum=0; 
		for(int i=0;i<5;i++){
			name[i]=input.next(); 
			grade[i]=input.nextInt();
			sum=sum+grade[i]; 
		}
		
		System.out.println(sum);
		System.out.println(sum/5.0);
	}

}
