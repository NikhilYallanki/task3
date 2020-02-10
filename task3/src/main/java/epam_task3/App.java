package epam_task3;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers in which the operations need to be performed: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt(); 
		Operations operations=new Operations(); 	
		operations.setOperands(num1, num2);
		System.out.println("Choose the operation need to  perform: ");
		
		System.out.println("1. Addition.\n2. Subtraction.\n3. Multiplication.\n4. Division.\n");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				operations.addition();
				break;
				
			case 2:
				operations.subtraction();
				break;
			
			case 3:
				operations.multiplication();
				break;
				
			case 4:
				operations.division();
				break;
			
			default:
				System.out.println("Choose operations from 1-4 only");
		}
	}
}
