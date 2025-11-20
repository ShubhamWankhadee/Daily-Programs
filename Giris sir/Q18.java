/*
18. Check Leap Year
Create a class LeapYearChecker with a method LeapYearChecker to check if a year is a leap year.


*/

import java.util.*;

class Leap{
 
	public void LeapYearChecker(int year){  
		
		if(year %4==0 || (year%100 !=0 && year %400 ==00 )){
			System.out.println("Year is Leap !");

		}else{
			System.out.println("Year is Not Leap !");
		}
	}
}
public class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Yea: ");
		int year = sc.nextInt();
		 
	 
		Leap obj = new Leap();
		obj.LeapYearChecker(year);
	}
}