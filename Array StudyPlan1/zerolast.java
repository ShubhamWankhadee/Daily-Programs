public class zerolast{
	public static void main(String args[]){
		
		int arr[] = {0, 1, 0, 3, 12};
		int no=arr.length-1;
		int a=0;
		
		for(int i=0;i<arr.length;i++){ // = [1, 3, 12, 0, 0]
			if(arr[i] != 0){
				arr[a++] = arr[i];
			} 
			 
		}
		while(a<arr.length){
		
				arr[a++] =0;
		}
		for(int j=0;j<arr.length;j++){
			
			System.out.println(" "+arr[j]);
		}
		 
	}
}