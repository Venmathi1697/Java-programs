package oct21_21;

public class Pt20 {
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int col=10;col>=row;col--)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(int row=1;row<=10;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
