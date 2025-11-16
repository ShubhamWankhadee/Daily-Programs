public class Slarge{
	public static void main(String args[]){
		 
		int[] arr = {14, 8, 1, 10, 7};
		int max = 0, second = 0,third=0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				third = second;
				second = max;
				max = arr[i];
			} else if(arr[i] > second && arr[i] != max) {
				third = second;
				second = arr[i];
			}else if(arr[i] > third && arr[i] != second&& arr[i] != max){
					third = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(second);
		System.out.println(third);
		

	}
}
