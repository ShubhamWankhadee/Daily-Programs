/*
 Q23. WAP to create POJO class name as Student with field name, id and per and we have class
name as Dept with two methods
void setStudent(Student student): this method is used for accept student as parameter
void showStudent(): this method is used for show the student details.



*/
	
class Student{
	private int id;
	private String name;
	private float per;
	
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
	public void setPer(float per){
		this.per = per;
	}
	public float getPer(){
		return per;
	}

}
class Dept{
	Student student;
	public void setStudent(Student student){
		this.student = student;
	}
	void showStudent(){
		System.out.println("Student Id   : "+student.getId());
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student per : "+student.getPer());
	}
}
public class Q53{

	public static void main(String args[]){
		Student obj = new Student();
		Dept obj1 = new Dept();
		obj.setId(06);
		obj.setName("Shubham");
		obj.setPer(89.6f);
		obj1.setStudent(obj);
		obj1.showStudent();
	
	}
}