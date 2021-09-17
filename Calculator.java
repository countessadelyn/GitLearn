package gitPractice;

import java.util.*;


public class Calculator {

	public static void main(String[] args) {
		
		int i, n, sum=0, num;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("How many Numbers do you what to Add? ");
        
        n = scan.nextInt();
      
        System.out.print("Enter " +n+ " numbers : ");
        
        scan.useDelimiter("[\\s,\r\n]+");
        
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            sum = sum + num;
        }
      
        System.out.print("Sum of all " +n+ " numbers is " +sum);
    }
}