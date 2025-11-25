class Employee
{    private String name;
	 private int id;
	 private String address;
	 
	 
	 public void setName(String name)
	 { this.name=name;
	 }
	 public String getName(){
		  return name;
	 }
	 public void setId(int id)
	 { this.id=id;
	 }
	 public int getId()
	 { return id;
	 }
	 public void setAddress(String address)
	 {   this.address=address;
	 }
	 public String getAddress(){
		 return address;
	 }
}
class Company
{  // Employee emp;
   void addNewEmployee(Employee emp)
   {    this.emp=emp;
   }
   void showData()
   {  String name=emp.getName();
       int id=emp.getId();
	  String address=emp.getAddress();
	 System.out.println(name+"\t"+id+"\t"+address);
   }
}
public class POJO_Class
{  public static void main(String x[])
   {  
     
	  Employee e = new Employee();	 
	  e.setId(1);
      e.setName("Ram");
	  e.setAddress("Pune");
	  
	  Company  c = new Company();
      c.addNewEmployee(e);
	  c.showData();
   }
}
