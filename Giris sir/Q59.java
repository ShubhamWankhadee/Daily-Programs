/*

Q30. WAP to create POJO class name as Player with field id,name and run and find player
detail whose run is second highest 

*/
import java.util.*;
class Player{

	private int id;
	private String name;
	private int run;
	
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
	public void setRun(int run){
		this.run = run;
		
	}
	public int getRun(){
		return run;
	}
}
class show{
	Player player[];
	public void setData(Player ...player){
		this.player = player;
		
	}
	public void showData(){
		
		// Secound Large
		int max=0;
		int smax =0;
		
		System.out.println(" ");
		System.out.println("ID"+"		"+"Name"+"		"+"Run");
		System.out.println(" ");
		for(int i=0;i<player.length;i++){
			System.out.println(player[i].getId()+"		"+player[i].getName()+"		"+player[i].getRun());

		}
		
		
		for(int i=0;i<player.length;i++){
			 if(player[max].getRun()<player[i].getRun()){
				smax = max;
				max = i;
			 
			 }else if(player[smax].getRun() < player[i].getId() && max != smax){
				smax = i;
			 }
 		}
		System.out.println(" ");
		System.out.println("Run is second highest Player is: ");
	    System.out.println(" ");
		System.out.println("ID"+"		"+"Name"+"		"+"Run");
		System.out.println(" ");
		
				System.out.println(player[smax].getId()+"		"+player[smax].getName()+"		"+player[smax].getRun());
			
		
	}
	
	
}
public class Q59{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Player py[] = new Player[3];
		
				
		for(int i=0;i<py.length;i++){
			System.out.println("Enter the Id ,Name & Run"); 
			py[i] = new Player();
			int id = sc.nextInt();
			String name =sc.next();
			int run = sc.nextInt();
			 
			py[i].setId(id);
			py[i].setName(name);
			py[i].setRun(run);
			 
		}
		show obj = new show();
		obj.setData(py);
		obj.showData();
		
	}
}