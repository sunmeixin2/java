package www;

public class Sort {
	
	public static double[] sort(double[] list){
		for(int i=list.length-1;i>0;i--){
			double max=list[i];
			int  k=i;
			for(int j=i-1;j>=0;j--){
				if(list[j]>max){
					max=list[j];
					k=j;
				}
			}
			if(k!=i){
				list[k]=list[i];
				list[i]=max;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] list={4,5,1,8,5,0,2,4,6,7,9};
		double[] list1=sort(list);
		for(int i=0;i<list1.length;i++){
			System.out.println(list1[i]);
		}
	}

}
