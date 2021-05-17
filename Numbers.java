package unitTest; 
 
import java.util.InputMismatchException;
 
import java.util.Scanner; 

public class Numbers {
	
	 public static void main(String[] args) {
		 int X = 0;
		 int Y = 0; 
		 
		 // This block reads the first number/integer as user input and throws the input mismatch exception if a wrong type is read 
		 // It also checks for negative numbers, zero and numbers greater than 100  
		 Scanner reader = new Scanner(System.in);  
		 try { 
			 System.out.print("Enter a number X:");  
			 X = reader.nextInt(); 
			 if(X < 0) 
				 System.out.println("X is a negative number! Positive number expected!"); 
			 if(X == 0)  
				 System.out.println("X is zero! Positive number expected!"); 
			 if(X > 100 )
				 System.out.println("X is greater than 100! Positive number between 0 and 101 expected!");
	         }catch(InputMismatchException e) { 
	        	 System.out.println("Wrong type! Integer expected! " + e);
	        	 System.exit(0); 
		 }	
		 //if the first number is correctly input, this block then reads the second number and throws the input mismatch exception for wrong types 
		 //It also checks for negative numbers, zero and numbers greater than 100 
		 if (X > 0 && X <= 100) { 
			 Scanner reader2 = new Scanner(System.in); 
		 	 	try { 
		 	 		System.out.print("Enter a number Y:");  
		 	 		Y = reader2.nextInt();	
		 	 		if(Y < 0) 
		 	 			System.out.println("Y is a negative number! Positive number expected!"); 
				    if(Y == 0)  
		 	 			System.out.println("Y is zero! Positive number expected!");
				    if(Y > 100 )
						System.out.println("Y is greater than 100! Positive number between 0 and 101 expected!"); 
		 	 		}catch(InputMismatchException e) { 
		 	 			System.out.println("Wrong type! Integer expected! " + e); 
		 	 			System.exit(0);			  
		 	 		}			  
		 	 	reader.close();
		 	 	reader2.close(); 
		 	 	System.out.println(" ");
		 	 	 
		 	 	// if the second number is also correct, then call the print method 
		 	 	if (Y > 0 && Y <= 100) { 
		 	 		Numbers number = new Numbers();
		 	 		number.print(X,Y);	
		 	 	} 
		 }  
	 }
//returns an integer which will be used for JUnit Testing	
//an object method is used to facilitate testing	  
	 public int print(int X, int Y)  {		 
		 
		//counts the number of times a number is not printed
		//to be used for unit testing  
		int count = 0; 
		for(int i =1; i<=100; i++) {  
			if(i % X == 0 && i % Y != 0) { 
				System.out.println("Umzugs");
				count++; 
			} else if(i % Y == 0 && i % X != 0) { 
				System.out.println("Auktion"); 
				count++; 
			} else if(i % X == 0 && i % Y == 0) { 
				System.out.println("UmzugsAuktion");
				count++; 
			} else {   
				System.out.println(i); 
			}
	     } 			  
	     return count; 		 
	} 
}
	 
	 
	 
	 
	  
	  
	 


