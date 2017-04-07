package demo;

import java.util.*; 
public class ReturnPiefix {
	public static String Prefix(String str1,String str2){
		String str=""; 
		int n=0;
		int l;
		char[] char1=str1.toCharArray();
		char[] char2=str2.toCharArray();
		if(str1.length()>str2.length()){
			l=str2.length(); 
		}
		else {
			l=str1.length();
		}
	
		for(int i=0;i<l;i++){		

			if(char1[i]==char2[i]){
				str=str+char1[i];
				n++;
			}
			else{
				break;
			}
		}

		return str; 
	 
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ReturnPiefix s=new ReturnPiefix(); 
		Scanner input = new Scanner(System.in); 
		String str1=input.nextLine();
		String str2=input.nextLine(); 

		System.out.println(s.Prefix(str1,str2));

	}

}
