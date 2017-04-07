package www;

public class SearchTime {
	
	public static int linearsearch(int[] list,int key){		
		for(int i=0;i<list.length;i++){
			if(key==list[i]){
				return i;
			}
		}
		return -1;
	}
	public static int binarysearch(int[] list,int key){
		int low=0;
		int high=list.length-1;
		
		while(high>=low){
			int mid=(low+high)/2;
			if (key<list[mid]){
				high=mid-1; 
			}
			else if(key==list[mid]){

				return mid ; 
			}
			else{
				low = mid+1; 
			}
		}
		
		return -low-1; 
	}
	public static int[] sort (int[] list){
		
		for(int j=0;j<list.length;j++){
			int currentmin=list[j]; 
			int t=j;
			for(int k=j+1;k<list.length ; k++){
				if(list[k]<currentmin){
					currentmin=list[k];
					t=k;
				}
			}
			if(t!=j){
				list[t]=list[j]; 
				list[j]=currentmin;
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] list=new int[100000];
		for(int i=0;i<100000;i++){
			list[i] =(int)(Math.random()*100000);
		}
		long startTime=System.nanoTime();

		linearsearch(list, (int)(Math.random()*100000));
		long endTime=System.nanoTime(); 

		long executionTime=endTime-startTime; 
		System.out.println("线性表查找关键字的执行时间："+executionTime);

		int[] list1=sort(list);
		long startTime1=System.nanoTime();
		binarysearch(list1,(int)Math.random()*100000);
		long endTime1=System.nanoTime(); 
		long executionTime1=endTime1-startTime1; 
		System.out.println("二分法查找关键字的执行时间："+executionTime1);
		
	}

}
