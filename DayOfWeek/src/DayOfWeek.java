import java.util.Scanner;
//this imports the scanner so we can have the user insert information
public class DayOfWeek 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new day of the week.");
		String Day = scanner.next();
		//this part allows the scanner to input information
		System.out.println("I read this day of the week as " + Day);
		scanner.close();
		//this closes the scanner.
		
		DayOfWeek dayofweekEvaluator = new DayOfWeek ();
		dayofweekEvaluator.EvaluateDayOfWeek (Day);
	}
	
	void EvaluateDayOfWeekUsingSwitchStatement(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{
			String lowerCaseDayOfWeek = dayOfWeek.toLowerCase();
			System.out.println("I have changed this day to: " + lowerCaseDayOfWeek);

			switch(lowerCaseDayOfWeek)
			{
			case("monday"):
			case("tuesday"):
			case("wednesday"):
			case("thursday"):
			case("friday"):
			{
				System.out.println("It is a weekday, I have to go to work");
				break;
			}
			case("saturday"):
			case("sunday"):
			{
				System.out.println("it is the weekend Yay!!");
				break;
			}

			default:
			{
				System.out.println("this is the weekend");
			}
			}
		}
	}
	void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
			//This is a null check
		{
			if (dayOfWeek.equalsIgnoreCase("Saturday") 
				|| (dayOfWeek.equalsIgnoreCase("Sunday")))
				{
					System.out.println(dayOfWeek + " is the weekend!!");
					//This part of the code tells the user that it is the weekend
				}
			else if ((dayOfWeek.equalsIgnoreCase("monday") 
					|| dayOfWeek.equalsIgnoreCase("tuesday") 
					|| dayOfWeek.equalsIgnoreCase("wednesday")
					|| dayOfWeek.equalsIgnoreCase("thursday") 
					|| dayOfWeek.equalsIgnoreCase("friday")))
					{
					System.out.println(dayOfWeek + " is a weekday, I have to go back to work.");
					//this part says that it is a day, but that it is not the weekend
					}
			else 
			{
				System.out.println(dayOfWeek + " is not even a valid day");
				//This tells the user to enter a valid day
			}
		}
		
		else 
		{
			System.out.println("Please enter a day, not 'null'. Thank you!");
			// This tells the user to enter a valid day, not null.
		}
	}
}
