 
import java.util.*;
public class Power_Base
{   static int p=1;
    public static int getPower(int base,int index)
	{
	 
	   if(index!=0)
	   {  p =p  * base;
	     index=index-1;
		  return getPower(base,index);
		  
	   }
	   return p;
	}
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   int base,index;
	   System.out.println("Enter base and index");
	   base=xyz.nextInt();
	   index=xyz.nextInt();
	   int result= getPower(base,index);
	   System.out.println("Power is  "+result);
	}
}

