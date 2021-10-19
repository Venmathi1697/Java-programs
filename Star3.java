package oct19_21;

public class Star3 
{
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int col=10;col>=row;col--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
