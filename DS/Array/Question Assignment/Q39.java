 /*
 Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
//Case 5 : Store only prime number at the same index of digit.
		//Output :- 2573  5  253  25  357  235
 */
 
 import java.util.*;
public class Q39{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("\n Enter the value in Array:");
		for(int i =0;i<arr.length;i++){
			arr[i] =  sc.nextInt();
		}
		System.out.print("\n  original array print:");
		for(int i =0;i<arr.length;i++){
			 System.out.print(" "+arr[i]);
		}
		 
				int sort[] = new int[four];
				int multi=1000,sum=0,rem=0,k=0,sum1=0;
				
				// distribute index value
				for(int i=0;i<arr.length;i++){
					int thous = multi;
					// add value in one shot
					while(arr[i] > 0){
						  rem = arr[i]%10;
						
							sum=sum+(thous* rem);
							thous = thous/10;
						arr[i] = arr[i]/10;
					}
					// store in four digit array for sorting
					while(sum>0){
						rem = sum%10;
							sort[k]= rem;
							k++;
						sum/=10;
					}
					Arrays.sort(sort);
					 System.out.print("\n Sorted array print:");
					// print sort index value
					for(int a=0;a<sort.length;a++){
						 System.out.print(" "+sort[a]);
					 }
					 // sprid array for to store in one shot
					 
					  
					arr[i]= sum1;
					
				}
		
		
		
		
		
		
		
		
				System.out.print("\nAfter perform op print:");
				for(int i =0;i<arr.length;i++){
					System.out.println(" "+arr[i]);
				}
		
		
		/* //   Sort Number In Ascending Order.
		 int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-1-i;j++){
			   if(arr[j] > arr[j+1] ){
				   temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
			   }
			} 
		}*/
		
		/*=======================================================
		System.out.println("\n Sort Number In Ascending Order:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		 //  Sort Number In Descending Order.
		 temp=0;
		for(int i=0;i<arr.length/2;i++){
		 
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;					
			
		}System.out.println("\n Sort Number In Descending Order");
		 for(int k=0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
		 
		}
		
		// Store sum of digits at same index.
		
		System.out.println("\n Store sum of digits at same index.:");
	  // 5 2 6 3
	    int sum;
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			sum =0;
			while(arr[i] >0){
				int rem =  arr[i]%10 ;
				  sum = sum + rem;
				arr[i] = arr[i] / 10;
			}
			arr1[i] = sum; 
			 
		} 
		 
		 for(int k=0;k<arr1.length;k++){
			System.out.print(" "+arr1[k]);
		 
		}
		*/
  }	
	
}