public class Sliding{
	public static void main(String args[]){
		int arr[] ={1,2,3,4,5,6};
		int tar =13;
		int k=3;
		int count=0;
		int sum =0;
		int left =0,length = tar;
		int right =0;
		for(int i=0;i<arr.length;i++){
			 for(int j=1;j<arr.length;j++){
				sum = arr[j-1] + arr[j];
				count++;
				 if(sum ==7 && count< length){
					 length = count;
					 
				 }else if(count >7&& count >length){
					 count=0;
					 sum =0;
				 }
			 }
		}
		System.out.println(" "+length);
		 
	}
}