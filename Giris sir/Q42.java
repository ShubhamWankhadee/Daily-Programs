/*

Q11. WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after
sorting 




*/
 

class Sort{
      int ori[];
	 
	public void setValue(int ...no){
		 ori = no;
		
	}
	public void sort(){
		 for(int i=0;i<ori.length;i++){
			  for(int j=i+1;j<ori.length;j++){
					if(ori[i]> ori[j]){
						int temp = ori[i];
						ori[i] = ori[j];
						ori[j] = temp;
					
					}
				}
		 }
	}
	public void display(){
	System.out.println("Before  Sorting ");
		 for(int i=0;i<ori.length;i++){
			 System.out.print(" "+ori[i]);
		 }
	
	} 
}
public class Q42{

	public static void main(String args[]){
		 
		Sort obj = new Sort();
		obj.setValue(10,20,30,4,0,50,98,4,55,5,2,6);
		obj.display();
		 obj.sort();
		 obj.display();
		 
		 
	
	}
}