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
public class Q39_II {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("Enter the size of Digit in Array:");
		int digsize = sc.nextInt();
		System.out.print("\n Enter the value in Array:");
		for(int i =0;i<arr.length;i++){
			arr[i] =  sc.nextInt();
		}
		System.out.print("\n  original array print:");
		for(int i =0;i<arr.length;i++){
			 System.out.print(" "+arr[i]);
		}  
		System.out.print("\nwhich operation you want to perform \n 1 :  Sort Number In Ascending Order.\n 2 : Sort Number In Descending Order.\n 3 : Store sum of digits at same index.\n 4 : Store the even number at the first and odd number at the last of digit at same index. \n 5 : Store only prime number at the same index of digit.");
		System.out.println("\nEneter the option which you want!:");
		int opt = sc.nextInt();
		
		switch(opt){
					// Case 1 :  Sort Number In Ascending Order.
			case 1: for (int i = 0; i < arr.length; i++) {
						int num = arr[i];
						int sort[] = new int[digsize]; // new array for digits
						int k = 0;

						// extract digits
						while (num > 0) {
							sort[k] = num % 10;
							num /= 10;
							k++;
						}

						// sort digits
						for(int y=0;y<sort.length-1;y++){
							for(int z=0;z<sort.length-1-y;z++){
								if(sort[z] > sort[z+1]){
									int temp = sort[z];
									sort[z] =  sort[z+1];
									sort[z+1] = temp;
								}
							}
						}

						// in one shot number
						int newNum = 0;
						for (int d = 0; d < sort.length; d++) {
							// to get no from array
							newNum = newNum * 10 + sort[d];
						}

						arr[i] = newNum; // replace with sorted number
					}
					
					System.out.print("\n Assending order operation:");
					for(int i =0;i<arr.length;i++){
						System.out.print(" "+arr[i]);
					} 
					
					break;
					
			case 2:     //Case 2 : Sort Number In Descending Order.
						//  Output :- 7532  9865  5432  9652  7543  5321
							for(int i=0;i<arr.length;i++){
							int no=arr[i];
							int a=0,sum=0;
							int sor[] = new int[digsize];
							while(no>0){
								sor[a] =no%10;
								no /=10;
								a++;
							}
							 
							for(int x =0;x<sor.length;x++){
								for(int j=0;j<sor.length-1-x;j++){
									if(sor[j]<sor[j+1]){
										int temp = sor[j+1];
										sor[j+1] = sor[j];
										sor[j] = temp;
									}
								}
							}
							for(int d=0;d<sor.length;d++){
								sum = sum*10+sor[d];
							}
							
							arr[i] =sum;
							
							
						}
						System.out.print("\n Decending order operation:");
						for(int i =0;i<arr.length;i++){
							System.out.print(" "+arr[i]);
						}
						break;
	
				case 3:
						// Case 3 : Store sum of digits at same index.
						//	Output :-  17  28  14  22  19  11
						int sumarr[] = new int[arr.length];
						for(int i=0;i<arr.length;i++){
							int sum=0;
							int no =arr[i];
							while(no>0){
								sum = sum+(no%10);
								no/=10;
							}
							sumarr[i]= sum;
							
						}
						System.out.print("\n Sum of Array index digits:");
						for(int i =0;i<sumarr.length;i++){
							System.out.print(" "+sumarr[i]);
						}
						break;
				case 4: //Case 4 : Store the even number at the first and odd number at the last of digit at same index.
							//  Output :-  2573  6859  4253  2695  4735  2135
							int EO[] =  new int[digsize];
							 
							for(int i=0;i<arr.length;i++){
								           
								 int no = arr[i],nos = arr[i],sum=0;
								 int count=0;
								  // for count
								 while(nos>0){
									 count++;
									 nos /=10;
								 }
								 int evenindx =0;
								int oddindex=count-1;
								 while(no>0){
									 int rem = no%10;
									 if(rem%2==0){
										 EO[evenindx] = rem;
										 evenindx++;
									 }else{
										 EO[oddindex] = rem;
										  oddindex--;
									 }
									 
									 no = no/10;
								 }
								 for(int j =0;j<EO.length;j++){
									 sum = sum*10 + EO[j];
								 }
								arr[i] = sum;
							}
							System.out.print("\n Even no on front & Odd no is last:");
							for(int i =0;i<arr.length;i++){
								System.out.print(" "+arr[i]);
							}
							break;
							
					case 5: //Case 5 : Store only prime number at the same index of digit.
							//Output :- 2573  5  253  25  357  235
					 
							for(int i=0;i<arr.length;i++){
								int no= arr[i];
								int sum=0;
								while(no>0){
					 
									int rem = no%10;
									
									int k=2;
									int count=0;
										 while(k<=rem){
											 if(rem%k==0){
												count++;
												
											 }
											 k++;
										 }
										 
										 if(count ==1){
											sum = sum*10+rem; 
										 }
										
									no = no/10;
								}
								arr[i]= sum;
							}
							System.out.print("\n Prime no print in index value:");
							for(int i =0;i<arr.length;i++){
								System.out.print(" "+arr[i]);
							}
							break;

			}
						 

		
    }
}
