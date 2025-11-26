/*


Q21. WAP to create POJO class name as Book with field id,name and price and we have to
create one more class name as Library and Library class contain two methods
void setBook(Book book)
void showBook()


*/
 

class Book{
	private String Name;
	private int BookId;
	private float Prise;
	
	public void setName(String Name){
		this.Name = Name;
	}
	public String getName(){
		return Name;
	}
	public void setBookId(int BookId){
		this.BookId = BookId;
	}
	public int getBookId(){
		return BookId;
	}
	public void setPrise(float Prise){
		this.Prise = Prise;
	}
	public float getPrise(){
		return Prise;
	}
	 
}
class Library{
	Book bk;
	void setBook(Book bk){
		this.bk = bk;
	}
	void showBook(){
		String name = bk.getName();
		int bookid = bk.getBookId();
		float prise = bk.getPrise();
		
		System.out.println("Name   : "+name);
		System.out.println("BookId : "+bookid);
		System.out.println("Prise  : "+prise);
	
	}
}


public class Q51{

	public static void main(String args[]){
		Book obj1 = new Book();
		Library obj2 = new Library();
		
		obj1.setName("Shubham");
		obj1.setBookId(54);
		obj1.setPrise(564.50f);
		
		obj2.setBook(obj1);
		obj2.showBook();
 	
	}
}	