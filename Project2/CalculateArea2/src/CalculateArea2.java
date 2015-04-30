
public class CalculateArea2 
{

	public static void main(String[] args) 
	{
	double x =	CalculateCircleArea(3);
	System.out.println(x);
	x = CalculateRectangleArea(6, 7);
	System.out.println(x);
	}
	static double CalculateCircleArea(int radius)
	{
	return radius * radius * Math.PI;  
	}
	static double CalculateRectangleArea(int length, int breadth)
	{
	return length * breadth;
	}
}
