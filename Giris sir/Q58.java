/*

Q29. WAP to create POJO class name as Book with field id,name and authors and price and
arrange  all books in descending order by using price.
*/
import java.util.*;
class Book{
	private int id;
	private String name;
	private String author;
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
	public void setauthor(String author){
		this.author = author;
	}
	public String getauthor(){
		return author;
	}
	public void setPrise(int prise){
		this.prise = prise;
		
	}
	public int getPrise(){
		return prise;
	}
}
class Show{

	Book book[];
	public void setData(Book ...book){
		this.book = book;
	}
	public void showData(){
	
		System.out.println(" ");
		System.out.println("ID"+"		"+"Name"+"		"+"Author"+"		"+"Pirse");
		System.out.println(" ");
		
		// logic 
		
		for(int i=0;i<book.length;i++){
			for(int j=0;j<book.length;j++){
				if(book[j].getPrise() > book[i].getPrise() ){
					
					Book temp = book[j]; // class type array
					book[j] = book[i];
					book[i] = temp;
				}
			}
 		}
		for(int i=0;i<book.length;i++){
			System.out.println(book[i].getId()+"		"+book[i].getName()+"		"+book[i].getauthor()+"		"+book[i].getPrise());

		}
	}
	 
}
public class Q58{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Book bk[] = new Book[3];
		
		for(int i=0;i<bk.length;i++){
			bk[i] = new Book();
			System.out.println("Enter the Id ,Name ,Author Name & Prise"); 
			int id = sc.nextInt();
			String name = sc.next()+sc.nextLine();
			String author = sc.next()+sc.nextLine();
			int prise = sc.nextInt();
			
			bk[i].setId(id);
			bk[i].setName(name);
			bk[i].setauthor(author);
			bk[i].setPrise(prise);
			
		}
		Show obj2 = new Show();
		obj2.setData(bk);
		obj2.showData();
		
	}
}