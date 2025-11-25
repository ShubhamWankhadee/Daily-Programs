

class Employee{
	private String name;
	private long id;
	private String address;
	 
	
	public void setName(String name){
		this.name = name;
	}
	public void getName(){
		return name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void getId(){
		return id;
	}
	public void setAddress(String address){
		this.address = addresss;
	}
	public void getAddress(){
		return address;
	}
	 
}
class Company{
	Employee ref;
	void AddnewEmployee(Employee ref){
		this.ref = ref;
	
	}
	void ShowData(){
		String name = ref.getname();
		int id = ref.getId();
		String address = ref.getAddress();
		 
		
		System.out.println("id :"+id);
		System.out.println("Name:"+name);
		 
		System.out.println("Address :"+address);
	}
}
public class Pojo{
	public static void main(String args[]){
	Company obj = new Company();
	Employee obj1 = new Employee();
	
		obj1.setId(5);
		obj1.setName("Shubham");
		 
		obj1.setAddress("Pune");
		obj.ShowData();
		obj.AddnewEmployee(obj1);
		
		
	}
}