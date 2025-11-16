import java.util.*;

public class Q6
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the minuts:");
		 
		 double minuts = sc.nextDouble();
		 double base =0;
			
		 if(minuts >=0 && minuts<=100)
		 {
			 base = 199;
			System.out.println("Up to 100 min:"+base);
			
		 }else if(minuts>=101 && minuts <=300)
		 {
			base = 199 +(minuts-100)*1; 
			System.out.println("101 - 300: "+base);
			
		 }else if(minuts>=301 && minuts <=500)
		 {
			base = 199 + 100+(minuts-300)*1.5; 
			System.out.println("301 - 500:"+base);
		 }else  if(minuts >= 500)
		 {	
			base = 199 + 100+(200*10.5)+(minuts-500)*2;
			System.out.println("Above 500:"+base);
		 }
	}
}