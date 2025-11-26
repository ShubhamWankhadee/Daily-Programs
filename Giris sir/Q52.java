/*
Q22. WAP to create POJO class name as Vehicle with field id, name and price and we have one
more class name as ShowRoom with two methods

void setVehicle(Vehicle vehicle): this method can accept Vehicle as parameter
void showVehicle(): this method can show the vehicle details



*/
	
class Vehicle{
	private int id;
	private String name;
	
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

}
class ShowRoom{
	Vehicle vehicle;
	void setVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	void showVehicle(){
		System.out.println("Vehicle Id   : "+vehicle.getId());
		System.out.println("Vehicle Name : "+vehicle.getName());
	}
}
public class Q52{

	public static void main(String args[]){
		Vehicle obj = new Vehicle();
		ShowRoom obj1 = new ShowRoom();
		obj.setId(54);
		obj.setName("Hunter");
		obj1.setVehicle(obj);
		obj1.showVehicle();
	
	}
}