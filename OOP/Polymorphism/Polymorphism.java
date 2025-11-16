
public class Polymorphism{
	
	 
	 
	public int Operation(int a){
		 int sq = a*a;
		 return sq;
	}
	public void Operation(float x){
		
		System.out.println(" In float: "+ x*x);
	}

	public static void main(String args[]){
		Polymorphism obj = new Polymorphism();
		
		 
		int result = obj.Operation(5);
		System.out.println(" int"+ result);
		
		obj.Operation(5.6f);
	
	}
}