package epam_task3;

public class Operations {
	static int num1;
	static int num2;
	
	public void setOperands(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;	
	}
	
	public void addition() 
	{
		System.out.println(" Addition between the two numbers "+num1+" and "+num2+" is: "+(num1 + num2));
	}
	
	public void subtraction()
	{
		System.out.println(" Subtraction between the two numbers "+num1+" and "+num2+" is: "+(num1 - num2));
	}
	
	public void multiplication()
	{
		System.out.println(" Multiplication between the two numbers "+num1+" and "+num2+" is: "+(num1 * num2));
	}
	
	public void division()
	{
		try {
			System.out.println(" Division between the two numbers "+num1+" and "+num2+" is: "+(num1 / num2));
		}
		catch(Exception e)
		{
			System.out.println("Second Number cannot be 0");
		}
	}
}
