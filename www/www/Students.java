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
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ��������");
		int n=input.nextInt();
		String[] string=new String[n];
		double[] grades=new double[n];
		
		for(int i=0;i<n;i++){
			System.out.println("�������"+(i+1)+"��ѧ�������ͳɼ���");
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
