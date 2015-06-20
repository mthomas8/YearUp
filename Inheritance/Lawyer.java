
public class Lawyer extends Worker
{
	public Lawyer()
	{
	statements = "We won the case.";
	}
	public static void main(String[] args)
	{
		Lawyer James  = new Lawyer();
		James.DoWork();
	}
}