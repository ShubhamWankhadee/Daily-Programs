/*
Q28. WAP to create POJO class name as Product with field id, name and price and create 5
product objects using array of objects and search product using its id 
Means you have to input id from keyboard and search product present in array of object or not
using its id.

*/
import java.util.*;
class Product{

	private int id;
	private String name;
	private int prise;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrise(int prise){
		this.prise = prise;
	}
	public int getPrise(){
		return prise;
	}
}
class Logic{
	Product product[];
	int keyid ;
	
	public void setProduct(int keyid,Product ...product){
		this.product = product;
		this.keyid = keyid;
	}
	public void showData(){
		System.out.println("ID"+"		"+"Name"+"		"+"Pirse");
		System.out.println(" ");
		boolean flag = false;
		for(int i=0;i<product.length;i++){
			System.out.println(product[i].getId()+"		"+product[i].getName()+"		"+product[i].getPrise());
			if(keyid == product[i].getId()){
				
				flag = true;
			}
			
		}
		if(flag){
			
			System.out.println("Product is present!");
		}else{
			
			System.out.println("Produch is not Present!");
		}
	}
	
}
public class Q57{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		Product obj[] = new Product[5];
		 
		
		for(int i=0;i<obj.length;i++){
			System.out.println("Enter the Id ,Name & Prise"); 
			obj[i] = new Product();
			int id = sc.nextInt();
			String name = sc.next()+sc.nextLine();
			int prise = sc.nextInt();
			 
			obj[i].setId(id);
			obj[i].setName(name);
			obj[i].setPrise(prise);
			 
		}
		System.out.println("Enter the Search Id :");
		int Sid = sc.nextInt();
		Logic obj2 = new Logic();
		obj2.setProduct(Sid,obj);
		obj2.showData();
	
	}
	

}