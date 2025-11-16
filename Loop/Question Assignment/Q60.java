/*
Q60. Write a Java program to display the following series: 
3   6   12   24   48   96  192 
(Each term doubles from the previous term starting at 3)

*/
public class Q60{
	public static void main(String args[]){
		int no =3;
		for(int i=1;i<=7;i++){
			System.out.print(no+" ");
			no = no*2;
		}
	}
}