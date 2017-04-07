package demo;

import java.util.Scanner;

public class Replacestr {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input =new Scanner(System.in); 
		String[] str=new String[5]; 
		int i=0;
		do{
			
			str[i]=input.nextLine();
			i++;
			
		}while(str[i]!="end");
		String str1=input. nextLine(); 
		String str2=input. nextLine();
		String s="";
		for(int j=0;j<str.length;j++){
			s=s+str[i]; 
		}
		String s1=s.replace(str1, str2); 
		System.out.println(s1);
	}

}
