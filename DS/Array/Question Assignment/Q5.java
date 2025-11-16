import java.util.*;
public class Q5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in an Array");
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		int count1= 0, count2 =0;
		for(int i =0;i<a.length;i++){
			if(a[i]%2 == 0){
				count1 +=1;
			}else{
				count2 +=1;
			}
		}
		System.out.print("Event no Coutn is:"+count1);
		System.out.print("\nOdd no Coutn is:"+count2);
	}
}