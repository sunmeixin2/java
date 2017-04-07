package demo;

import java.util.Scanner;

import javax.naming.ldap.SortControl;
import javax.rmi.CORBA.Util;

public class textsort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串：");
		str=input.nextLine();
		char[] chars=str.toCharArray();
		java.util.Arrays.sort(chars);
		String str1=String.valueOf(chars); 
		System.out.println(str1);
		
	}

}
