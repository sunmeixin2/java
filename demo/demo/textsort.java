package demo;

import java.util.Scanner;

import javax.naming.ldap.SortControl;
import javax.rmi.CORBA.Util;

public class textsort {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("�������ַ�����");
		str=input.nextLine();
		char[] chars=str.toCharArray();
		java.util.Arrays.sort(chars);
		String str1=String.valueOf(chars); 
		System.out.println(str1);
		
	}

}
