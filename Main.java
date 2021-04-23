// Jvdroid-main: java.until.*
import java.util.*;
class UserInputDemo {
public static void main(String[] args){
Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
	/*  this program tells your age group  */
	
	System.out.println("enter your age");
	
/* this is a int variable witch holds the age */
		int age = sc.nextInt();
	
		if(age < 10) {
			System.out.println("you are a kid");
		}
			if(age == 10) {
			System.out.println("you are a kid");
		}
		
		if(age < 9) {
			System.out.println("you are also a kid but you are older");
		}
		
		if(age > 12) {
			System.out.println("you are a teenager");
		}
		
		if(age > 18) {
			System.out.println("you are a adult");
		}

	}
}
