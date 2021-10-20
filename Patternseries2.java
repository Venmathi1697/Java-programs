package oct20_21;

public class Patternseries2
{
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+ " ");
			}
			for(int col=1;col<=6-row;col++)
					{
				System.out.print("* "+" "+" ");
					}
			
			
			System.out.println();
		}
	}
}
