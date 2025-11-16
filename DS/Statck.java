// Statck

import java.util.*;
public class Stack{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int top= -1;
		
		do{
			System.out.println("1: PUSH \n 2: POP \n 3: DISPLAY \n 4: PEEK \n 5: SEACRCH \n 6: EXIT ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:	
						// push
						if(top == arr.lenght-1){
							System.out.println("Stack is Overflow");
						}else{
							top = top + 1;
							System.out.println("Enter the value is Statck");
							int value = sc.nextInt();
							arr[top] = value;
							System.out.println("Value Added Sucessfully!");
						}
						
						break;
				case 2:	
						// pop
						if(top == -1){
							System.out.println("Stack is Underflow");
						}else{
							int value = arr[top];
							System.out.println(" Deleted Value is"+value);
							top =top-1;
						}
						
						
						break;
				case 3:
						// DISPLAY
						
						if(top == -1){
							System.out.println("Stack is Underflow");
						
						}else{
							for(int i =top;i>=0;i--){
								System.out.println(arr[i]);
							}
						
						}
						break;
				case 4:
						// PEEK
						
						if(top == -1){
							System.out.println("Stack is Underflow");
							
						}else{
							int value = arr[top];
							System.out.println("Top Element in Stack is: "+value);
						}
						break;
				case 5:
						// SEACRCH
						System.out.println("Enter which Element you want to Search:");
						int value = sc.nextInt();
						for(int i=0;i<=arr[top];i++){
							if(value == arr[i]){
								index = i;
								break;
							}
						}
						if(index != -1){
							
							index = top-index;
							System.out.println("Value from top "+index);
						}else{
							System.out.println("Value is not found!");
						}
						break;
				case 6:
						System.exit(0);
						break;
				default:
						System.out.println("Wrong Choice!");
			}
		}while(true);
		
		
	}	
}