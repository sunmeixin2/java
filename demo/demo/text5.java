package demo;

import java.util.Scanner;

public class text5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input= new Scanner(System.in); 
		String str=input.nextLine(); 
		int k=0;
		char[] chars=str.toCharArray(); 
		for(int i=0;i<chars.length;i++){
			if(chars[i] >='A' && chars[i] <= 'Z'){
				k++;
			}
		}
		System.out.println(k);
	}

}
