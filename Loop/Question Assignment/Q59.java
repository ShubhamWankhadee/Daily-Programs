/*

Q59. Write a Java program to display the following series: 
100   81   64   49   36   25   16   9   4   1 
(Perfect squares in reverse order)

*/
public class Q59{
	 
	public static void main(String args[]){
		int no=21,a=121;
		for(int i =1;i<=10;i++){
			  a= a-no;
			System.out.print(a+" ");
			no= no-2;
		}
	}
}