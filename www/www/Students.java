package www;

import java.util.Scanner;

public class Students {
	
	public static String[] sort(double[] list,String[] string){
		
		for(int j=0;j<list.length-1;j++){
			double currentmax=list[j]; 
			String currentmaxstr=string[j];
			int t=j;
			for(int k=j+1;k<list.length ; k++){
				if(list[k]>currentmax){
					currentmax=list[k];
					currentmaxstr=string[k];
					t=k;
				}
			}
			if(t!=j){
				list[t]=list[j]; 
				string[t]=string[j];
				list[j]=currentmax;
				string[j]=currentmaxstr;
			}
		}
		return string;
		
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int n=input.nextInt();
		String[] string=new String[n];
		double[] grades=new double[n];
		
		for(int i=0;i<n;i++){
			System.out.println("请输入第"+(i+1)+"个学生姓名和成绩：");
			String name=input.next();
			double grade=input.nextDouble();
			string[i]=name; 
			grades[i]=grade; 
			
		}
		String[] str=sort(grades, string);
		for (int j=0;j<n;j++) {
			System.out.println(str[j]);
		}
	}

}
