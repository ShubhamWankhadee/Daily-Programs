/*

Q25. Suppose consider we are working on billing Application and we have following types of classes 
1. Product with field id,name and price and it is POJO class 
2. Customer with field id, name address,email , contact and it is POJO class
3. Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be 



*/
import java.util.*;
class Product{
	private int id;
	private String name;
	private float prise;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	public void setPrise(float prise){
		this.prise = prise;
	}
	public float getPrise(){
		return prise;
	}

}
class Customer{
	private int id;
	private String name;
	private String address;
	private String email;
	private int contact;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setContact(int contact){
		this.contact = contact;
	}
	public int getContact(){
		return contact;
	}	

}
class Shop{
	Product arr[];
	Customer customer;
 	public void storeProducts(Customer customer, Product ...arr){
		this.arr = arr;
		this.customer = customer;
	}
	 
	void calBill(){
		System.out.println("Customer Id   : "+customer.getId() + " "+"Product Name : "+customer.getName()+" "+"Customer Address : "+customer.getAddress()+" "+"Customer Email : "+customer.getEmail()+ " " +" Customer Contact :"+customer.getContact());
		 int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Product Id   : "+arr[i].getId()+" "+"Product Name : "+arr[i].getName()+" "+"Product Prise : "+arr[i].getPrise());
			sum += arr[i].getPrise();
		}
		System.out.println("Total Bill is : "+sum);
	}
	
}
public class Q55{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	 
		Customer obj2 = new Customer();
		Shop obj3 = new Shop();
		Product ref[] = new Product[5];// Array of Object
		
		obj2.setId(05);
		obj2.setName("Shubham");
		obj2.setEmail("xyz@gamil.com");
		obj2.setContact(5566);
		obj2.setAddress("xyz pune");
		 
		 
		
		 
		
		for(int i=0;i<ref.length;i++){
			ref[i] = new Product();
			System.out.println("Enter the ID , Name and Prise");
			int id = sc.nextInt();
			String name = sc.next()+sc.nextLine();
			int prise = sc.nextInt();
			ref[i].setId(id);
			ref[i].setName(name);
			ref[i].setPrise(prise);
		}
		
		obj3.storeProducts(obj2,ref);
	
		obj3.calBill(); // print
	
	}
}