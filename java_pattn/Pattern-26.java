public class Pattern26
{
	public static void main(String[] args)
	{
		int rows = 5;
		int temp = 1;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}
