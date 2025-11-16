
 import java.util.*;
public class demo {
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
		System.out.print("which operation you want to perform \n 1 :  Sort Number In Ascending Order.\n 2 : Sort Number In Descending Order.\n 3 : Store sum of digits at same index.\n 4 : Store the even number at the first and odd number at the last of digit at same index. \n 5 : Store only prime number at the same index of digit.");
		System.out.println("\nEneter the option which you want!:");
		int opt = sc.nextInt();

							for(int i=0;i<arr.length;i++){
							int no=arr[i];
							int a=0,sum=0;
							int sor[] = new int[digsize];
							while(no>0){
								sor[a] =no%10;
								no /=10;
								a++;
							}
							 
							for(int x =0;x<sor.length-1;x++){
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
						
				}
				
		}