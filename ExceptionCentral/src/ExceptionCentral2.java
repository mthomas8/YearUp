import java.util.Scanner;

public class ExceptionCentral2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		try{
			System.out.println("Enter your first number:");
			int number1 = input.nextInt();
			System.out.println("Enter second number:");
			int number2 = input.nextInt();
			int sum = number1/number2;
			System.out.println (sum);
		}
		catch(Exception e)
		{
			System.out.println("Cannot run this equation");
			e.printStackTrace();
		}
	}
}