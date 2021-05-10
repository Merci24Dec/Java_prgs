public class Pattern23
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}
	}
}
