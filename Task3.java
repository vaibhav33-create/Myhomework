package assignment2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		String email="";
		int roll = 0,no;
		Scanner input = new Scanner(System.in);
		int[] vars = new int[3];

		 System.out.println("Enter number of students: ");
		 no = input.nextInt();
		
		 
		 for(int i=0;i<no;i++) {
			 System.out.println("Enter student name: ");
			 name = input.next();
			 System.out.println("Enter student email: ");
			 email = input.next();
			
		 }
		 System.out.println("Please enter which student details are you looking for: ");
		 no = input.nextInt();
		 
		 System.out.println(name+" "+email);

	}

}
