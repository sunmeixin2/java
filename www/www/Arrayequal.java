package www;

import java.util.*;

public class Arrayequal {
	
	public static int equal(int[] list1,int[] list2){
		for(int i=0;i<list1.length;i++){
			if(list1[i]!=list2[i]){
				System.out.println("two lists are not strictly identical");
				return 0;
			}
		}
		System.out.println("two lists are strictly identical");
		return 1;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		
		int[] list1=new int[10]; 
		int[] list2=new int[10];
		
		for(int i=0;i<10;i++){
			list1[i]=input.nextInt();
		}
		 java.util.Arrays.sort(list1);
		for(int j=0;j<10;j++){
			list2[j]=input.nextInt();
		}
	 java.util.Arrays.sort(list2);
	 equal(list1, list2);

	}
}