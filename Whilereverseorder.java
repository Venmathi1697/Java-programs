package oct19_21;

public class Whilereverseorder {
	public static void main(String[] args)
	{
		int row=1;
		while(row<=5)
		{
			int col=5;
			while(col>=row)
			{
				System.out.print(col+" ");
				col--;
			}
			System.out.println();
			row++;
		}
	}
}
