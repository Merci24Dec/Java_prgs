public class Test
{
	public static void main(String args[])
	{
		try
		{
		int a=20/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		}
	}
}