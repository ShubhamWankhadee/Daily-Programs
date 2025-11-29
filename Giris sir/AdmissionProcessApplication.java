import java.util.*;
class Candidate //data store 
{ //bean standard  - class 
  private String name;
  private int id;
  private int fees;
  private boolean status;
  private boolean readyStatus;
  
  public  void  setId(int id)
  { this.id=id;
  }
  public int getId(){
   return id;
   }
  public void setName(String name)
  { this.name=name;
  }
  public String getName()
  {  return name;
  }
  public void setFees(int fees)
  { this.fees=fees;
  }
  public int getFees(){
   return fees;
  }
  public void setStatus(boolean status)
  { this.status=status;
  }
  public boolean isStatus()
  {  return status;
  }
  public void setReadyStatus(boolean readyStatus)
  {  this.readyStatus=readyStatus;
  }
  public boolean isReadyStatus(){
     return readyStatus;
  }
}
class AdmissionProcess
{
   private Candidate cand[];
   void sendToCounceller(Candidate ...cand)
   {  this.cand=cand;
   }
   void councelling(){
      boolean b=false;
	     
	do{
	   Scanner xyz  = new Scanner(System.in);
	  System.out.println("Enter your choice");
	  System.out.println("1:Follow up");
	  System.out.println("2:Exit");
	  int choice=xyz.nextInt();
	  xyz.nextLine();
	  switch(choice)
	  {
	    case 1:
	   System.out.println("Enter candidate name and id of candidate");
	   String name=xyz.nextLine();
	   int id=xyz.nextInt();
	   for(int i=0;i<cand.length;i++)
	   { 
	       if(cand[i].getName().equals(name) && cand[i].getId()==id)
		   { cand[i].setReadyStatus(true);
		     break;
		   } //10 - 5 readyStatus(true) - status=true 
	   }
	   break;
	   case 2:
	    b=true;
	   break;
	   default:
	    System.out.println("Wrong choice");
	  }
	  if(b)
	  { break;
	  }
	 }while(true);//infinite 
   }
   void admission()
   {
      for(int i=0;i<cand.length;i++)
	  {
	      if(cand[i].isReadyStatus())
		  {  cand[i].setFees(10000);
		     cand[i].setStatus(true);
		  }
	  }
   }
   void displayData(String loginType)
   {
       if(loginType.equals("admin"))
	   {
	      for(int i=0; i<cand.length; i++)
		  {
		    if(cand[i].isStatus())
			{
			System.out.println(cand[i].getId()+"\t"+cand[i].getName()+"\t"+cand[i].getFees());
			}
		  }
	   }
	   else if(loginType.equals("counceller"))
	   { for(int i=0; i<cand.length; i++)
		  {
		    if(!cand[i].isStatus())//if(true)
			{
			System.out.println(cand[i].getId()+"\t"+cand[i].getName()+"\t"+cand[i].getFees());
			}
		  }
	   }
	   else{
	     System.out.println("Invalid login");
	   }
   }
}
public class AdmissionProcessApplication
{
    public static void main(String x[])
	{
	   AdmissionProcess  ap = new  AdmissionProcess();
	   
	   Candidate c[]=new Candidate[5];// array of reference 
	   for(int i=0; i<c.length; i++)
	   { Scanner xyz  = new Scanner(System.in);
	     c[i]=new Candidate(); //array of object 
		 System.out.println("Enter name and id candidate");
		 String name=xyz.nextLine();
		 int id=xyz.nextInt();
		 c[i].setName(name);
		 c[i].setId(id);
		 c[i].setFees(0);
		 c[i].setReadyStatus(false);
		 c[i].setStatus(false);
	   }
	   
	   ap.sendToCounceller(c); //arry ...
	   ap.councelling();
	   ap.admission();
	   ap.displayData("admin");
	   
	}
}

