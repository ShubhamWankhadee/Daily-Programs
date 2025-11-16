// Q19. Write a java program to find the sum of the first and last digit of a number.



import java.util.*;
public class Q19{
	 static boolean flag=true;
	 static int last=0;
	 static int first=0;
	 
	public static int  Find(int no){
		
	    if(flag){
			last = no%10; 
			flag = false;
		} 
		if(no>=10){// first no
			no = no/10;
			 
		Find(no);		
		}else{
		  first = no;
		
		}
		return first+last;
	}
	
    public static void main(String args[])
	{ 
		Scanner sc  = new Scanner(System.in);
		 
	   System.out.println("Enter the No: ");
		int no = sc.nextInt();
		int result = Find(no);
		System.out.println("Sum of first and Last digit is:"+result);
	    
	  
	    
	}
}
