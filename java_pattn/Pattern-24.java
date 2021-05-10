public class Pattern24
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++)
			{
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}
	}
}
