import java.util.*;

public class Q4
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Amount:");
		 
		 int amount = sc.nextInt();
		 
		int fivehundred = amount/500;
		amount = amount - (fivehundred *500);
		System.out.println("500: "+fivehundred);
		
		int hundred = amount/100;
		amount = amount - (hundred *100);
		System.out.println("100: "+hundred);
		
		int fifty = amount/50;
		amount = amount - (fifty *50);
		System.out.println("50 : "+fifty);
		
		int ten = amount/10;
		amount = amount - (ten *10);
		System.out.println("10 : "+ten);
		
		int five = amount/5;
		amount = amount - (five *5);
		System.out.println("5: "+five);
		
		int two = amount/2;
		amount = amount - (two *2);
		System.out.println("2: "+two);
		
		
		System.out.println("1 : "+amount);
	}
}