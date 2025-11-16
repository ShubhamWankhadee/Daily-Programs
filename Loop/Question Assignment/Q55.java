/*
Q55. Write a java program to display following series :
5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/

public class Q55{
	public static void main(String args[]){
		int sum=0,a=1;
		for(int i=1;i<=15;i++){
			if(i%2!=0){
				sum =sum+5;
				System.out.print(sum+" ");
			}else{
				 
				System.out.print(a*3+" ");
				a++;
			}
		}
	}
}