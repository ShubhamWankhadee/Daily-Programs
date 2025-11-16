// Q15. Write a java program to print all ASCII characters with their values.

public class Q15{
		public static void main(String args[]){
			int no =25;
			
			do{
				char a = (char)no;
				System.out.println(a+":"+no+" ");
				no++;
				
			}while(no<=255);
		}
	
}