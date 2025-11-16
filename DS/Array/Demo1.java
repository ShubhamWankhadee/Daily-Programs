
public class Demo1{
	
	static int a[];
	public static void main(String args[]){
		a = new int[5];
		System.out.println("A is:"+System.identityHashCode(a));
	}
}