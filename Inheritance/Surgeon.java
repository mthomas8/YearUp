
public class Surgeon extends Worker
{
	public Surgeon()
	{
	statements = "I cut him.";
	}
	public static void main(String[] args)
	{
		Surgeon Danial  = new Surgeon();
		Danial.DoWork();
	}
}