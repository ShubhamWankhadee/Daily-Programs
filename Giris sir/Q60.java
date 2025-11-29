/*

Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). 
Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. 
You practice object encapsulation (POJO) and multiple computations.


*/
import java.util.*;
class Student{
	private int rollNo;
	private String name;
	private int marks[];
	
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public int getRollNo(){
		return rollNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMarks(int marks[]){
		this.marks = marks;
		
	}
	
	public int[] getMarks(){
		return marks;
	}
}

class Calculate{
	Student stu[];
	
	public void getData(Student stu[]){
		this.stu = stu;
	}
	public void ShowData(){
		 
		
		for(int i=0;i<stu.length;i++){
		
			 
			System.out.println("RollNo :"+stu[i].getRollNo()+"\t"+"Name :"+stu[i].getName());
			
			for(int j=0;j<stu[i].getMarks();j++){
				
				System.out.println(" "+stu[i].getMarks[j]);
			}
			
		}
		
	}

	
	
}
public class Q60{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		Student obj[] = new Student[2];
	 
		
		
		
		for(int i=0;i<obj.length;i++ ){
			System.out.println("Enter id ,name and marks of three sub: ");
			 int rollno = sc.nextInt();
				String name =sc.next()+sc.nextLine();
				// for marks count
				int marks[] = new int[3];
				for(int j=0;j<marks.length;j++){
						marks[j] = sc.nextInt(); 
				}
			 
			 
			 obj[i]=new Student();
			 obj[i].setRollNo(rollno);
			 obj[i].setName(name);
			 obj[i].setMarks(marks);
		}
		Calculate obj2 = new Calculate();
		obj2.getData(obj);
		obj2.ShowData();
		
	
	}
}