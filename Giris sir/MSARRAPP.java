import java.util.*;
public class MSARRAPP
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int a[]=new int[]{1,3,2,6,-1,4,1,8,2};
	   int max=Integer.MIN_VALUE;
	   int k=3;
	   int start=0,end=0,j;
	   for(int i=0; i<=a.length-k; i++)
	   {
	      int currentSum=0;
		  for(j=i; j<i+k;j++)
		  {
		      currentSum=currentSum+a[j];
		  }
		  if(currentSum>max)
		  {  max=currentSum;
	        start=i;
			end=j;
		  }
	   }
	   System.out.printf("[");
	   for(int i=start; i<end;i++)
	   { System.out.printf("%d,",a[i]);
	   }
	   System.out.printf("]");
	   System.out.println("\nMax sum of sub array "+max);
   }
}
