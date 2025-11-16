public class Shubhamgit{
	public static void main(String args[]){
		
		int arr[] = {1,2,3,5,1,5,20,2,12,10};
		  
		
		for(int i=0;i<arr.length;i++){ 
		 boolean flag = true;
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i] ==  arr[j]){
				 flag = false;
				  arr[j] =-1;
				
				} 
				
			}
			 if(flag && arr[i]!=-1){
					 System.out.print(" "+arr[i]);
			 }
			 
		}
		 
		
		 
	}
}