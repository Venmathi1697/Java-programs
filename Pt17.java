package oct21_21;

public class Pt17 {
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int hid =1;hid<=row;hid++)
			{
				System.out.print(" ");
			}
			for(int col=10;col>=row;col--)
			{
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
	}
}
